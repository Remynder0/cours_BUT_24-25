#include <stdio.h>

void seconde_vers_horaire(int ecoule, int *h, int *m, int *s) {

    *h = ((ecoule/60)/60);
    *m = ((ecoule/60)%60);
    *s = ecoule%60;
}

void une_seconde_plus_tard(int *h, int *m, int *s) {

    if (*s>58){
        if (*m>58){
            if(*h>22){
                *h = 0;
                *m = 0;
                *s = 0;
            }
            else{
                *h += 1;
                *m = 0;
                *s = 0;
            }
        }
        else{
            *m += 1;
            *s = 0;
        }
    }
    else{
        *s+=1;
    }
}
int horaire_vers_seconde(int *h, int *m, int *s) {

    return *h*60*60 + *m*60 + *s;
}


int main() {
    int h,m,s;

    seconde_vers_horaire(47531,&h,&m,&s);

    une_seconde_plus_tard(&h,&m,&s);

    printf("%d\n",horaire_vers_seconde(&h,&m,&s));

    printf("heure de la journée %dh %dmin et %ds \n",h,m,s);

    return 0;
}