#include <stdio.h>
 
int R, C;
char map[50+10][50+10];
char visit[50+10][50+10];
int sol;
struct st
{
      int r, c, t;
}q[50*50+10];;
int wp, rp;
int dr[4] = {1, -1, 0, 0};
int dc[4] = {0, 0, 1, -1}; 
#define MAX(a,b) ((a)>(b)?(a):(b))
void init(void)
{
	int i, j;
	wp = rp = 0;
	for(i=0; i<60; i++)
	{
		for(j=0; j<60; j++)
		{
			visit[i][j] = 0;
		}
	}
}
void inq(int r, int c, int t)
{
	q[wp].r = r;
	q[wp].c = c;
	q[wp++].t = t;
}
int bfs(int r, int c)
{
	struct st data={0};
	int i;
	int nr, nc;

	init();
	inq(r,c,0);
	visit[r][c]=1;

	while(wp>rp)
	{
		data = q[rp++];
		for(i=0 ; i<4 ; i++)
		{
			nr = data.r + dr[i]; 
			nc = data.c + dc[i];
			if((map[nr][nc] == 'L') && (visit[nr][nc] == 0))
			{
				visit[nr][nc]=1;
				inq(nr, nc, data.t+1);
			}
		}
	}
	return data.t;
}
 
int main(void)
{
	int i;
	int j, t;
	scanf("%d %d", &R, &C);
	for(i=1 ; i<=R ; i++)
	{
		scanf("%s", &map[i][1]);
	}

	for(i=1 ; i<=R ; i++)
	{
		for(j=1 ; j<=C ; j++) 
		{
			if(map[i][j] == 'L')
			{
				t = bfs(i, j);
				sol = MAX(sol, t);
			}
		}
	}
	printf("%d", sol);
	return 0;
}
