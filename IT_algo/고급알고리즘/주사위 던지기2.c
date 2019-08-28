#include <stdio.h>
int N, M;
int sel[10];

void dfs(int n, int sum)// n: È½¼ö, sum:ÇÕ°è
{
	int i;
	if(n==N)
	{
		if(sum == M)
		{
			for(i=0; i<N; i++)printf("%d ", sel[i]);
			printf("\n");
		}
		return;
	}
	for(i=1; i<=6; i++)	// i: ÁÖ»çÀ§´«
	{
		sel[n] = i;
		dfs(n+1, sum+i);
	}
}
void main(void)
{
	scanf("%d %d",&N, &M);
	dfs(0, 0);
}