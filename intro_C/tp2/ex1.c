#include <stdio.h>

void affiche_nombres(int n){
	printf("%d :",n);
	int i=1;
	while (i <= n){
		printf(" %d",i);
	i++;
	}
	printf("\n");
}

void affiche_nombres_decroissant(int n){
        printf("%d :",n);
        int i=n;
        while (i >= 1){
                printf(" %d",i);
        i--;
        }
        printf("\n");
}


void affiche_carres(int n){
	int carre=1;
	int i=1;
	while(carre <= n){
		printf("%d ",carre);
		i++;
		carre = i*i;
	}
	printf("\n");
}

void affiche_carres_entre(int n, int m){
        int carre=1;
        int i=1;
        while(carre <= m){
               if(carre >= n){
			 printf("%d ",carre);
                }
		i++;
                carre = i*i;
        }
        printf("\n");
}

void saisie_valeur(){

	int saisie;
	printf("saisissez une valeur :");
	scanf("%d",&saisie);

	while( (saisie < 0) || (3 < saisie) ){

		printf("saisissez une valeur :");
        	scanf("%d",&saisie);

	}

}

int main(){

	affiche_nombres(5);
	affiche_nombres_decroissant(5);
	affiche_carres(30);
	affiche_carres_entre(7,40);
	saisie_valeur();

	return 0;
}
