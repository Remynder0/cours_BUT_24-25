#include <stdio.h>

void etoile_croix(int n){
    for(int i=0; i<n+1; i++){
        for (int j=0; j<n+1; j++){
            if(i!=0){
                if (i==j) printf("*");
                else if(i+j==n+1) printf("*");
                else printf(" ");
            }
        }
        printf("\n");
    }
    printf("\n");
}

void etoile_pyramide(int n){


    for(int i=0; i<=n; i++){
        for (int j=0; j<n*2; j++){
           if (j+i==n){
            for (int k=0; k<i; k++){
                printf("*");
            }
            printf("*");
            for (int k=0; k<i; k++){
                printf("*");
            }
            
            
           } 

           else printf(" ");
   
        }

        printf("\n");
    }



}















int main(){




    etoile_croix(4);
    etoile_pyramide(4);




    return 0;
}





