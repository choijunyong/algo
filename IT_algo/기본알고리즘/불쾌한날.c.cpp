#include <stdio.h>
int N;
int cow[80000 + 10];
int sp;

void input_data(void)
{
	scanf("%d", &N);
}
long long solve(void)
{
	int i, h;
	long long sum=0;

	for (i = 0; i < N; i++)
	{
		scanf("%d", &h);
		while (sp > 0)
		{
			if (cow[sp] > h)break;
			sp--;
		}
		sum += sp;
		cow[++sp] = h;
	}
	return sum;
}
void main(void)
{
	long long ans;
	input_data();
	ans = solve();
	printf("%lld\n", ans);
}