#include <stdio.h>
#include <stdlib.h>

#define MAX_LIGNES 100
#define MAX_COLONNES 100

struct feuille
{
    double valeurs[MAX_LIGNES][MAX_COLONNES];
    int NbLigne;
    int NbColonne;
};

struct feuille exemple()
{
    struct feuille f;
    f.NbLigne = 3;
    f.NbColonne = 4;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            f.valeurs[i][j] = ((double)rand() / RAND_MAX) * 100;
        }
    }
    return f;
}

void afficher(struct feuille *f)
{
    for (int i = 0; i < f->NbLigne; i++)
    {
        for (int j = 0; j < f->NbColonne; j++)
        {
            printf("%.2f ", f->valeurs[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}

void afficher_somme(struct feuille *f)
{

    for (int i = 0; i < f->NbColonne; i++)
    {
        double somme = 0;
        for (int j = 0; j < f->NbLigne; j++)
        {
            somme = somme + f->valeurs[j][i];
        }
        printf("%2f ", somme);
    }
    printf("\n");
}

void echanger(struct feuille *f, int l1, int l2)
{
    if (l1 >= 0 && l1 < f->NbLigne && l2 >= 0 && l2 < f->NbLigne && l1 != l2)
    {
        for (int j = 0; j < f->NbColonne; j++)
        {
            double temp = f->valeurs[l1][j];
            f->valeurs[l1][j] = f->valeurs[l2][j];
            f->valeurs[l2][j] = temp;
        }
    }
    else
    {
        printf("Indices de ligne invalides.\n");
    }
}

void trier(struct feuille *f, int col)
{
    int i, j, min, temp;
    for (i = 0; i < f->NbLigne; i++)
    {
        min = i;
        for (j = i + 1; j < f->NbLigne; j++)
        {
            if (f->valeurs[j][col] < f->valeurs[min][col])
            {
                min = j;
            }
        }
        if (min != i)
        {
            temp = f->valeurs[i][col];
            f->valeurs[i][col] = f->valeurs[min][col];
            f->valeurs[min][col] = temp;
        }
    }
}

int est_egal(struct feuille *f1, struct feuille *f2)
{
    for (int i = 0; i < f1->NbLigne; i++)
    {
        for (int j = 0; j < f1->NbColonne; j++)
        {
            if (f1->valeurs[i][j] != f2->valeurs[i][j])
                return 0;
        }
    }
    return 1;
}

void transposer(struct feuille *f)
{
    double temp[MAX_COLONNES][MAX_LIGNES];
    for (int i = 0; i < f->NbLigne; i++)
    {
        for (int j = 0; j < f->NbColonne; j++)
        {
            temp[j][i] = f->valeurs[i][j];
        }
    }
    int tempNbLigne = f->NbLigne;
    f->NbLigne = f->NbColonne;
    f->NbColonne = tempNbLigne;
    for (int i = 0; i < f->NbLigne; i++)
    {
        for (int j = 0; j < f->NbColonne; j++)
        {
            f->valeurs[i][j] = temp[i][j];
        }
    }
}
        int main()
        {
            struct feuille f1;
            f1 = exemple();

            afficher(&f1);
            afficher_somme(&f1);

            trier(&f1, 1);
            afficher(&f1);

            echanger(&f1, 0, 1);
            afficher(&f1);

            struct feuille f2;
            f2 = exemple();

            struct feuille f3;
            f3 = f2;

            printf("%d\n", est_egal(&f3, &f2));
            afficher(&f2);
            afficher(&f3);

            return 0;
        }