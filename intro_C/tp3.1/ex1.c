#include <stdio.h>

void etoile_carree(int n){
    for(int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            printf("*");
        }
        printf("\n");
    }
}

void etoile_triangle(int n){
    for(int i=0; i<n; i++){
        for (int j=0; j<i; j++){
            printf("*");
        }
        printf("\n");
    }
}

void etoile_triangle_alenvers(int n){
    for(int i=0; i<n; i++){
        for (int j=i; j<n; j++){
            printf("*");
        }
        printf("\n");
    }
}















int main(){




    etoile_carree(5);
    etoile_triangle(5);
    printf("--------------\n");
    etoile_triangle_alenvers(6);



    return 0;
}





