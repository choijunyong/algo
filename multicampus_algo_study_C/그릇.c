#include <stdio.h>
 
char str[50+10];
int  sol;

int main(void)
{
      int i;
      int len;
	  scanf("%s", str);

	  sol = 10;

	  for(i=1; str[i]; i++)
      {
            if(str[i] == str[i-1]) sol += 5;
            else sol += 10;
      }
      printf("%d", sol);
      return 0;
}