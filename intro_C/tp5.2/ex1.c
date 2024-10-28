#include <stdio.h>
#include "canvas.h"

#ifndef __CANVAS__
#define __CANVAS__

typedef struct canvas_t* canvas;

// creation d'une surface de dessin de dimension dim 
canvas create_canvas(unsigned int dim); 

// la fonction set positionne un caractère à la positioon col, lig
void set(canvas c, int col, int lig, char caractere);

// la fonction get retourne le caractère à la positioon col, lig 
char get(canvas c, int col, int lig);

// la fonction get_size retourne la dimensioon de la surface de dessin 
int get_size(canvas); extendedchars extendedchars

 // plot affiche la surface de dessin sur le terminal. 
void plot(canvas c); 

#endif


void damier(){

    int taille = 8;

    canvas c=create_canvas(taille);

    for(int i=0; i<taille; i++){
            for (int j=0; j<taille; j++){
                if (i%2==0){
                    if(j%2==0) set(c, i, j,' ');
                    
                    else set(c, i, j,'X');
                }

                else{
                    if(j%2==0) set(c, i, j,'X');
                    
                    else set(c, i, j,' ');
                }    
            }
    }
   
    plot(c);
}

void damier64(){

    int taille = 63;
    canvas c=create_canvas(taille);

    for(int i=0; i<taille; i++){
            for (int j=0; j<taille; j++){
                if (i%2==0){
                    if(j%2==0) set(c, i, j,' ');
                    
                    else set(c, i, j,'X');
                }

                else{
                    if(j%2==0) set(c, i, j,'X');
                    
                    else set(c, i, j,' ');
                }    
            }
    }
   
    plot(c);
}

void dagionale(){

    int taille = 8;
    canvas c=create_canvas(taille);

    for(int i=0; i<taille; i++){
            for (int j=0; j<taille; j++){
                if (i==j) set(c, i, j,'X');
                       
            }
    }
   
    plot(c);
}

void dagionale_inverse(){

    int taille = 8;
    canvas c=create_canvas(taille);

    for(int i=0; i<taille; i++){
            for (int j=0; j<taille; j++){
                if (i==taille-j-1) set(c, i, j,'X');
                       
            }
    }
   
    plot(c);
}

void un_carre(canvas c,int cote ,int column, int line){

    for(int i=line; i<cote; i++){
            for (int j=column; j<cote; j++){
                if(i==line || j==column || i==cote-1 || j==cote-1) set(c, i, j,'X');
                       
            }
    }
   
    plot(c);
}

void vortex_carre(){

    canvas c=create_canvas(16);
    
    for(int i=0; i<16; i+=2){
        un_carre(c,16-i,i,i);
    }

    
   
    plot(c);
}







int main(){



    damier();

    damier64();

    dagionale();

    dagionale_inverse();

    un_carre(create_canvas(8),5,0,0);

    vortex_carre();







    return 0;
}