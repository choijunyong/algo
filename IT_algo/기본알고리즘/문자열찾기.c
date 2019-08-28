#include <stdio.h>
char str[10000+10];
int  cnt_KOI, cnt_IOI;

int main(void)
{
	int i, len;
	gets(str);
	for(len=0; str[len]; len++);

	for(i=0; i<len-2; i++)
	{
		if(str[i]=='K' && str[i+1]=='O' && str[i+2]=='I') cnt_KOI++;
		else if(str[i]=='I' && str[i+1]=='O' && str[i+2]=='I') cnt_IOI++;
	}

	printf("%d\n%d", cnt_KOI, cnt_IOI);
	return 0;
}

