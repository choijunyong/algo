#include <stdio.h>
 
int N;
int a[25+10][25+10];
int cnt;
int sol[25*25+10];
int house;
int dr[4] = {-1, 1, 0, 0};
int dc[4] = {0, 0, 1, -1};
void DFS(int r, int c)
{
	int i;
	if(a[r][c] != 1) return;

	a[r][c] = 0;
	house++;

	for(i=0; i<4; i++)
	{
		DFS(r+dr[i], c+dc[i]);
	}
}
 
int main(void)
{
	int i, j;
	scanf("%d", &N);
	for(i=1 ; i<=N ; i++)
	{
		for(j=1 ; j<=N ; j++)
		{
			scanf("%1d", &a[i][j]);
		}
	}
	for(i=1; i<=N; i++)
	{
		for(j=1; j<=N; j++)
		{
			if(a[i][j] == 1)
			{
				house = 0;
				DFS(i, j);
				sol[cnt++] = house;
			}
		}
	}

	/* 오름차순정렬*/
	for(i=0; i<cnt-1; i++)
	{
		for(j=i+1; j<cnt; j++)
		{
			if(sol[i] > sol[j])
			{
				int t = sol[i];
				sol[i] = sol[j];
				sol[j] = t;
			}
		}
	}

	printf("%d\n", cnt);
	for(i=0 ; i<cnt ; i++)
	{
		printf("%d\n", sol[i]);
	}

	return 0;
}