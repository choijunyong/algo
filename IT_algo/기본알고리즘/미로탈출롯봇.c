#include<stdio.h>
int map[110][110];
int R, C;
int sr, sc, er, ec;
struct st
{ 
    int r, c, time;
};
struct st que[110*110];
int rp, wp;
int dr[4]={-1, 1, 0, 0}, dc[4]={0, 0, -1, 1};
void InQue(int r, int c, int time)
{
    que[wp].r = r;
    que[wp].c = c;
    que[wp].time=time;
    wp++;
}
int BFS(void)
{
    int i, nr, nc;
    struct st data;  //큐에서 꺼낼 데이타
	rp=wp=0;
    InQue(sr, sc, 0);	//1] 큐에 시작점을 저장 , que[wp++] = {sr, sc, 0};
    map[sr][sc]=1;		//방문표시
    while (rp<wp)		//큐에 데이타가 있을동안 반복
	{
        data = que[rp++];//2] 큐에서 데이타 읽기
        
		if(data.r == er && data.c == ec) return data.time;
        //3] 사방탐색하면서 연결점(길)을 찾아 큐에 저장
        for (i =0;i<4;i++)
		{
            nr = data.r + dr[i];
            nc = data.c + dc[i];
            //맵 범위벗어나면 스킵
			if(nr<1 || nr>R || nc<1 || nc>C) continue;
            //   길이 아니면 스킵
			if(map[nr][nc] !=0 ) continue;
			//4]발전 가능한 상태 큐에 저장
            InQue(nr, nc, data.time +1);
            map[nr][nc]=1;
        }
    }
    return -1;//5] 큐가 비었을경우
 
}
int main(void)
{
    int i, j, sol;
    scanf("%d %d", &C, &R);
    scanf("%d %d %d %d", &sc, &sr, &ec, &er);
    for(i=1;i<=R;i++)
	{
        for(j=1;j<=C;j++)
		{
            scanf("%1d", &map[i][j]);
        }
    }
    sol=BFS();
    printf("%d", sol);
}
