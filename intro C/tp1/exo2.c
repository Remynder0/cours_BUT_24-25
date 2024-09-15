#include <stdio.h>

int verification(int x){
    if (x>0 && x%2==0 && x/100==0 && x>=10 && x%5!=0 ){
        return 1;
    }
    else return 0;
}

void test_verification(int x){
    if (verification(x)==0) printf("%d n'est pas verfie\n",x);
}

void boucle_verification(){
    int n=0;
    for (int i=-20; i<=100; i++){
        if (verification(i)){ 
        printf("%d ok\n",i);
        n++;
        }
    }
    printf("n = %d\n",n);
}

int main(){

    test_verification(10);
    test_verification(100);
    test_verification(0);
    test_verification(-56);
    test_verification(16);
    
    boucle_verification(0);

}