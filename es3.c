#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h> 

int main(){
    int pid = fork();
    if (pid == 0){
        int a = 5*3;
        printf("Prima Moltiplicazione: 5*3 = %d\n", a);
        exit(a);
    }else{
        int b = 9*4;
        int risultato;
        wait(&risultato);
        int a = WEXITSTATUS(risultato);
        printf("Seconda Moltiplicazione: 9*4 = %d\n", b);
        risultato = WEXITSTATUS(risultato) + b;
        printf("Somma dei 2 risultati: %d + %d = %d\n",a,b, risultato);
    }
    return 0;
}