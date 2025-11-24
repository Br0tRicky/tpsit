#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h>

int * func(){
    int *b = malloc(sizeof(int));
    *b = 10;
    return b;
}

int main(){
    int *c;
    c = func();
    printf("%d\n", *c);
    free(c);
    return 0;
}