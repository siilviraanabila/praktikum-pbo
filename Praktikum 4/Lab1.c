/*
Nama File 	: Kubus.java 
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Lab		: B1
*/ 

#include <stdio.h>
#include <unistd.h> /* Berisi prototype fork*/
int main(void)
{
	printf("Hello World\n");
	fork();
	printf("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
	printf("I am after forking\n");
	printf("\tI am process %d.\n", getpid());
	printf(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
}
