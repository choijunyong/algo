#include <stdio.h>
#define MAX_N (10)
int N;
 
typedef struct
{
    int r, c;
}POS;
POS robot[MAX_N];
POS snack[MAX_N];
 
int dist[MAX_N][MAX_N];
int chk[MAX_N];
int sol;
#define ABS(X) (((X)<0)?-(X):(X))

void input_data(void)
{
    int i;
    scanf("%d", &N);
    for (i = 0; i < N; i++) scanf("%d %d", &robot[i].r, &robot[i].c);
    for (i = 0; i < N; i++) scanf("%d %d", &snack[i].r, &snack[i].c);
}
void make_dist_table(void)
{
    int i, j;
    for (i=0; i<N; i++)
    {
        for (j=0; j<N; j++)
        {
            dist[i][j] = ABS(robot[i].r - snack[j].r) + ABS(robot[i].c - snack[j].c);
        }
    }
}
 

void dfs(int n, int sum)
{
    int i;
	
	if(sol<=sum)return;
    if (n == N) 
	{ 
		sol = sum; 
		return; 
	}
 
	for (i=0;i<N;i++)
    {
        if (chk[i]) continue;
        chk[i] = 1;
        dfs(n + 1, sum + dist[n][i]);
        chk[i] = 0;
    }
}
 
 
int main(void)
{
    int T,tc;
    scanf("%d", &T);
    for (tc=0;tc<T;tc++)
    {
        input_data();
        make_dist_table();
        sol = 0x7fffffff;
        dfs(0, 0);
        printf("%d\n", sol);
    }
    return 0;
}
