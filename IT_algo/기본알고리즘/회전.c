#include <stdio.h>
 
int N;
int a[50+10][50+10];
int b[50+10][50+10];
 
void rotate_90(void)
{
    for(int  i=0; i<N; i++)
        for(int j=0; j<N; j++)
            b[j][N-1-i] = a[i][j];
}
 
void rotate_180(void)
{
	for(int i=0; i<N; i++)
        for(int j=0; j<N; j++)
            b[N-1-i][N-1-j] = a[i][j];
}
void rotate_270(void)
{
    for(int i=0; i<N; i++)
        for(int j=0; j<N; j++)
            b[N-1-j][i] = a[i][j];
}
 
void rotate_360(void)
{
    for(int i=0; i<N; i++)
        for(int j=0; j<N; j++)
            b[i][j] = a[i][j];
}
 
int main(void)
{
    int i, j, angle;
 
    scanf("%d", &N);
    for(i=0; i<N; i++)
    {
        for(j=0; j<N; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
 
    for(;;)
    {
        scanf("%d", &angle);
        if(angle == 0) break;
        else if(angle == 90)
        {
            rotate_90();
        }
        else if(angle == 180)
        {
            rotate_180();
        }
        else if(angle == 270)
        {
            rotate_270();
        }
        else if(angle == 360)
        {
           rotate_360();
        }
        else
        {
            continue;
        }
 
        for(i=0; i<N; i++)
        {
            for(j=0; j<N; j++)
            {
                printf("%d ", b[i][j]);
                a[i][j] = b[i][j];
            }
            printf("\n");
        }
    }
 
    return 0;
}



