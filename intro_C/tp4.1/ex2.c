#include <stdio.h>
#include <math.h>

int solve2d(double *x1, double *x2){
	
    double a,b,c;
    printf("solve2d\nSaisir une valeur différente de 0 pour a : ");
    scanf("%lf",&a);
    printf("Saisir une valeur pour b : ");
    scanf("%lf",&b);
    printf("Saisir une valeur pour c : ");
    scanf("%lf",&c);
    
    double delta = b*b - 4*a*c;

    //printf("%f\n",delta);
	if (delta>0){
		*x1=(-b-sqrt(delta))/2*a;
		*x2=(-b+sqrt(delta))/2*a;
        printf("deux solution %f et %f \n",*x1,*x2);
        return 2;
	}
    else if (delta==0){
        *x1=(-b)/2*a;
        printf("une solution %f\n",*x1);
        return 1;
    }
    else{
        printf("pas de solution \n");
        return 0;
    }
}

int main() {
    double x1,x2;
    
    
    solve2d(&x1,&x2);

    return 0;
}