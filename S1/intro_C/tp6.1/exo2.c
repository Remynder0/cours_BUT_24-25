#include <stdio.h>

int fibonnacci(int n){
    int tab[n-1];
    tab[0] = 0;
    tab[1] = 1;
    tab[2] = 1;

    for(int i= 0; i<=n; i++){
        printf("%d ", tab[i]);
    }
    printf("\n");


    for(int i= 3; i<=n ; i++){
        tab[i] = tab[i-1]+tab[i-2];
    }

    for(int i= 0; i<=n; i++){
        printf("%d ", tab[i]);
    }
    printf("\n");

    return tab[n];
}

int main(){

    printf("%d\n", fibonnacci(10));
    
    return 0;
}