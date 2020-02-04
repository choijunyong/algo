#include <stdio.h>
char a[30];
unsigned long long int x;
int main(void)
{
	int i, j, len;
	unsigned long long sa=0, sb=0;
	scanf("%s %lld", a, &x);
	for(len = 0; a[len]; len++)a[len]-='0';
	for (i = 0; i < len-1; i++)
	{
		sa = sb = 0;
		for (j = 0; j <= i; j++)
		{
			sa *= 10;
			sa += a[j];
		}
		for (j = i+1 ; j < len; j++)
		{
			sb *= 10;
			sb += a[j];
		}
		if ((sa + sb) == x)
		{
			printf("%llu+%llu=%llu", sa, sb, x);
			return 0;
		}
	}
	printf("NONE");

	return 0;
}