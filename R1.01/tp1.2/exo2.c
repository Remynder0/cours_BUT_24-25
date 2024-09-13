#include <stdio.h>

int factoriel(int n){
    int fact = 1;
    for (int i = 1; i <= n; i++){
        fact = fact*i;
    }
    return fact;
}

int somme_impairs(int n){
    int somme = 0;
    for (int i = 1; i < n; i+=2){
        somme = somme + i;
    }
    return somme;
}

int main(){

    printf("%d\n",factoriel(10));
    printf("%d\n",somme_impairs(6));
   
    
    
    return 0;
}