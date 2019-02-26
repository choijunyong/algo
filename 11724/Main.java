import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    static int result=0;
    static boolean []visit ;
    static int ver;
    static int [][]map ;
    static int a=0;
    static int  cnt = 0;
    //    static Queue<Integer> q = new LinkedList<Integer>();
    static void DFS(int Node)
    {

        visit[Node] = true;
        for (int i = 1; i < ver+1; i++) {


            if (map[Node][i] == 1 && visit[i] == false) {
                DFS(i);
            }

        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());

        int edge;

        ver = Integer.parseInt(st.nextToken());
        map= new int[ver+1][ver+1];
        edge = Integer.parseInt(st.nextToken());


        for (int i = 0; i < edge; i++)
        {
            st = new StringTokenizer(bf.readLine());
            int here =Integer.parseInt(st.nextToken());
            int next = Integer.parseInt(st.nextToken());
            map[here][next] =1;
            map[next][here] = 1;


        }
        visit = new boolean[ver+1];
        for (int i = 1; i <= ver; i++) {
            for (int j = 1; j <= ver; j++) {
                if (!visit[i]) {

                    DFS(i);
                    cnt++;
                }
            }
        }
       
        System.out.println(cnt);
    }
}