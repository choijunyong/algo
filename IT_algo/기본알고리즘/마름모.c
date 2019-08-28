#include <stdio.h>
int N, K, M;
char a[30];
int b[30];
void sort(void)
{
	int i, j, temp;
	for (i=0; i< M-1; i++)
	{
		for (j=i+1; j< M; j++)
		{
			if (b[i]< b[j])
			{
				temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
}
void solve(void)
{
	int i, j, sum=0;
	for (i=0; i< N; i+=N/4)
	{
		sum=0;
		for (j=i; j< i+N/4; j++)
		{
			sum = sum*16 + a[j];
		}
		b[M++]=sum;
	}
}
int main(void){
	int i, j, k;
	int cnt=0;
	scanf("%d %d", &N, &K);

	for (i=0; i< N; i++)
	{
		scanf("%1x", &a[i]);
	}
	
	for (i=0; i< N/4; i++)
	{
		char temp=a[N-1];
		for (j=N-2; j >= 0; j--)
		{
			a[j+1] = a[j];
		}
		a[0]=temp;
		solve();
	}
	sort();
	
	for (i=0; i< M; i++)
	{
		if (b[i]!=b[i+1])
		{
			cnt++;
			if (cnt==K) break;
		}
	}
	printf("%d\n", b[i]);

	return 0;
}
