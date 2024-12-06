#include <stdio.h>

#define MAX 32

int sont_egales(char str1[], char str2[])
{
    for (int i = 0; i < MAX; i++)
    {
        // printf("%d\n",i);
        if (str1[i] != str2[i])
            return 0;
        if (str1[i] == '\0' && str2[i] == '\0')
            return 1;
    }
    return 0;
}

void lire_premiere_ligne(FILE *f, char chaine[], int *length)
{
    f = fopen("Greymon.txt", "r");

    if (!f)
    {
        fprintf(stderr, "Erreur d'ouverture du fichier\n");
        return;
    }


    *length = 0;
    char c;
    while ((c = fgetc(f)) != '\n' && c != EOF)
    {
        chaine[*length] = c;
        (*length)++;
    }
    chaine[*length] = '\0';

    printf("%s\n",chaine);

    fclose(f);
}
int contient_la_ligne(FILE * f, char chaine[]){

    int length;
    lire_premiere_ligne(f, chaine, &length);

    printf("%s",stdin);

            

}




int main()
{

    printf("%d\n", sont_egales("gghfgdgdgd", "gg"));

    char chaine[256];
    int length;
    FILE *f = NULL;
    lire_premiere_ligne(f, chaine, &length);

    

    return 0;
}