#include <stdio.h>


int est_impair_positif(int nb){
    return nb%2!=0 && nb>=0;
}

void test_imppair_positif(){
    if(!est_impair_positif(1)){
        printf("erreur dans la fonction est_impair_positif\n");
    }
    if(est_impair_positif(2)){
        printf("erreur dans la fonction est_impair_positif\n");
    }
    if(est_impair_positif(-4)){
        printf("erreur dans la fonction est_impair_positif\n");
    }
}

int saisir_nombre(){
    int nb;
    printf("saisie un nombre : ");
    scanf("%d",&nb);
    return nb;
}

int saisir_impair_0_100(){
    int nb = saisir_nombre();
    while(!est_impair_positif(nb) && nb<=100){

        printf("saisie invalide\n");
        nb= saisir_nombre();
    }
    return nb;
}













int main(){

    test_imppair_positif();
    saisir_impair_0_100();
    return 0;
}