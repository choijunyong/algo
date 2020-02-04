#include <stdio.h>
int a, b;
int sosu[100001];
#define NOT_PRIME	1
#define PRIME		0
void make_sosu_table(int e)
{
	int i,j;
	for(i=2; i<=e; i++) // for(i=2; i*i<=e; i++)
	{
		if(sosu[i] == NOT_PRIME)continue;
		for(j=2; i*j<=e; j++)
		{
			sosu[i*j] = NOT_PRIME;
		}
	}
}
int main(void)
{
	int i, temp, min=100000, max=0, cnt=0;
	scanf("%d %d", &a, &b);
	if (a > b) 
	{
		temp = a;
		a = b;
		b = temp;
	}
	sosu[1] = NOT_PRIME;
	make_sosu_table(b);
	
	for (i = a; i <= b; i++)
	{
		if (sosu[i] == PRIME) cnt++;
	}
	for (i = a;  i<= b; i++)
	{
		if (sosu[i] == PRIME) break;
	}
	min = i;
	for (i = b; i >=a; i--)
	{
		if (sosu[i] == PRIME) break;
	}
	max = i;
	printf("%d\n", cnt);
	printf("%d\n", max + min);

	return 0;
}