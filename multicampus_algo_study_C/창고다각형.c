
#if 1
#include <stdio.h>
  
int pole[1000+10];
  
int main(void)
{
    int n,i,j,area=0;
    int l=0,h=0;
    int last=0, maxh=0,maxl=0, start=0;
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d %d",&l,&h); 
        if(l>last) last = l;
        if(l<start)start = l;
        if (h > maxh)
        {
            maxh = h;
            maxl = l;
        }
        pole[l] = h;
    }
    
    for(i=start+1; i<maxl; i++)
    {
        if(pole[i-1]>pole[i]) pole[i] = pole[i-1];
    }
    for(i=last; i>maxl; i--)
    {
        if(pole[i]>pole[i-1]) pole[i-1] = pole[i];
    }
    for(i=start; i<=last; i++)
    {
        area+= pole[i];
    }
    printf("%d\n",area);
    return 0;
}
#endif