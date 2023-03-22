#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h> /* mengandung fungsi wait */ /* mengandung fungsi fork*/
void main(void)
{
	int pid;
	int status;

	printf("Hello World!\n");
	pid = fork();
	if (pid == -1) /* kondisi jika fork error */
	{
		perror("bad fork");
		exit(1);
	}
	if (pid == 0) printf("I am the child process.\n");
	else {
		wait(&status); /* parent menunggu child selesai */
		printf("I am the parent process.\n");
	}
}
