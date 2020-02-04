#include <stdio.h>

int R, C;
int map[100+10][100+10];
int sr, sc;
int sol, cnt;
struct st
{
      int r, c, v;

};
struct st queue[100*100+10];

int rp, wp;
int dr[]={0,1,0,-1};
int dc[]={-1,0,1,0};
void InQue(int r, int c, int v)
{
    queue[wp].r = r;
    queue[wp].c = c;
    queue[wp].v=v;
    wp++;
}
int BFS(void)
{
      int i,nr,nc;
      struct st data;
	  InQue(sr,sc,3);
      map[sr][sc] = 0;
	  cnt--;
      while(rp<wp)
	  {
			data = queue[rp++];
            for(i=0;i<4;i++)
			{
				nr = data.r + dr[i];
				nc = data.c + dc[i];
				if(nr<=0 || nr>R ||nc<=0 || nc>C)continue;
				if(map[nr][nc]==0)continue;
				InQue(nr,nc,data.v+1);
				map[nr][nc] = 0;
				cnt--;
            }
      }
      return data.v;
}

int main(void)
{
      int i, j;
      scanf("%d %d", &C, &R);
      for(i=1 ; i<=R ; i++)
	  {
            for(j=1 ; j<=C ; j++)
			{
                  scanf("%1d", &map[i][j]);
				  cnt+=map[i][j];
            }
      }

	  scanf("%d %d", &sc, &sr);
      sol = BFS();
      printf("%d\n%d", sol, cnt);
      return 0;
}