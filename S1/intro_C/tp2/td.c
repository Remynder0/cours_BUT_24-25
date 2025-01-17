#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int lance_un_de(){
	return (rand()%6)+1;
}

void lance_1000(){
	int n1,n2,n3,n4,n5,n6;
	n1=n2=n3=n4=n5=n6;

	for (int i=0; i < 1000 ;i++){
		int tmp=lance_un_de();
		if (tmp == 1) n1++;
		if (tmp == 2) n2++;
		if (tmp == 3) n3++;
		if (tmp == 4) n4++;
		if (tmp == 5) n5++;
		if (tmp == 6) n6++;
	}

	printf("1000 tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d",n1,n2,n3,n4,n5,n6);
}

void lance_x_fois(){
	int n1,n2,n3,n4,n5,n6;
	n1=n2=n3=n4=n5=n6;

	int fois;
	printf("entrer un nombre ");
	scanf("%d",&fois);

	for (int i=0; i < fois ;i++){
		int tmp=lance_un_de();
		if (tmp == 1) n1++;
		if (tmp == 2) n2++;
		if (tmp == 3) n3++;
		if (tmp == 4) n4++;
		if (tmp == 5) n5++;
		if (tmp == 6) n6++;
	}

	printf("%d tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d",fois,n1,n2,n3,n4,n5,n6);
}


void dessin_carre(int n){
	for (int i=0; i<n ;i++){
		for (int j=0; j<n ;j++){
			printf("*");
		}
		printf("\n");
	}
}

void dessin_cosinus(int n){
	int x;
        for (int i=0; i<n ;i++){
		int de = lance_un_de();
		printf("%d",de);
		/*x = cos(de)*10;
		printf("%d",x);
                for (int j=0; j<x ;j++){
                        printf("*");
                }
                printf("\n")*/;
        }
}



int main(){
	srand(2);
	//lance_1000();
	dessin_cosinus(5);
	int x = cos(5)*10;
	printf("%d\n",x);
	return 0;
}
