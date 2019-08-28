#include <stdio.h>

int N;
int map[25][25], visit[25];
int sol = 0x7FFFFFFF;
#define MIN(a,b) (((a)<(b))?(a):(b))
void dfs(int n, int sum)
{
	if (n >= N)
	{
		sol = MIN(sol, sum);
		return;
	}
	if (sum > sol)return;
	for (int i = 0; i < N; i++)
	{
		if (visit[i] == 1)continue;
		visit[i] = 1;
		dfs(n + 1, sum + map[n][i]);
		visit[i] = 0;
	}
}
int main(void)
{
	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			scanf("%d", &map[i][j]);
		}
	}
	dfs(0, 0);
	printf("%d\n", sol);
	return 0;
}

}
