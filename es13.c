#include <stdio.h>
#include <stdlib.h>       
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <pthread.h>

int *func(int *num){
    int n = *(int *)num;
    for(int i=0; i<n; i++){
        printf("thread in esecuzione...\n");
        sleep(1);
    }
}

int main(){
    int num;
    printf("inserisci il numero di iterazioni: ");
    scanf("%d", &num);
    pthread_t ptID;
    pthread_create(&ptID, NULL, func, &num);
    pthread_join(ptID, NULL);
    return 0;
}