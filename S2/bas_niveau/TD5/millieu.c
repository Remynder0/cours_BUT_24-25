#include <stdio.h>
void saisieXY(float* x,float* y) {
printf("Entrez le premier reel : ");
scanf("%f", x);
printf("Entrez le second reel : ");
scanf("%f", y);
}
void milieu(float xp1,float yp1,float xp2,float yp2,float* xpM,float* ypM)
{
    if(xp1>xp2) swap( xp1, xp2);
    *xpM=xp1+(xp2-xp1)/2;

    if(yp1>yp2) swap( yp1, yp2);
    *ypM=yp1+(yp2-yp1)/2;
    }
int main() {
float xP1,yP1,xP2,yP2,xM,yM;
printf("Entrez les coordonnees x,y du point P1 :\n");
saisieXY( &xP1, &yP1);
printf("Entrez les coordonnees x,y du point P2 :\n");
saisieXY( &xP2, &yP2);
milieu(xP1,yP1,xP2,yP2, &xM, &yM);
printf("Les coordonnees du point milieu sont :\n");
printf("xM = %f\t yM = %f\n",xM,yM);
}