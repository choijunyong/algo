
#include <stdio.h>
int a[3] = { 2, 5, 7 };  // 구슬
int b[3];     // 구슬을 담을 상자
int chk[3];      // 체크배열
int N = 3;       // 구슬은 3개
void DFS(int no) 
{ 
	int i;
	if(no>=N)
	{
		for(i=0; i<N; i++) printf("%d ", b[i]); 
		printf("\n");
		return;
	}
	for(i=0; i<N; i++)
	{
		if(chk[i])continue;
		b[no] = a[i];
		chk[i] = 1;
		DFS(no+1);
		chk[i] = 0;
	}
}
int main(void)
{
  DFS(0); 
}
