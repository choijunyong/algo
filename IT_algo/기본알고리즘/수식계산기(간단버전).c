#include <stdio.h>
 
int N;
int  a[20+10];
char op[20+10];
int sol;
int stack[20];
int sp = 0;
int main(void)
{
      int i;

      scanf("%d",&N);
      scanf("%d",&a[0]);
      for(i=1;i<N;i++)
      {
            scanf(" %c %d",&op[i],&a[i]);
      }
     
      stack[sp++] = a[0];
 
      for(i=1;i<N;i++)
      {
            switch(op[i])
            {
            case '+':
                  stack[sp++] = a[i];
                  break;
            case '-':
                  stack[sp++] = -a[i];
                  break;
            case '*':
                  stack[sp-1] *= a[i];
                  break;
            case '/':
                  stack[sp-1] /= a[i];
                  break;
            }
      }
 
      for(i=0;i<sp;i++)
      {
            sol += stack[i];
      }
     
      printf("%d",sol);
 
      return 0;
}