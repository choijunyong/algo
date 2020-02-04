#include <stdio.h>
 
int M, N, K;
int b[100*100+10];
int a[100+10][100+10];
int dr[]={0,1,0,-1};
int dc[]={-1,0,1,0};
int cnt;
void Fill(int r, int c)
{
	int i;
	
	if(r<0 || r>=M || c<0 || c>=N)return;
	if(a[r][c]==1) return;
	
	a[r][c] = 1;
	cnt++;
	for(i=0;i<4;i++)
	{
		Fill(r+dr[i], c+dc[i]);
	}
}
void draw(int sr, int sc, int er, int ec)
{
	int i,j;
	for(i=sr;i<er;i++)
	{
		for(j=sc;j<ec;j++)
		{
			a[i][j]=1;
		}
	}
}
int main(void)
{
	int i, j, idx = 0;
	int sr,sc,er,ec;
	scanf("%d %d %d", &M, &N, &K);

	for(i=0;i<K;i++)
	{
		scanf("%d %d %d %d", &sc, &sr, &ec, &er);
		draw(sr,sc,er,ec);
	}

	for(i=0;i<M;i++)
	{
		for(j=0;j<N;j++)
		{
			if(a[i][j]==1) continue;
			cnt=0;
			Fill(i, j);
			b[idx++]=cnt;
		}
	}

	for(i=0;i<idx-1;i++)
	{
		for(j=i+1;j<idx;j++)
		{
			if(b[i]>b[j])
			{
				int tmp;
				tmp=b[i], b[i]=b[j], b[j]=tmp;
			}
		}
	}
	printf("%d\n", idx);
	for(i=0;i<idx;i++)
	{
		printf("%d ", b[i]);
	}

	return 0;
}