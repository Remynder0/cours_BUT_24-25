#include <stdio.h>
#include "pile.h"

int verifie_expression_1(char chaine[]){
	int n=0;
	int comp=0;
	while( chaine[n]!='\0' && comp>=0){
		if(chaine[n]=='(') comp++;
		if(chaine[n]==')') comp--;
		n++;
	}
	return comp==0;
}

int verifie_expression_2(char chaine[]){
	int n=0;
	pile_s pile;
	while( chaine[n]!='\0'){
		if(chaine[n]=='(') empile(&pile,chaine[n]);
        if(chaine[n]==')' && est_vide(pile)) return false;
		if(chaine[n]==')' && !est_vide(pile)) depile(&pile);
        affiche(pile);
		n++;
	}
	return est_vide(pile);
}



int main(){


    printf("%d\n",verifie_expression_2("((a + b) * (c + d))"));
    printf("%d\n",verifie_expression_2("“((a)(()))”"));
    printf("%d\n",verifie_expression_2("et “()”"));

    printf("%d\n",verifie_expression_2("“((a + b) * (c + d)”,"));
    printf("%d ko\n",verifie_expression_2("(a+b))"));
    printf("%d\n",verifie_expression_2("“)(””"));










    return 0;
}