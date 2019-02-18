import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int c,r;
    static Stack<Integer> s = new Stack<Integer>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int line[][] = new int[1000][1000];
    static int nextrow=0;
    static int nextcol=0;
    static int[][]map;
    static boolean visit[][];
    static Queue<Integer> q=  new LinkedList<Integer>();
    static int row , col;

    static void BFS()
    {
        while (!q.isEmpty())
        {
            row = q.poll();
            col = q.poll();
            for (int i = 0; i <4 ; i++)
            {
                nextrow = row + dx[i];
                nextcol = col + dy[i];
                visit[row][col] =true;
                if ((nextcol < c && nextcol >=0) && (nextrow >=0 && nextrow < r))
                {
                    if (map[nextrow][nextcol] == 0  && !visit[nextrow][nextcol])
                    {
                        map[nextrow][nextcol] =1;
                        visit[nextrow][nextcol]=true;
                        line[nextrow][nextcol] = line[row][col]+1;
                        if (line[nextrow][nextcol] != 0) {
                            s.push(line[nextrow][nextcol]);
                        }
                        q.add(nextrow);
                        q.add(nextcol);
                    }
                }
            }
        }
// 행렬 확인
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=m ; j++) {
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//
//        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());
        c = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        map = new int[r][c];
        visit = new boolean[r][c];
        for (int i = 0; i < r; i++)
        {
            st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < c ; j++)
            {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 1) {

                    q.add(i);
                    q.add(j);

                }
            }
        }
        BFS();
        for (int i = 0; i < r; i++)
        {

            for (int j = 0; j < c ; j++)
            {
                if (map[i][j] == 0) {
                    System.out.println("-1");
                    return;
                }

            }
        }
        if (s.isEmpty()) {
            System.out.println(line[nextrow][nextcol]);
        }
        else {
            System.out.println(s.pop());
        }
    }
}