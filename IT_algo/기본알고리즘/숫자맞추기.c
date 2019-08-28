#include <stdio.h>
char a[5+10];
char b[5+10];

int main(void)
{
	int i, j;
	int sc=0, bc=0; 

	scanf("%s %s", a, b);
#if 0
	for(i=0 ; i<4 ; i++)
	{
		if(a[i] == b[i]) sc++;
	}

	for(i=0 ; i<4 ; i++)
	{
		for(j=0 ; j<4 ; j++)
		{
			  if(a[i] == b[j]) bc++;
		}
	}
#else
	for(i=0 ; i<4 ; i++)
	{
		if(a[i] == b[i]) sc++;
		for(j=0 ; j<4 ; j++)
		{
			  if(a[i] == b[j]) bc++;
		}
	}
#endif
	
	printf("%dA%dB", sc, bc-sc);
	return 0;
}