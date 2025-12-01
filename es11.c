#include <stdio.h>
#include <stdlib.h>       
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <pthread.h>

void * func(void * arg){
    printf("DAL THREAD:\n");
    printf("id thread: %li\n", pthread_self());
    printf("pid thread: %d\n", getpid());
    return NULL;
}

int main(){
    printf("DAL MAIN:\n");
    printf("pid principale: %d\n", getpid());
    printf("thread principale id: %li\n", pthread_self());
    pthread_t ptID;
    pthread_create(&ptID, NULL, func, NULL);
    printf("id nuovo thread: %lu\n", (unsigned long)ptID);
    pthread_join(ptID, NULL);
    return 0;
}