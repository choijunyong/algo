#include <stdio.h>
 
int N, M;
int s[200+10];
int e[200+10];

int sel[100+10];
#define MAX 100
int Queue[100+10];
int Wp, Rp;
 
int In_Queue(int d)
{
      if(Wp >= MAX) return 0;
      Queue[Wp++] = d;
	  
      return 1;
}
void BFS(void)
{
	int i, t, d;

	In_Queue(1);
	sel[1] = 1;
	printf("%d ",1);
	while(Wp > Rp)
	{
		t = Queue[Rp++];
		for(i=1; i<=M; i++)
		{
			  if(t==s[i] && sel[e[i]]==0) d = e[i];
			  else if(t==e[i] && sel[s[i]]==0) d = s[i];
			  else continue;

			  In_Queue(d);
			  sel[d]=1;
			  printf("%d ",d);
		}
	}
}
 
int main(void)
{
      int i;
     
      scanf("%d %d", &N, &M);
      for(i=1;i<=M;i++)
      {
            scanf("%d %d", &s[i], &e[i]);
      }
 
      BFS();
     
      return 0;
}