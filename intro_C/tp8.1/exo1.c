#include <stdio.h>

enum jour
{
    LUNDI,
    MARDI,
    MERCREDI,
    JEUDI,
    VENDREDI,
    SAMEDI,
    DIMANCHE
};

void affiche_jour(enum jour j)
{
    printf("jour : ");
    switch (j)
    {
    case LUNDI:
        printf("lundi");
        break;
    case MARDI:
        printf("mardi");
        break;
    case MERCREDI:
        printf("mercredi");
        break;
    case JEUDI:
        printf("jeudi");
        break;
    case VENDREDI:
        printf("vendredi");
        break;
    case SAMEDI:
        printf("samedi");
        break;
    case DIMANCHE:
        printf("dimanche");
        break;
    }
    printf("\n");
}

int main()
{

    affiche_jour(2);

    return 0;
}