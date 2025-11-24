#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>
#include <pthread.h>

int main(){
        printf("thread id principale: %lu\n", pthread_self());
    return 0;
}   