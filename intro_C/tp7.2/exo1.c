#include <stdio.h>




int longueur(char * chaine){
    int n=0;
    while(chaine[n]!='\0'){
        printf("%c", chaine[n]);
        n++;
    }
    return n;
}

void en_minuscule(char * chaine){
    int n=0;
    while(chaine[n]!='\0'){
        if(chaine[n]<'a' && chaine[n]!=' ' && chaine[n]!='!'){
            chaine[n]=chaine[n] - 'A' + 'a';
        }
        n++;
    }
}

void en_majuscule(char * chaine){
    int n=0;
    while(chaine[n]!='\0'){
        if(chaine[n]>'a' && chaine[n]!=' ' && chaine[n]!='!'){
            chaine[n]=chaine[n] - 'a' + 'A';
        }
        n++;
    }
}

int lire_chaine_protegee(int max, char chaine[]){
    scanf("%s",chaine);
    chaine[max]='\0';
    return max-1;
}


int main(){


    char chaine[]="heLLo WOrld !";
    char chaine2[25];

    printf(" %d\n",longueur(chaine));

    en_minuscule(chaine);
    printf("%s\n",chaine);

    en_majuscule(chaine);
    printf("%s\n",chaine);

    lire_chaine_protegee(5,chaine2);
    

    return 0;
}