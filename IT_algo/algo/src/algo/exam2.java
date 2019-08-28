package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class exam2 {

	static int []dx = {0,0,1,-1};
	static int []dy = {1,-1,0,0};
	static char[][]map;
	static int Rx,Ry,Bx,By,Tx,Ty,row,col;
	static Queue<Integer> q = new LinkedList<Integer>();
	static int visit1 [][];
	static int visit2 [][];


	public static void bfs()
	{

		q.add(Rx);
		q.add(Ry);
		q.add(Bx);
		q.add(By);
		visit1[Bx][By] =1;
		visit2[Rx][Ry] = 1;

		int count = 0;
		while (!q.isEmpty()) {

			int curRx = q.poll();
			int curRy = q.poll();
			int curBx = q.poll();
			int curBy = q.poll();

			for (int i = 0; i < dx.length; i++) {

				int NRx = curRx + dx[i];
				int NRy = curRy + dy[i];
				int NBx = curBx + dx[i];
				int NBy = curBy + dy[i];


				if (NBx < 0|| NBx >= row || NBy < 0 || NBy >= col || NRx < 0 || NRx >= row|| NRy >= col || NRy < 0 ) 
				{
					continue;
				}
				if (map[NBx][NBy] == 'H' || visit1[NBx][NBy] != 0) {
					continue;
				}

				if(map[NRx][NRy] == '.' &&visit2[NRx][NRy]==0) 
				{
					q.add(NRx);
					q.add(NRy);
					q.add(NBx);
					q.add(NBy);

					visit1[NRx][NRy] = 1;
					visit2[NRx][NRy] = visit2[curRx][curRy] + 1;

				}


				if (NRx == Tx && NRy == Ty || map[NRx][NRy] == 'H') {
					System.out.println(visit2[curRx][curRy]);
					return;
				}



			}

		}

	}

public static void main(String[] args) throws IOException{
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	st = new StringTokenizer(br.readLine());
	int testcnt = Integer.parseInt(st.nextToken());
	for (int i = 0; i < testcnt; i++) {
		q.clear();
		st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		map = new char[row][col];
		visit1 = new int[row][col];
		visit2 = new int[row][col];

		// ют╥б 
		for (int j = 0; j < row; j++) {
			String tmp = br.readLine();

			for (int j2 = 0; j2 < col; j2++) {
				char tmp2 = tmp.charAt(j2);
				if (tmp2 == 'R') {
					Rx = j;
					Ry = j2;
				}
				else if (tmp2 == 'B') {
					Bx = j;
					By = j2;
				}
				else if (tmp2 == 'H') {
					Tx = j;
					Ty = j2;
				}
				map[j][j2] = tmp2 ;
			}
		}

		bfs();

	}
}

}
