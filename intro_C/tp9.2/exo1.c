#include <stdio.h>
#include <stdlib.h>
#include "ppm.h"


void filtre_rouge(struct image *img){
  for(int l = 0; l < img->nb_lig; l++){
    for(int c = 0; c < img->nb_col; c++){
      struct pixel pix = get_pixel(*img, l, c);
      pix.vert = 0;
      pix.bleu = 0;
      put_pixel(img, pix, l, c);
    }
  }
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

void rectangle(struct image *img, int l1, int c1, int l2, int c2){
  for(int l = l1; l <= l2; l++) { 
    for(int c = c1; c <= c2; c++) { 
      struct pixel pix = get_pixel(*img, l, c); 
      pix.rouge = 250; 
      pix.vert = 250; 
      pix.bleu = 250; 
      put_pixel(img, pix, l, c); 
    } 
  }
}

int main(){

  struct image img_rouge;
  img_rouge = lire_image("FleurRVB.ppm");
  filtre_rouge(& img_rouge);
  ecrire_image(img_rouge, "filtre_rouge.ppm");
  detruire_image(& img_rouge);

  struct image img_gris;
  img_gris = lire_image("FleurRVB.ppm");
  niveaux_gris(& img_gris);
  ecrire_image(img_gris, "gris.ppm");
  detruire_image(& img_gris);

  struct image rect;
  rect = lire_image("FleurRVB.ppm");
  rectangle(& rect, 20, 80, 120, 180);
  ecrire_image(rect, "rect.ppm");
  detruire_image(& rect);


  return 0;
}
