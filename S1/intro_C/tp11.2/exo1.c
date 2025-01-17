#include <stdio.h>
#include <stdlib.h>
#include <time.h>


#define DIML 5
#define DIMC 5

char * generer(){
    char *tab = malloc(DIML * DIMC * sizeof(char));
    for (int i = 0; i < DIML; i++){
        for (int j = 0; j < DIMC; j++){
            if (rand() %2 == 0) tab[i * DIMC + j] =' ';
            else tab[i * DIMC + j] ='o';
        }
    }
    return tab;
}

void afficher(char *tab){
    for (int i = 0; i < DIML; i++){
        for (int j = 0; j < DIMC; j++){
            printf("%c ", tab[i * DIMC + j]);
        }
        printf("\n");
    }
}

int nb_vivantes(char *tab) {
    int count = 0;

    for (int i = 0; i < DIML; i++) { for (int j = 0; j < DIMC; j++) { int voisins = 0; if (tab[i * DIMC + j] == 'o') { if (j > 0 && tab[i * DIMC + j - 1] == 'o') voisins++; if (j < DIMC - 1 && tab[i * DIMC + j + 1] == 'o') voisins++; if (i < DIML - 1 && tab[(i + 1) * DIMC + j] == 'o') voisins++; if (i > 0 && tab[(i - 1) * DIMC + j] == 'o') voisins++; if (i > 0 && j > 0 && tab[(i - 1) * DIMC + j - 1] == 'o') voisins++; if (i < DIML - 1 && j < DIMC - 1 && tab[(i + 1) * DIMC + j + 1] == 'o') voisins++; if (i < DIML - 1 && j > 0 && tab[(i + 1) * DIMC + j - 1] == 'o') voisins++; if (i > 0 && j < DIMC - 1 && tab[(i - 1) * DIMC + j + 1] == 'o') voisins++; if (voisins == 2 || voisins == 3) { count++; } } } }
    return count;
}



int main() {
    //srand(time(NULL));
    char * tab = generer();
    afficher(tab);
    printf("%d", nb_vivantes(tab));

    free(tab);

    return 0;
}
