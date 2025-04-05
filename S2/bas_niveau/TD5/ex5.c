# include <stdlib.h>
# include <stdio.h>
# include <stddef.h>
# define TNOM 10
typedef struct enregistrement { char nom[TNOM]; long reference; }
Enregistrement;
int main (void) {
    Enregistrement enr;
    printf (" Adresse de \n ");
    printf (" - enr : %p \n ", &enr);
    printf (" - enr.nom[0] : %p (decalage : %lld) \n ",&enr.nom  , offsetof(Enregistrement, nom) );
    printf (" - enr.nom[TNOM-1] : %p \n ", &enr.nom[TNOM-1] );
    printf (" - enr.reference : %p (decalage : %lld) \n ",&enr.reference , offsetof(Enregistrement, reference) );
return EXIT_SUCCESS;
}