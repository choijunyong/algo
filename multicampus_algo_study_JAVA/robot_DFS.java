package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class robot_DFS {

	static int [][]map = new int[10][10];
	static boolean [][]visit = new boolean[10][10];

	static int []dx = {0,0,1,-1};
	static int []dy = {1,-1,0,0};
	static int result = 1;

	public static void dfs(int x, int y )
	{




	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] gwa = new int [100]; 
		StringTokenizer ro;


		/* �׽�Ʈ ���̽� �Է� �ޱ� */
		ro = new StringTokenizer(br.readLine());
		int testcnt = Integer.parseInt(ro.nextToken());

		/* �κ� �� ���� ���� �Է� �ޱ�*/
		for (int i = 0; i < testcnt; i++)
		{
			ro = new StringTokenizer(br.readLine());
			int cnt1 = Integer.parseInt(ro.nextToken());

			/* ���� ��ǥ �Է� �ޱ�*/
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < st.countTokens(); j++) {
				gwa[i] = Integer.parseInt(st.nextToken());
			}

			ro = new StringTokenizer(br.readLine());
			for (int j = 0; j < cnt1; j++) {

				int RX = Integer.parseInt(ro.nextToken());
				int RY = Integer.parseInt(ro.nextToken());

				dfs(RX,RY);
			}





		}
	}

}
