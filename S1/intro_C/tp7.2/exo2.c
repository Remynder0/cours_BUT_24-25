#include <stdio.h>

/*
int frequence(char *chaine){
    int n=0;
    int f;
    int f_max=0;
    while(chaine[n]!='\0'){
        if (chaine[n]==chaine[n+1]){
            f=1;
        }
        n++;
    }
}*/

void decalage(char * chaine, int decal){

    int n=0;
    while(chaine[n]!='\0'){
        chaine[n]= chaine[n] + decal;
        n++;
    }
}







int main(){

    char chaine[]="heLLo WOrld !";

    decalage(chaine,3);

    printf("%s\n",chaine);


    return 0;
}