#define USE_STACK

#ifdef USE_STACK

#include <stdio.h>
int N;//학생수
int stack[100000 + 10];
int main(void)
{
      register int i, sp = 0;
      int s, tmp;
      scanf("%d", &N);
      for (i = 1; i <= N; i++)
	  {
            scanf("%d %d", &tmp, &s);
            while(sp>0)
			{
				if(stack[sp]<=s)break;
				sp--;
			}
            stack[++sp] = s;
      }
      printf("%d\n", sp);
      return 0;
}
#else
#include <stdio.h>
int N;//학생수
int A[100000 + 10];
void input_data(void)
{
      register int i, tmp;
      scanf("%d", &N);
      for (i = 1; i <= N; i++)
	  {
            scanf("%d %d", &tmp, &A[i]);
      }
}
int solve(void)
{
      register int i, speed, cnt = 1;
      speed = A[N];
	  for (i = N - 1; i > 0; i--)
	  {
            if (A[i] > speed) continue;
			speed = A[i];
            cnt++;
      }
      return cnt;
}
int main(void)
{
	int ans;
	input_data();
	ans = solve();
	printf("%d\n", ans);
	return 0;
}
#endif
