#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <unistd.h> 

int main(){
    int pid = fork();
    if (pid == 0){
        int pidd = fork();
        if (pidd == 0){
            int a = 5*3;
            printf("Prima Moltiplicazione: 5*3 = %d\n", a);
            exit(a);
        }
        else{
            int b = 9*4;
            int risultato;
            wait(&risultato);
            int a = WEXITSTATUS(risultato);
            printf("Seconda Moltiplicazione: 9*4 = %d\n", b);
            risultato = WEXITSTATUS(risultato) + b;
            exit(risultato);
        }
    }else{
        int d = 4*7;
        int risultato;
        wait(&risultato);
        printf("Terza Moltiplicazione: 4*7 = %d\n", d);
        risultato = WEXITSTATUS(risultato) + d;
        printf("Somma dei 3 risultati: %d\n", risultato);
    }
    return 0;
}