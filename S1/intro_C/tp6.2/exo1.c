#include <stdio.h>


int sont_valeur_positives(int tab[], int taille){
    for (int i=0; i<taille; i++){
        if(tab[i]<0) return 0;
    }
    return 1;
}

int compte_nombre_avant_moins1(int tab[], int taille){
    for (int i=0; i<taille; i++){
        if(tab[i]==-1) return i+1;
    }
    return -1;
}


int main(){

    int tab[] = {0,1,2,3,4,5,-1,7};
    printf("%d\n",sont_valeur_positives(tab,8));
    printf("%d\n",compte_nombre_avant_moins1(tab,8));


    return 0;
}