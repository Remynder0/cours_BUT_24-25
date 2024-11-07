#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define TAILLE_MAX_TABLEAU 500000




void affiche(int tab[], int taille){
    for (int i=0; i<taille ;i++){
        printf("%d ",tab[i]);
    }
    printf("\n");
}


void recopie(int tab1[], int tab2[], int taille){
    for (int i=0; i<taille ;i++){
        tab2[i] = tab1[i];
    }

}

void remplir_aleatoirement(int tab[], int taille){
    for (int i=0; i<taille ;i++){
        tab[i] = rand()%1000;
    }

}

int non_trie(int tab[], int n) {
    for(int i = 0; i<n-1 ; i++){
        if(tab[i]>tab[i+1]){
            return 1;
        }
    }
    return 0;
}

void passage_bulle(int tab[], int n) {
    int temp;
    while(non_trie(tab, n)){
        for (int i = 0; i < n - 1; i++){
            if (tab[i]>=tab[i+1]){
                temp = tab[i];
                tab[i]=tab[i+1];
                tab[i+1]=temp;
            }        
        }
    //affiche(tab, TAILLE_MAX_TABLEAU);

    }
}





int main(){
    srand(5);

    int tab1[TAILLE_MAX_TABLEAU]={2,2,2,2,2,2};
    int tab2[TAILLE_MAX_TABLEAU]={3,3,3,3,3,3,3,3};

    affiche(tab1, TAILLE_MAX_TABLEAU);
    affiche(tab2, TAILLE_MAX_TABLEAU);


    recopie(tab1, tab2, TAILLE_MAX_TABLEAU);
    affiche(tab2, TAILLE_MAX_TABLEAU);

    remplir_aleatoirement(tab1,TAILLE_MAX_TABLEAU);
    affiche(tab1, TAILLE_MAX_TABLEAU);


    clock_t temps_initial,
    temps_final;
    double temps_exec;
    temps_initial = clock();
    
    passage_bulle(tab1,TAILLE_MAX_TABLEAU);

    affiche(tab1, TAILLE_MAX_TABLEAU);

    temps_final = clock();
    temps_exec =(temps_final - temps_initial) *1e-6;
    printf("temps dexecution %e\n",temps_exec);

    
    return 0;
}