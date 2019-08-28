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
    struct st data;  //ť���� ���� ����Ÿ
	rp=wp=0;
    InQue(sr, sc, 0);	//1] ť�� �������� ���� , que[wp++] = {sr, sc, 0};
    map[sr][sc]=1;		//�湮ǥ��
    while (rp<wp)		//ť�� ����Ÿ�� �������� �ݺ�
	{
        data = que[rp++];//2] ť���� ����Ÿ �б�
        
		if(data.r == er && data.c == ec) return data.time;
        //3] ���Ž���ϸ鼭 ������(��)�� ã�� ť�� ����
        for (i =0;i<4;i++)
		{
            nr = data.r + dr[i];
            nc = data.c + dc[i];
            //�� ��������� ��ŵ
			if(nr<1 || nr>R || nc<1 || nc>C) continue;
            //   ���� �ƴϸ� ��ŵ
			if(map[nr][nc] !=0 ) continue;
			//4]���� ������ ���� ť�� ����
            InQue(nr, nc, data.time +1);
            map[nr][nc]=1;
        }
    }
    return -1;//5] ť�� ��������
 
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
