#include <stdio.h>
#include <stdlib.h>       
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <pthread.h>

void * func(void * arg){
    printf("io sono il thread\n");
    return NULL;
}

int main(){
    printf("io sono il main\n");
    pthread_t ptID;
    pthread_create(&ptID, NULL, func, NULL);
    sleep(1);
    return 0;
}