#include <stdio.h>

struct horaire
{
    int heure;
    int minute;
    int seconde;
};

void affiche_horaire(struct horaire h)
{
    printf("%d:%d:%d\n", h.heure, h.minute, h.seconde);
}

void seconde_vers_horaire(int sjournne, struct horaire *p_hor)
{
    p_hor->heure = sjournne / 60 / 60;
    p_hor->minute = sjournne / 60 % 60;
    p_hor->seconde = sjournne % 60;
}

struct horaire saisir_horaire()
{
    struct horaire hsaisie;
    int saisie;

    printf("heure:");
    scanf("%d", &saisie);
    hsaisie.heure = saisie;

    printf("minute:");
    scanf("%d", &saisie);
    hsaisie.minute = saisie;

    printf("seconde:");
    scanf("%d", &saisie);
    hsaisie.seconde = saisie;

    return hsaisie;
}

struct horaire une_seconde_plus_tard(struct horaire *h)
{
    if (h->seconde >= 59)
    {
        if (h->minute >= 59)
        {
            if (h->heure >= 23)
            {
                h->heure = 0;
                h->minute = 0;
                h->seconde = 0;
            }
            else
            {
                h->heure += 1;
                h->minute = 0;
                h->seconde = 0;
            }
        }
        else
        {
            h->minute += 1;
            h->seconde = 0;
        }
    }
    else
    {
        h->seconde += 1;
    }
    return *h;
}

int horaire_vers_seconde(struct horaire *p_hor)
{   
    int sjournee=0;
    
    sjournee += p_hor->heure * 60 * 60;
    sjournee += p_hor->minute * 60;
    sjournee += p_hor->seconde;

    return sjournee;
}

struct horaire duree(struct horaire *h1, struct horaire *h2){
    struct horaire diff; 

    if (h1<h2){
        
    }
}

int main()
{

    struct horaire courant = {12, 45, 32};

    affiche_horaire(courant);

    seconde_vers_horaire(47531, &courant);
    affiche_horaire(courant);

    affiche_horaire(saisir_horaire());

    struct horaire h = saisir_horaire();
    affiche_horaire(une_seconde_plus_tard(&h));
    
    struct horaire h2 = {13,12,11};
    printf("%d\n",horaire_vers_seconde(&h2));

    return 0;
}