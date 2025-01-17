#include <stdio.h>

int au_carre(int x){
    return x*x;
}

int pair( int x){
    while(x%2!=0){
        x--;
    }
    return x;
}

void test_pair(int x){
    if(x%2!=0){
        printf("ce nombre n'est pas pair\n");
    }
}

double difference(double a, double b){
    if (a<b){
        return b-a;
    }
    return a-b;
}


int main(){

    printf("========= Question1 =================\n");
    printf("%d\n",au_carre(72));
    printf("========= Question2 =================\n");
    printf("%d\n",pair(20));
    printf("========= Question3 =================\n");
    test_pair(-551);
    test_pair(0);
    printf("========= Question4 =================\n");
    printf("%f\n", difference(5.65,48.161));
    
    return 0;
}
