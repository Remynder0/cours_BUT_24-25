#include <stdio.h>





void saisie_def(){
    int nb;
    int val;
    int max=0;
    int i_max=0;

    printf("nombre de valeurs a saisir ");
    scanf("%d",&nb);

    for(int i=0; i<nb; i++){
        printf("val %d :",i+1);
        scanf("%d",&val);

        if(val >= max){
            max = val;
            i_max = i+1;
        }
    }
    printf("La plus grande valeur est %d, c'est la %d ème valeur de la suite",max,i_max);
}

void saisie_indef(){
    int val;
    int i=0;
    int max=0;
    int i_max=0;

    printf("saisissez des nombres positifs (nombre degatif pour arretez la saisie) \n");

    while(val>0){
        printf("val %d :",i+1);
        scanf("%d",&val);

        if(val >= max){
            max = val;
            i_max = i+1;
        }
        i++;
    }
    printf("La plus grande valeur est %d, c'est la %d ème valeur de la suite\n",max,i_max);
}









int main(){


    //saisie_def();
    saisie_indef();



    return 0;
}