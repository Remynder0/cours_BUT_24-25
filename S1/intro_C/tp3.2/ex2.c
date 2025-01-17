#include <stdio.h>
#define MAX_DOMINO 6


void affiche_domino(){
    for (int i=0; i<=MAX_DOMINO; i++){
        for (int j=0; j<=MAX_DOMINO; j++){
            printf("[%d, %d]",i,j);
        }
        printf("\n");
    }
    printf("\n");
}

void affiche_domino_sans_doublons(){
    for (int i=0; i<MAX_DOMINO; i++){
        for (int j=0; j<=MAX_DOMINO; j++){
            printf("[%d, %d]",i,j);
        }
        
        printf("\n");
    }
    printf("[%d, %d]\n",6,6);
}


void affiche_domino_egal_a(int total){
    for (int i=0; i<=MAX_DOMINO; i++){
        for (int j=0; j<=MAX_DOMINO; j++){
            if ((i>3 || j>3) && i+j==total) printf("[%d, %d]",i,j);
        }
        printf("\n");
    }
    printf("\n");
}



int total_dominos(int somme);




int main(){



    affiche_domino();
    affiche_domino_sans_doublons();
    affiche_domino_egal_a(6);

    return 0;
}





