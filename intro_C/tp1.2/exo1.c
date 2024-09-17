#include <stdio.h>

void affiche_nombres(int n){
    printf("%d: ", n);
    for (int i = 1; i <= n; i++){
        printf("%d ", i);
    }
    printf("\n");
}


void affiche_nombres_pairs(int n){
    for (int i = 0; i <= n; i+=2){
        printf("%d ", i);
    }
    printf("\n");

}

void affiche_nombres_decroissants(int n){
    for (int i = n; i > 0; i--){
        printf("%d ", i);
    }
    printf("\n");

}


int main(){

    printf("Q1)\n");
    affiche_nombres(5);
    affiche_nombres(8);
    affiche_nombres(1);
    affiche_nombres(0);
    affiche_nombres(-5);
    
    printf("Q2)\n");
    affiche_nombres_pairs(6);
    affiche_nombres_pairs(8);
    affiche_nombres_pairs(9);
    affiche_nombres_pairs(-5);
    
    printf("Q3)\n");
    affiche_nombres_decroissants(6);
    affiche_nombres_decroissants(8);
    affiche_nombres_decroissants(9);
    affiche_nombres_decroissants(-5);
    
    
    return 0;
}