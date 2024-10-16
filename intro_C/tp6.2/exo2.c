#include <stdio.h>
#include <stdlib.h>


int demande_joueur(int nb_allu){
    
    int nb_saisie = 0;
    printf("Saisir un nombre parmi 1, 2 ou 3 : ");
    scanf("%d",&nb_saisie);

    while (nb_saisie > nb_allu || (nb_saisie != 3 && nb_saisie != 2 && nb_saisie != 1))
    {
        printf("nombre saisie invalide : ");
        scanf("%d",&nb_saisie);
    }
    return nb_saisie;
}

int bot_idiot(int nb_allu){
    if (nb_allu<=3) return nb_allu;
    else return rand()%3 +1;
    
}

int super_bot(int nb_allu){
    if (nb_allu<=3) return nb_allu;
    else{
        int nb = rand()%3 +1;
        while ((nb - nb_allu) %4!=0)
        {
            nb = rand()%3 +1;
        }
        return nb;
    }
}

int bot_moyen(int nb_allu){
    if (nb_allu<=3) return nb_allu;
    else if(nb_allu<=12){
        int nb = rand()%3 +1;
        while ((nb - nb_allu) %4!=0)
        {
            nb = rand()%3 +1;
        }
        return nb;
    }
    else return rand()%3 +1; 
}


void jeu(int j1, int j2){
    int nb_allu = 20;
    int n=0;
    char *joueur2 = "joueur 2";

    if(j2 == 0) joueur2 =  "bot idiot";
    if(j2 == 3) joueur2 = "super bot";
    if(j2 == 1) joueur2 = "bot moyen";

    printf("il y a %d allumette\n",nb_allu);


    while(nb_allu > 0){

        if(n%2 == 0){             
            printf("\n===joueur 1===\n");
            nb_allu = nb_allu - demande_joueur(nb_allu);        
        }

        else{
            printf("\n===%s===\n",joueur2);

            if (j2 == 0) nb_allu = nb_allu - bot_idiot(nb_allu);
            else if( j2 == 3) nb_allu = nb_allu - super_bot(nb_allu);
            else if( j2 == 1) nb_allu = nb_allu - bot_moyen(nb_allu);
            else nb_allu = nb_allu - demande_joueur(nb_allu);
        }

        printf("il reste %d allumette\n",nb_allu);
        n++;
    }
    
    if (n%2 == 0) printf("%s a gagné\n",joueur2);
    else printf("joueur 1 a gagné\n");

}




int main(){

    jeu(1,1);


    return 0;
}