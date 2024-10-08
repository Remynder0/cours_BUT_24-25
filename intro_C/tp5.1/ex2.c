#include <stdio.h>


struct date {
    int jour;
    int mois;
    int annee;
};


struct date cree_date(int j, int m, int a){
    struct date jour = {j,m,a};
    return jour;
}


void affiche_date(struct date duJour){
    printf(" %02d / %02d / %d \n",duJour.jour,duJour.mois,duJour.annee);
}

int meme_date(struct date d1, struct date d2){
    return(d1.jour == d2.jour && d1.mois == d2.mois && d1.annee == d2.annee);
}

int nombre_jour_mois(int m, int a){
    if (m%2 == 0 || m==7) return 31;
    else if ((m==2) && ((a%4==0 && a%100!=0) || a%400==0)) return 29;
    else if (m==2) return 28;
    else return 30;
}

//marche pas
int date_valide(struct date d){
    if (d.jour>=1 && d.jour<=31)
        if (d.mois<= 12 && d.mois>= 1) 
            if(d.mois==2 && d.jour<=29) 
                if(d.mois==7 && d.jour<=31) return 1;;;;
            
    if ((d.mois%2==0 && d.jour<=30) || (d.mois%2!=0 && d.jour<=31)) return 1;
    

    
    return 0;
}


int main(){


    struct date j = cree_date(5,8,2028);

    affiche_date(j);
    printf("%d\n",meme_date(j,j));
    printf("%d\n",meme_date(j,cree_date(8,5,2028)));
    printf("%d\n",meme_date(j,cree_date(5,5,2028)));

    printf("%d\n",date_valide(cree_date(30,2,2028)));
    printf("%d\n",date_valide(cree_date(31,7,2028)));


    return 0;
}