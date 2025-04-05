#include <stdio.h>
void swap(int x, int y) {
int z;
z=x;
x=y;
y=z;
printf("valeur après permutation dans la fonction swap :\n");
printf("x = %d\t y = %d\n",x,y);
}
int main(){
int x,y;
printf("Entrez deux valeurs pour la permutation\nx = ");
scanf("%d",&x);
printf("y = ");
scanf("%d",&y);
swap(x,y);
printf("valeur après l'appel à la fonction swap :\n");
printf("x = %d\t y = %d\n",x,y);
}
