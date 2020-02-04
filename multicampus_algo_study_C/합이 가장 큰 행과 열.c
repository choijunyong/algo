#include <stdio.h>

int N;
int a[4][5] = {{3, -5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
int max_row, max_col;
#define COL	5
#define ROW	4
int main(void)
{
	int i, j;
	int sum = 0, max_sum = 0;

	/* За*/
	max_sum = -987654321;
	for (i = 0; i<ROW; i++)
	{
		sum = 0;
		for (j = 0; j<COL; j++) sum += a[i][j];
		if (sum > max_sum)
		{
			max_sum = sum;
			max_row = i;
		}
	}

	/* ї­*/
	max_sum = -987654321;
	for (j = 0; j<COL; j++)
	{
		sum = 0;
		for (i = 0; i<ROW; i++) sum += a[i][j];

		if (sum > max_sum)
		{
			max_sum = sum;
			max_col = j;
		}
	}

	printf("%d %d", max_row+1, max_col+1);

	return 0;
}