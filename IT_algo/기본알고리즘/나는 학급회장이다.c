
#include <stdio.h>

int cnt[4][4];
int total[4];
int N;
int win;
void main(void)
{
	int i,j, select = 0;
	int a[4]={0};

	
	scanf("%d",&N);
	for(i=0; i<N; i++)
	{
		scanf("%d %d %d",&a[1], &a[2], &a[3]);
		for(j=1; j<=3; j++)
		{
			cnt[j][a[j]]++;
			total[j]+=a[j];
		}
	}
	win = 1;
	select = 1;
	for(i=2; i<=3; i++)
	{
		if(total[win] < total[i])
		{
			select = 1;
			win = i;
		}
		else if(total[win] == total[i])
		{
			select = 1;
			for(j=3; j>0; j--)
			{
				if(cnt[win][j] < cnt[i][j])
				{
					win = i;
					break;
				}
				else if(cnt[win][j] > cnt[i][j])
				{
					break;
				}
			}
			if(j==0)select = 0;
		}
	}
	if(select == 0) printf("%d %d", 0, total[1]);
	else printf("%d %d", win, total[win]);
	
}

#endif