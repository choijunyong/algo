package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetmirro {

	static char [][]map;
	static int []move = {1,-1,-1,1};
	static boolean [][]visit;
	static int []move1;
	
	
	
//	public static void simul(int startX , int StartY) 
//	{
//	
//		visit[StartY][startX] = true;
//		int cnt = 0;
//		int result = 0;
//		
//		while(true)
//		{
			
//			if (move1[cnt] == 1) {
//				if ((map[StartY+1][startX] =='0' && !visit[StartY][startX]) && (startX > 5 || startX >= 0 ) && ) {
//					visit[StartY+1][startX] =true;	
//					
//				}
//				else {
//					cnt++;
//				}
//				
//			}
//			else if (move1[cnt] == 2) {
//				
//			}
//			
//		}
//		
//		
//	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());

		map = new char[cnt][cnt];
		visit = new boolean[cnt][cnt];
		for (int i = 0; i < cnt; i++) {
			String a = br.readLine();
			for (int j = 0; j < cnt; j++) {
				map[i][j] = a.charAt(j);
			}

		}
		st = new StringTokenizer(br.readLine());
		int movcnt = st.countTokens();
		move1 = new int[movcnt];

		for (int i = 0; i < movcnt; i++) {

			move1[i] = Integer.parseInt(st.nextToken());
		}
//		 simul(0,0);




		//		for (int i = 0; i < cnt; i++) {
		//			for (int j = 0; j < cnt; j++) {
		//				System.out.print(map[i][j]+" ");
		//			}
		//			System.out.println();
		//		}
	}

}
