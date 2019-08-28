#include <stdio.h>
int a[10];
void sort(void)
{
	int i, j, temp;
	for (i = 0; i < 8; i++)
	{
		for (j = i + 1; j < 9; j++)
		{
			if (a[i] > a[j])
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
}
int main(void)
{
	int i, j, sum = 0;
	for (i = 0; i < 9; i++)
	{
		scanf("%d", &a[i]);
		sum += a[i];
	}
	sort();
	
	for (i = 0; i < 9-1; i++)
	{
		for (j = i + 1; j < 9; j++)
		{
			if (sum - a[i] - a[j] == 100)
			{
				a[i] = a[j] = 0;
				goto exit_loop;
			}
		}
	}
exit_loop:
	for (i = 0; i < 9; i++)
	{
		if (a[i]) printf("%d\n", a[i]);
	}

	return 0;
}
