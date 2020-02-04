#include <stdio.h>
int N;
int paper[110][110];
int dx[] = { 0, 0, 1, -1 };
int dy[] = { 1, -1, 0, 0 };
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
	int i, j, y, x, cnt=0;
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
			if (paper[i][j] == 1)
			{
				for (int k = 0; k < 4; k++)
				{
					if (paper[i + dy[k]][j + dx[k]] == 0)cnt++;
				}
			}
		}
	}
	printf("%d\n", cnt);
	return 0;
}
