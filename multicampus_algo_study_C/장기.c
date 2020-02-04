#include <stdio.h>

int N, M;
int R, C, S, K;
int sol;
struct st
{
	int r, c, v;
};
struct st q[100*100+10];
int r, w;
int visit[100+10][100+10];
int dr[]={-2, -1,  1,  2,  2,  1, -1, -2};
int dc[]={ 1,  2,  2,  1, -1, -2, -2, -1};
void inq(int r, int c, int v)
{
	q[w].r = r;
	q[w].c = c;
	q[w++].v = v;
}
int bfs(void)
{
	int i,nr,nc;
	struct st data;

	inq(R,C,0);
	visit[R][C] = 1;
	while(r<w)
	{
		data = q[r++];
		//if(data.r==S && data.c==K) return data.v;
		for(i=0;i<8;i++)
		{
			nr = data.r + dr[i];
			nc = data.c + dc[i];
			if(nr<=0 || nr>N || nc<=0 || nc>M)continue;
			if(visit[nr][nc])continue;

			if(nr==S && nc==K) return data.v+1;
			
			inq(nr, nc, data.v+1);
			visit[nr][nc] = 1;
		}
	}
	return 0;
}

int main(void)
{
	scanf("%d %d", &N, &M);
	scanf("%d %d %d %d", &R, &C, &S, &K);
	sol = bfs();
	printf("%d", sol);
	return 0;
}