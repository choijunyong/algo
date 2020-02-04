#include <stdio.h>
int N;
int map[20][20];
int dir[5];
int dr[5] = {0, 1, 0, -1, 0};//1은 아래, 2는 왼쪽, 3은 위, 4는 오른쪽을 
int dc[5] = {0, 0, -1, 0, 1};
int main(void)
{
    int i, j, k, cnt=0, max=0, sol=0;
	int nr, nc, cr = 1, cc = 1, no = 0;
    
	scanf("%d", &N);

	for (i = 1; i <=N; i++)
	{
        for (j = 1; j <= N; j++)
		{
            scanf("%1d", &map[i][j]);
			map[i][j]^=1;	// 0:길, 1:벽 ==> 1:길, 0:벽
        }
    }
    for (i = 0; i < 4; i++) scanf("%d", &dir[i]);
    
    
    for (;;)
	{
        nr = cr + dr[dir[no]];
		nc = cc + dc[dir[no]];
        if (map[nr][nc] == 1)	// 길
		{
            sol++;
            map[nr][nc] = 2;
            cr = nr; 
			cc = nc;
        }
        else if (map[nr][nc] == 0)	//벽
		{
            no = (no + 1) % 4;
        }
        else break;
    }
    printf("%d\n", sol);
    return 0;
}
