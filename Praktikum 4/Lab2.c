/*
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Lab		: B1
*/ 
#include <stdio.h>
#include <unistd.h> /* Berisi prototype fork */
int main(void)
{
	int pid;

	printf("Hello World!\n");
	printf("I am the parent process and pid is : %d .\n", getpid());
	printf("Here i am before use of forking\n");
	pid = fork();
	printf("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	printf("Here I am just after forking\n");
	if (pid == 0)
		printf("I am the child process and pid is :%d.\n", getpid());
	else
	printf("I am the parent process and pid is: %d .\n", getpid());
	printf(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
}
