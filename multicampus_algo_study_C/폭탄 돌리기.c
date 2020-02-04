
#include <stdio.h>
 
int K, N;
int T[100+10];
char Z[100+10];
int sol;
 
int main(void)
{
      int i;
      int tsum = 0;

      scanf("%d", &K);
      scanf("%d", &N);
      for (i=0; i<N; i++)
      {
            scanf("%d %c", &T[i], &Z[i]);
      }
      for (i=0; i<N; i++)
      {
            tsum += T[i];
            if (tsum >210)
            {
                  break;
            }
            if (Z[i] == 'T') K = (K % 8) +1;
      }
      if(i==N) sol = K - 1;
      else sol = K;
 
     
      printf("%d", sol);
 
      return 0;
}

