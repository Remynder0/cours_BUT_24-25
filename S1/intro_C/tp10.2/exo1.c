#include <stdio.h>
#include <stdlib.h>
#include "ppm.h"

void rectangle_gris(struct image *img)
{
  for (int l = img->nb_lig / 2.5; l < (img->nb_lig / 2.5) + 30; l++)
  {
    for (int c = img->nb_col / 6; c < (img->nb_col / 6) * 5; c++)
    {
      struct pixel pix = get_pixel(*img, l, c);
      pix.rouge = 127;
      pix.vert = 127;
      pix.bleu = 127;
      put_pixel(img, pix, l, c);
    }
  }
}

void degrade(struct image *img)
{

  for (int l = 0; l < img->nb_lig; l++)
  {
    for (float c = 0; c < img->nb_col; c++)
    {
      struct pixel pix = get_pixel(*img, l, c);
      printf(" /%f/ ", c * 100 / 500);
      pix.rouge = ((500-c) * 100 / 500) * 255 / 100;
      pix.vert = ((500-c) * 100 / 500) * 255 / 100;
      pix.bleu = ((500-c) * 100 / 500) * 255 / 100;
      put_pixel(img, pix, l, c);
    }
  }
}

int main()
{
  struct image img;
  img = lire_image("FleurRVB.ppm");
  rectangle_gris(&img);
  ecrire_image(img, "rectangle.ppm");
  detruire_image(&img);

  struct image img2 = creer_image_vide(300, 500, 255);
  degrade(&img2);
  rectangle_gris(&img2);
  ecrire_image(img2, "degrade.ppm");
  detruire_image(&img2);

  return 0;
}
