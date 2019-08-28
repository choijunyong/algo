#include <stdio.h>
 
int N;
int sol;
int max = -1;
#define MIN(a,b) ((a)>(b)?(b):(a))
int cal_root(int a)
{
	int sum = 0;
 
	for (;;)
	{
		while(a>0)
		{                
			  sum += (a%10);
			  a/=10;
		}
		if (sum < 10) break;
		a = sum;
		sum = 0;
	}
	return sum;
}
 
int main(void)
{
	int i;
	int num, t;

	scanf("%d", &N);
	for(i=0; i<N; i++)
	{
		scanf("%d", &num);
		t = cal_root(num);
		if(t > max)
		{
			max = t;
			sol = num;
		}
		else if(t==max)
		{
			sol = MIN(sol, num);
		}
	}
	printf("%d", sol);

	return 0;
}