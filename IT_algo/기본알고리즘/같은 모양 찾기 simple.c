#include <stdio.h>
int map[110][110], pattern[110][110];
int N,P;
int search_pattern(int y, int x)
{
	for (int i = 0; i < P; i++)
	{
		for (int j =0 ; j < P; j++)
		{
			if (map[i+y][j+x] != pattern[i][j])return 0;
		}
	}
	return 1;
}
int main(void)
{
	int ans = 0;
	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			scanf("%1d", &map[i][j]);
		}
	}
	scanf("%d", &P);
	for (int i = 0; i < P; i++)
	{
		for (int j = 0; j < P; j++)
		{
			scanf("%1d", &pattern[i][j]);
		}
	}
	for (int i = 0; i <= N - P; i++)
	{
		for (int j = 0; j <= N - P; j++)
		{
			ans += search_pattern(i, j);
		}
	}
	printf("%d\n", ans);
}