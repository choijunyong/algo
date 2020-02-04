
#include <stdio.h>
 
int N;
char s[ 100000 + 10 ][ 20 + 10 ];
 
int strcmp( const char *s1, const char *s2 )
{
	/*
    for ( ;;) {
        if ( *s1 > *s2 ) return 1;
        else if ( *s1 < *s2 ) return -1;
        else if ( *s1 == 0 ) return 0;
        s1++;
        s2++;
    }
	*/
	int i;
	for(i=0; (s1[i]==s2[i] && s1[i]!=0);  i++);
	return s1[i]-s2[i];
}
 
int main( void )
{
    int i;
    int j, cnt, unique = 1;
 
 
    scanf( "%d", &N );
 
    for ( i = 1; i <= N; i++ ) 
	{
        scanf( "%s", s[ i ] );
    }
 
 
    for ( i = 1; i < N; i++ ) 
	{
        cnt = 0;
        if ( s[ i ][ 0 ] == 0 ) continue;
 
        for ( j = i + 1; j <= N; j++ ) 
		{
            if ( s[ j ][ 0 ] == 0 ) continue;
            if ( strcmp( s[ i ], s[ j ] ) == 0 ) 
			{
                if ( cnt == 0 )  printf( "%s %d %d", s[ i ], i, j );
				else  printf( " %d", j );
                cnt++;
                s[ j ][ 0 ] = 0;
                unique = 0;
            }
        }
        if ( cnt ) printf( "\n" );
    }
 
    if ( unique ) printf( "unique" );
 
    return 0;
}
