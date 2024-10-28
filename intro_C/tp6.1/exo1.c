#include <stdio.h>
#include <stdlib.h>

void affiche_tableau(int tab[], int taille){
    
    for(int i= 0; i<taille; i++){
        printf("%d ", tab[i]);
    }
    printf("\n");
}

void saisir_valeur(int tab[], int taille){
    int temp = 0;

    for(int i= 0; i<taille; i++){
        scanf("%d",&temp);
        tab[i] = temp;
    }


    for(int i= 0; i<taille; i++){
        printf("%d ", tab[i]);
    }
    printf("\n");
}

void remplit_aleatoirement(int tab[], int taille){
    int temp = 0;

    for(int i= 0; i<taille; i++){
        temp = (rand()%1000)+1;
        tab[i] = temp;
    }


    for(int i= 0; i<taille; i++){
        printf("%d ", tab[i]);
    }
    printf("\n");
}

int plus_grande_valeur(int tab[], int taille){
    int max = 0;

    for(int i= 0; i<taille; i++){
        if (tab[i]>max) max = tab[i];
    }

    return max;
}

int recherche(int tab[], int taille, int n){

    for(int i= 0; i<taille; i++){
        if (tab[i]==n) return 1;
    }

    return 0;
}

int sup_10(int tab[], int taille){
    int sup = 0;

    for(int i= 0; i<taille; i++){
        if (tab[i]>=10) sup++;
    }

    return sup;
}

int croissant(int tab[], int taille){
    
    for(int i= 0; i<taille - 1; i++){
        if (tab[i]>tab[i+1]) return 0;
    }

    return 1;
}

int somme_tab(int tab[], int taille){
    int somme = 0;

    for(int i= 0; i<taille; i++){
        somme+=tab[i];
    }

    return somme;
}

int main(){

    int tab[10] = {5,6,8,9,10,42,85,226,255,355};
    /*affiche_tableau(tab, 10);
    saisir_valeur(tab, 10);
    remplit_aleatoirement(tab, 10);
    printf("%d\n",plus_grande_valeur(tab, 10));*/
    printf("%d\n",recherche(tab, 10,-5));
    printf("%d\n",sup_10(tab,10));
    printf("%d\n",croissant(tab,10));
    printf("%d\n",somme_tab(tab,10));

    printf("\n");
    return 0;
}