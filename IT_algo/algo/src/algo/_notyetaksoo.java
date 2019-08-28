package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _notyetaksoo {


	static String [][]arr; 
	static int []dx = {0,0,1,-1,1,1,-1,-1};
	static int []dy = {1,-1,0,0,1,-1,1,-1};
	static int nx,ny;
	public static void main(String[] args) throws IOException {

		Queue<Integer>q = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		arr = new String[row][col];
		for (int i = 0; i < row; i++) {
			String tmp = br.readLine();
			String []tmp1 = tmp.split("");
			for (int j = 0; j < tmp1.length; j++) {
				arr[i][j] = tmp1[j];
			}
		}

		int mcheck = 0;
		int check =0 ;
		int maxnum = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j].equals(".")) 
				{
					for (int j2 = 0; j2 < dx.length; j2++)
					{
						nx  = i + dx[j2];
						ny = j + dy[j2];
						if (nx < 0 || nx >= row || ny >= col ||ny < 0) 
						{
							continue;
						}
						if (arr[nx][ny].equals("o")) 
						{
							mcheck ++;
						}
					}
				}
				if(maxnum < mcheck)
				{
					maxnum = mcheck;
					mcheck = 0;
				}
				else 
				{
					mcheck = 0;
				}
					
			}
			
		}
		System.out.print(maxnum);



 
	}

}
