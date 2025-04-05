#include <stdio.h>

int fonc1 ( int x ) {
    int y = 0 ;
    x = x + 1 ;
    y = y + 1 ;
    printf ( " fonction fonc1 , x = %d,\t y = %d\n", x, y ) ;
    return y ;
    }

int main ( ) {
    int a = 1 ;
    int b = 2 ;
    int c = 3 ;
    a = fonc1 ( a ) ;
    b = fonc1 ( b ) ;
    c = fonc1 ( c ) ;
    printf ( " main , a = %d,\t b = %d,\t c = %d\n", a, b, c ) ;
    return 0 ;
    }