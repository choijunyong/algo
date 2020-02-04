#include <stdio.h>
 
int N;
char a[100+10][100+10];
int sol1, sol2;
 
char chk[100+10][100+10];
 
int dr[]={0,1,0,-1};
int dc[]={-1,0,1,0};
void Fill(int r, int c)
{
    int k, nr, nc;
	
	if(chk[r][c])   return;
	chk[r][c]=1;

	for(k=0;k<4;k++)
	{
		nr=r+dr[k];
		nc=c+dc[k];
		//if(nr<=0 || nr>N || nc<=0 || nc>N)continue;
		if(a[nr][nc]!=a[r][c])continue;
		Fill(nr, nc);
	}
}
 
int main(void)
{
	int i, j;
	scanf("%d", &N);
	for(i=1; i<=N; i++)
	{
		scanf("%s", &a[i][1]);
	}


	for(i=1; i<=N; i++)
	{
		for(j=1; j<=N; j++)
		{
			  if(chk[i][j] == 0)
			  {
					sol1++;
					Fill(i, j);
			  }
		}
	}

	for(i=1; i<=N; i++)
	{
		for(j=1; j<=N; j++)
		{
			  chk[i][j]=0;
			  if(a[i][j]=='G') a[i][j] = 'R';
		}
	}

	for(i=1; i<=N; i++)
	{
		for(j=1; j<=N; j++)
		{
			  if(chk[i][j] == 0)
			  {
					sol2++;
					Fill(i, j);
			  }
		}
	}
	printf("%d %d", sol1, sol2);
	return 0;
}