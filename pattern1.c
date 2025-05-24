#include<stdio.h>
void main(){
    int r,c;
    for(r=1;r<=4;r++){
        for(c=1;c<=4;c++){
            if(c==1 || r==1 || c==4 || r==4){
                printf("*");
             } 
             else
                {
                    printf(" ");
                }
        }
        printf("\n");
    }
}