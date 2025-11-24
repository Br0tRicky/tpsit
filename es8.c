#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>


int main(){
    float n;
    printf("quanti numeri vuoi inserire? ");
    scanf("%f", &n);
    float *numeri = malloc(n * sizeof(float));
    for(int i=0; i<n; i++){
        printf("inserisci numero %d: ", i+1);
        scanf("%f", &numeri[i]);
    }
    int media = 0;
    for(int i=0; i<n; i++){
        media += numeri[i];
    }
    media = media/n;
    if(&numeri>media){
        printf("i numeri superiori alla media (%d) sono: ", media);
        for(int i=0; i<n; i++){
            if(numeri[i]>media){
                printf("%.2f ", numeri[i]);
            }
        }
    }
    free(numeri);
    return 0;
}