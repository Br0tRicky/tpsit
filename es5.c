#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h> 

void incrementa(int *a){
    *a++;
}

int main(){
    int r=0;
    incrementa(&r);
    printf("%d\n", r);
    return 0;
}