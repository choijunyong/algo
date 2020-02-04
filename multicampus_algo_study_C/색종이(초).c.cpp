#include <stdio.h>
int N;
int paper[110][110];
void fill_paper(int y, int x)
{
	for (int i = 0; i<10; i++)
	{
		for (int j = 0; j<10; j++)
		{
			paper[y + i][x + j] = 1;
		}
	}
}
int main(void)
{
	int i, j, y, x, area=0;
	scanf("%d", &N);

	for (i = 0; i<N; i++)
	{
		scanf("%d %d", &y, &x);
		fill_paper(y, x);
	}

	for (int i = 0; i<100; i++)
	{
		for (int j = 0; j<100; j++)
		{
			area += paper[i][j]; 
		}
	}
	printf("%d\n", area);
	return 0;
}
