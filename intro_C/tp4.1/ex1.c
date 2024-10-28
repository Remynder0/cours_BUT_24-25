#include <stdio.h>

void echange(int *a, int *b) {
    int tmp;
    tmp = *a;
    *a = *b;
    *b = tmp;
}

int main() {
    int a,b;
    
    a= 16; b=4;
    printf("avant echange a=%d b=%d\n",a,b);
    echange(&a,&b);
    printf("après echange a=%d b=%d\n",a,b);
}