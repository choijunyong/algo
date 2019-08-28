#if 1
#include <stdio.h>
double a[10001];
int N;
#define MAX(a,b) ((a)>(b)?(a):(b))
int main(void)
{
	int i, j;
	double max = 0, mul = 1;
	scanf("%d", &N);
	for (i = 0; i < N; i++) scanf("%lf", &a[i]);

	/*for (i = 0; i < N; i++)
	{
		mul = 1.0;
		for (j = i; j < N; j++)
		{
			mul *= a[j];
			max = MAX(max, mul);
		}
	}*/

	for (i = 0; i < N; i++)
	{
		if(mul > 1.0) mul *=  a[i];
        else mul = a[i];
        max = MAX(mul,max);

	}
	printf("%.3f", max);
	return 0;
}
#endif