/*
Pembuat 	: Silvira Nabila Anggita Giraldi
NIM 		: 24060121120011
Tanggal   	: 16 Maret 2023
Lab		: B1
*/ 

#include <stdio.h>
#include <unistd.h>

int main()
{
	int pid ;

	printf("I'am the original process with PID %d and PPID %d.\n",
	getpid(), getppid()) ;
	pid = fork () ; /* Duplikasi proses, child dan parent */
	printf("#################################################\n");
	if ( pid != 0 ) /* jika pid tidak nol, artinya saya parent*/
	{
		printf("I'am the parent with PID %d and PPID %d.\n",
		getpid(), getppid()) ;
		printf("My child's PID is %d\n", pid ) ;
	}
	else /* jika pid adalah nol, artinya saya child */
	{
		sleep(4); /* memastikan supaya parent lebih dulu di terminasi*/
		printf("I'm the child with PID %d and PPID %d.\n",
		getpid(), getppid()) ;
	}
	printf ("PID %d terminates.\n", getpid()) ;
}
