#include <stdio.h>
int N, M;
typedef struct
{
	int prio,n;
}QUEUE;
QUEUE q[100*100 +10];
int w,r;
int count[10];

void init(void)
{
	int i;
	w=r=0;
	for(i=1; i<=9; i++)count[i] = 0;
}
void input_data(void)
{
	int i, p;
	scanf("%d %d",&N, &M);
	for(i = 0; i < N; i++)
	{
		scanf("%d", &p);
		q[w].n = i, q[w++].prio=p;
		count[p]++;
	}
}
int solve(void)
{
	int i, print = 0;
	QUEUE tmp;
	for(i=9; i>=1; i--)
	{
		while(count[i] > 0)
		{
			tmp = q[r++];
			if(tmp.prio == i)
			{
				print++;
				count[i]--;
				if(tmp.n == M) return print;
			}
			else q[w++] = tmp;
		}
	}
	return -1;
}
void main(void)
{
	int t, sol = 0;
	
	scanf("%d",&t);
	while(t--)
	{
		init();
		input_data();
		sol = solve();
		printf("%d\n",sol);
	}
	
}