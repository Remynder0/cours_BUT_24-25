#include <stdio.h>

char* en_minuscule(char *chaine)
{
    int n = 0;
    int new_chaine[50];
    while (chaine[n] != '\0')
    {
        if (chaine[n] < 'a' && chaine[n] != ' ' && chaine[n] != '!')
        {
            new_chaine[n] = new_chaine[n] - 'A' + 'a';
        }
        n++;
    }
    new_chaine[n] ='\0';
    return new_chaine;
}

int est_un_palindromique(char chaine[])
{
    int debut = 0;
    int fin = 0;
    while (chaine[fin] != '\0')
    {
        fin++;
    }
    fin--;

    char* chaine_m = en_minuscule(chaine);
    printf("%s\n", chaine_m);
    while (debut < fin)
    {
        if (chaine_m[debut] != chaine_m[fin])
        {
            return 0;
        }

        debut++;
        fin--;
    }
    return 1;
}

int main()
{

    printf("%d\n", est_un_palindromique("kayak"));
    printf("%d\n", est_un_palindromique("LAVAL"));
    printf("%d\n", est_un_palindromique("LAvrzobfonjaL"));
    printf("%d\n", est_un_palindromique("LAvaL"));

    return 0;
}