#include <stdio.h>
#include <stdlib.h>
#include "ppm.h"

struct image_pgm
{
  int nb_lig;
  int nb_col;
  int *pixels;
};

struct image_pgm lire_image_pgm(const char *nom_fichier)
{
  FILE *f = fopen(nom_fichier, "r");
  if (!f)
  {
    fprintf(stderr, "Erreur d'ouverture du fichier %s\n", nom_fichier);
    exit(1);
  }
  struct image_pgm img;
  fscanf(f, "P2\n%d %d\n255\n", &img.nb_col, &img.nb_lig);
  img.pixels = malloc(img.nb_lig * img.nb_col * sizeof(int));
  for (int i = 0; i < img.nb_lig; i++)
  {
    for (int j = 0; j < img.nb_col; j++)
    {
      fscanf(f, "%d", &img.pixels[i * img.nb_col + j]);
    }
  }
  fclose(f);
  return img;
}

void ecrire_image_pgm(struct image_pgm img, const char *nom_fichier)
{
  FILE *f = fopen(nom_fichier, "w");
  if (!f)
  {
    fprintf(stderr, "Erreur d'ouverture du fichier %s\n", nom_fichier);
    exit(1);
  }
  fprintf(f, "P2\n%d %d\n255\n", img.nb_col, img.nb_lig);
  for (int i = 0; i < img.nb_lig; i++)
  {
    for (int j = 0; j < img.nb_col; j++)
    {
      fprintf(f, "%d ", img.pixels[i * img.nb_col + j]);
    }
    fprintf(f, "\n");
  }
  fclose(f);
}

void niveaux_gris(struct image *img){
  for(int l = 0; l < img->nb_lig; l++){
    for(int c = 0; c < img->nb_col; c++){
      struct pixel pix = get_pixel(*img, l, c);
      int gris = 0.3 * pix.rouge + 0.59 * pix.vert + 0.11 * pix.bleu;
      pix.rouge = gris;
      pix.vert = gris;
      pix.bleu = gris;
      put_pixel(img, pix, l, c);
    }
  }
}


void detruire_image_pgm(struct image_pgm *img)
{
  free(img->pixels);
  img->pixels = NULL;
  img->nb_lig = 0;
  img->nb_col = 0;
}

int main()
{
  struct image_pgm img;
  img = lire_image_pgm("gris.ppm");
  ecrire_image_pgm(img, "gris.pgm");
  detruire_image_pgm(&img);

  return 0;
}
