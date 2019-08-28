
#include <stdio.h>
struct pos
{
	int y,x;
}nail[5], pic[5];
int N;
int sel[5];
int visit[5];
int rotate[5];
int a[110][110];
#define MAX(a,b) ((a)>(b)?(a):(b))
int sol;
int calc_area(void)
{
	int i, j, k;
	int sy, sx, h, w;
	int cnt = 0;
	int num;
	for(k=1; k<=N; k++)
	{
		num = sel[k];
		if (rotate[k] == 0)
		{
			h = pic[num].y;
			w = pic[num].x;
		}
		else
		{
			h = pic[num].x;
			w = pic[num].y;
		}
		sy = nail[k].y;
		sx = nail[k].x - w / 2;
		h = sy + h;
		w = sx + w;
		for (i = sy; i < h; i++)
		{
			for (j = sx; j < w; j++)
			{
				a[i][j] = 1;
			}
		}
	}
	
	for (i = 0; i <= 100; i++)
	{
		for (j = 0; j <= 100; j++)
		{
			cnt+=a[i][j];
			a[i][j]=0;
		}
	}
	return cnt;
}
void dfs(int n)
{
	int i, r;
	if(n>N)
	{
		r = calc_area();
		sol = MAX(sol, r);
		return;
	}
	for(i=1; i<=N; i++)
	{
		if(visit[i])continue;
		sel[n] = i;
		visit[i] = 1;
		rotate[i]= 0;
		dfs(n+1);
		rotate[i]= 1;
		dfs(n+1);
		visit[i] = 0;
	}
}
void input_data(void)
{
	int i;
	scanf("%d", &N);
	for (i = 1; i <= N; i++)
	{
		scanf("%d %d", &nail[i].x, &nail[i].y);
	}
	for (i = 1; i <= N; i++)
	{
		scanf("%d %d", &pic[i].x, &pic[i].y);
	}
}
void main(void)
{
	input_data();
	dfs(1);	
	printf("%d\n",sol);
}
