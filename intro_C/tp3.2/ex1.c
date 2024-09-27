#include <stdio.h>

int est_triplet(int a, int b, int c){

    return a*a + b*b == c*c;

}

void test_triplet(){


    if (!(est_triplet(3,4,5))) printf("ko : réponse eronee de est_triplet sur l'entree 3,4,5\n");
    else if (!(est_triplet(63,16,65))) printf("ko : réponse eronee de est_triplet sur l'entree 63,16,65\n");
    else if (est_triplet(36,77,84)) printf("ko : réponse eronee de est_triplet sur l'entree 36,77,84\n");

    else printf("ok: test de la fonction est_triplet réussit\n");

}

void triplet_n(int n){
    for (int i=0; i<n; i++){
        //printf("ok");
        if (est_triplet(i,i+1,i+2)){
            printf("(%d,%d,%d) ",i,i+1,i+2);
        }
    }
    printf("\n");
}













int main(){



    test_triplet();
    //printf("%d",est_triplet(6,8,10));
    triplet_n(19);


    return 0;
}





