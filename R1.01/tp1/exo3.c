#include <stdio.h>

int max2(int a, int b){
    if (a < b) return b; else return a;
}

void test_max(){
    printf("%d\n%d\n",max2(5,9),max2(-9,9));
}

int median(int a, int b, int c){
    if (a >= b && c <= b) return b;
    else if (a >= c ) return a;
    else if (b <= c) return b;
    else return c;
}

void test_median(){
    printf("1 %d\n",median(5,8,9));
    printf("2 %d\n",median(10,8,5));
    printf("3 %d\n",median(5,9,8));
    printf("4 %d\n",median(1,5,5));
    printf("5 %d\n",median(0,-9,5));

}



int main(){

    test_max();
    test_median();


    return 0;
}