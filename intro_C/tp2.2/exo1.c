#include <stdio.h>
#include <stdlib.h>
# include <time.h>

int lance_un_de(){
	return (rand()%6)+1;
}

void lance_1000(){
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	
	for (int i=0; i < 1000 ;i++){
		int tmp=lance_un_de();
		if (tmp == 1) n1++;
		if (tmp == 2) n2++;
		if (tmp == 3) n3++;
		if (tmp == 4) n4++;
		if (tmp == 5) n5++;
		if (tmp == 6) n6++;
	}
	
	printf("1000 tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d\n",n1,n2,n3,n4,n5,n6);
}

void lance_x_fois(){
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;

	
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
	
	printf("%d tirages : \n1 : %d \n2 : %d \n3 : %d \n4 : %d \n5 : %d \n6 : %d\n",fois,n1,n2,n3,n4,n5,n6);
}

void lance_plus_grand(){
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;

	
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

	if (n6 > 0){
		printf("lancer le plus grand 6 %d",n6);
	}
	else if (n5 > 0){
		printf("lancer le plus grand 5 %d",n5);
	}
	else if (n4 > 0){
		printf("lancer le plus grand 4 %d",n4);
	}
	else if(n3 > 0){
		printf("lancer le plus grand 3 %d",n3);
	}
	else if (n2 > 0){
		printf("lancer le plus grand 2 %d",n2);
	}
	else if(n1 > 0){
		printf("lancer le plus grand 1 %d",n1);
	}
	printf("\n");
}

void somme_lance_plus_grand(){
	int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0;
	int max=0;
	int max_res;
	
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

	if (n6 >= max) {
		max=n6;
		max_res = 6;
	}
	if (n5 >= max) {
		max=n5;
		max_res = 5;
	}
	if (n4 >= max) {
		max=n4;
		max_res = 4;
	}
	if(n3 >= max) {
		max=n3;
		max_res = 3;
	}
	if (n2 >= max){
		max=n2;
		max_res = 2;
	}
	if (n1 >= max){
		max=n1;
		max_res = 1;
	}
	printf("somme lancer le plus grand %d %d\n",max_res,max);
}

void lance_sequence(){
	int max_seq=0;
	int seq=0;
	
	int fois;
	printf("entrer un nombre ");
	scanf("%d",&fois);

	int pre_lancer=lance_un_de();
	for (int i=1; i < fois ;i++){
		int lancer = lance_un_de();
		if(pre_lancer==lancer){
			seq++;
		}
		else if(max_seq <= seq) {
			max_seq=seq;
			seq=0;
		}
		else{
			seq=0;
		}
		//printf("pre_lancer = %d\nlancer = %d\n",pre_lancer,lancer);
		pre_lancer=lancer;
	}
	printf("sequence max = %d\n",max_seq);
}

int main(){
	srand(time(NULL));
	lance_1000();
	lance_x_fois();
	lance_plus_grand();
	somme_lance_plus_grand();
	lance_sequence();


	return 0;
}