#include <stdio.h>

void damier(int lig, int col){
    for(int i=0; i<lig; i++){
        for (int j=0; j<col; j++){
            if (i%2==0){
                if(j%2==0) printf("#");
                
                else printf(" ");
            }

            else{
                if(j%2==0) printf(" ");
                
                else printf("#");
            }    
        }
        printf("\n");
    }
}

void damier_cadre(int lig, int col){

    printf("+");
    for (int top=0; top < col; top++){
        printf("-");
    }
    printf("+");
    printf("\n");
    /////////////
    for(int i=0; i<lig; i++){
        printf("|");
        for (int j=0; j<col; j++){
            if (i%2==0){
                if(j%2==0) printf("#");
                
                else printf(" ");
            }

            else{
                if(j%2==0) printf(" ");
                
                else printf("#");
            }    
        }
        printf("|");

        printf("\n");
    }
    //////////////////
    printf("+");
    for (int bot=0; bot < col; bot++){
        printf("-");
    }
    printf("+");
    printf("\n");


}















int main(){




    damier(4,5);
    printf("\n");
    damier(4,16);
    printf("\n");
    damier_cadre(4,5);
    damier_cadre(4,16);




    return 0;
}





