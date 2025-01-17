#include <stdio.h>
#include <stdlib.h>
#include <time.h>




void riddle(){
    int random = (rand()%1000)+1;
    int guess;
    int try=1;
    int dont_founds = 1;

    //printf("Random = %d\n", random);

    printf("guess the random number between 1 and 1000\n");
    scanf("%d", &guess);

    while(dont_founds){
        if (guess == random) {
            printf("Well play you found it (%d) in %d try\n", random,try);
            dont_founds = 0;
        }
        else if(guess > random){
            printf("less ");
            scanf("%d", &guess);
            try++;
        }
        else if(guess < random){
            printf("more ");
            scanf("%d", &guess);
            try++;
        }
    }
    
}






int main(){

    srand(time(NULL));
    riddle();


    return 0;
}