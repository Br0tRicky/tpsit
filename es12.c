#include <stdio.h>
#include <stdlib.h>       
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <pthread.h>

void * func(void * arg){
    while(-1){
        printf("thread in esecuzione...\n");
        sleep(1);
    }
}

int main(){
    pthread_t ptID; 
    pthread_create(&ptID, NULL, func, NULL);   
    scanf("%*c");
    pthread_cancel(ptID);
    sleep(5);
    
    return 0;
}