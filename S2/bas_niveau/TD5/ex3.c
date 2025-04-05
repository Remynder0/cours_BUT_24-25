#include <stdio.h>
#include <string.h>
#define MAXPERS 3
#define TAILLE_NOM 15
#define TAILLE_ADRESSE 25
typedef struct personne {
char nom[TAILLE_NOM];
int age;
char adresse[TAILLE_ADRESSE];
} Personne;

void saisiePersonne(Personne *p) {
    printf("Entrez le nom de la personne : ");
    scanf("%s", p->nom);
    printf("Entrez l'age de la personne : ");
    scanf("%d", &p->age);
    printf("Entrez l'adresse de la personne : ");
    scanf("%s", p->adresse);
}

void sauvegardePersonne(Personne *p) {
    printf("Personne : %s, %d ans, %s\n", p->nom, p->age, p->adresse);
}

void lecturePersonne(Personne *p) {
    printf("Entrez le nom de la personne : ");
    scanf("%s", p->nom);
    printf("Entrez l'age de la personne : ");
    scanf("%d", &p->age);
    printf("Entrez l'adresse de la personne : ");
    scanf("%s", p->adresse);
}



int main(int argc, char *argv[]){
    Personne pers[MAXPERS];
    int i;
    if(argc == 1) {
        for(i = 0; i < MAXPERS; i++) {
            saisiePersonne(&pers[i]);
        }
    }
    else {
        if(strcmp(argv[1],"a") == 0) {
            for(i = 0; i < MAXPERS; i++) {
                lecturePersonne(&pers[i]);
            }
        }
        else {
            i = atoi(argv[1]);
            if(i < 0 || i >= MAXPERS) {
                printf("Indice incorrect\n");
            }
            else {
                lecturePersonne(&pers[i]);
            }
        }}
   
    return 0;
}