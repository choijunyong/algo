#include <stdio.h>

int R, C;
char map[50 + 10][50 + 10];
int sol;
int dx[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
int dy[] = { -1, -1, 0, 1, 1, 1, 0, -1 };
#define MAX(a,b) (((a)>(b))?(a):(b))
int countShake(int i, int j)
{
	int nx, ny, cnt = 0;

	for (int k = 0; k<8; k++)
	{
		ny = i + dy[k];
		nx = j + dx[k];

		if ((ny >= 0) && (nx >= 0) && (ny<R) && (nx<C) && (map[ny][nx] == 'o')) cnt++;
	}
	return cnt;
}
int main(void)
{
	int i, j;
	int r;
	int old_cnt = 0, max = 0, tmp;
	// 입력받는 부분
	scanf("%d %d\n", &R, &C);
	for (i = 0; i < R; i++)
	{
		scanf("%s", map[i]);
	}

	for (int i = 0; i<R; i++)
	{
		for (int j = 0; j<C; j++)
		{
			if (map[i][j] == 'o')
			{
				old_cnt += countShake(i, j);
			}
			if (map[i][j] == '.')
			{
				tmp = countShake(i, j);
				if (max < tmp)max = tmp;
			}
		}
	}
	sol = max + old_cnt / 2;

	// 출력하는 부분
	printf("%d\n", sol);


	return 0;
}