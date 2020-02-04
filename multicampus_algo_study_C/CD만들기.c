#include <stdio.h>
 
int N, T;
int a[200+10];
int sol;
 
int main(void)
{
      int i;
      int j, t, sum=0;
 
     
      scanf("%d %d", &N, &T);
 
      for(i=0; i<N; i++)
      {
            scanf("%d", &a[i]);
      }
 
     
      for(i=0; i<N-1; i++)
      {
            for(j=i+1; j<N; j++)
            {
                  if(a[i]>a[j])
                  {
                        t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                  }
            }
      }
 
      /* sum */
      for(i=0; i<N; i++)
      {
            sum += a[i];
            if(sum > T) break;
      }
      sol = i;
 
     
      printf("%d", sol);
 
      return 0;
}