#include <stdio.h>
#include <stdlib.h>

#define TAILLE_MAX 30

/**
 * Randomly generates a name in the parameter tab.
 * The name has length at most 6 (7 with '\0');
 **/
void generate_name(char tab[])
{
    int i, nb_cons = 15, nb_vow = 5;
    char vowels[5] = {'a', 'e', 'i', 'o', 'u'};
    char consons[15 + 1] = "bcdfgjklmnprstv";
    int length = 2 * (rand() % 2) + 4;
    for (i = 0; i < length; i++)
    {
        if (i % 2)
        {
            tab[i] = vowels[rand() % nb_vow];
        }
        else
        {
            tab[i] = consons[rand() % nb_cons];
        }
    }
    tab[length] = '\0';
}

struct date
{
    int jour;
    int mois;
    int annee;
};

struct personne
{
    char nom[TAILLE_MAX];
    char prenom[TAILLE_MAX];
    struct date naissance;
};

void afficherPersonne(struct personne p)
{
    printf("%s %s (%02d/%02d/%04d)\n", p.prenom, p.nom, p.naissance.jour, p.naissance.mois, p.naissance.annee);
}

void lire_personne(struct personne p){
    
    printf("nom : ");
    scanf("%s",&p.nom);

    printf("prenom : ");
    scanf("%s",&p.prenom);

    printf("date de naissance : ");
    scanf("%s",&p.naissance);

    
}

char* lire_nom(FILE *f){
    int n=0;
    int tab[100];
    while(f[n] != '\n' || f[n] != '\n'){
        tab[n] = f[n];
        n++;
    }
}

int main()
{
    struct personne p = {"Stephane", "Setrouillard", {15, 4, 1975}};
    afficherPersonne(p);










    return 0;
}