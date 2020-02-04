#include <stdio.h>
#define MAX(a,b) (((a)>(b))?(a):(b))
int N, d, k, c;
int a[3000000+3000+10];
int chk[3000+10];
int cnt, max;

void input_data(void)
{
	int i;
	scanf("%d %d %d %d", &N, &d, &k, &c);
	for(i=0; i<N; i++)
	{
		scanf("%d", a+i);
	}
}
int solve(void)
{
	int i;
	
	chk[c] = 1;
	cnt = 1;
	for(i=0; i<k; i++)
	{
		//if(chk[a[i]] == 0)cnt++;
		//chk[a[i]]++;
		if(chk[a[i]]++ == 0)cnt++;
		a[N+i] = a[i];
	}
	for(i=0; i<N; i++)
	{
		max = MAX(cnt, max);
		chk[a[i]]--;
		if(chk[a[i]] == 0)cnt--;

		if(chk[a[i+k]] == 0)cnt++;
		chk[a[i+k]]++;
	}
	return max;
}
void main(void)
{
	int sol;
	input_data();
	sol = solve();
	printf("%d",sol);
	
}