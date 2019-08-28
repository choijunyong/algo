package algo;

import java.io.IOException;

public class gooseul_dfs {
	static int []a = { 2, 5, 7 };  // 구슬
	static int []b= new int[3];     // 구슬을 담을 상자
	static int []chk = new int [3];      // 체크배열
	static int N = 3;      
	public static void dfs(int num)
	{
		if (N  <= num) {
			for (int i = 0; i < N; i++) {
				System.out.print(b[i]+" ");
				
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (chk[i] == 1) {
				continue;
			}
			b[num] = a[i];
			chk[i] = 1;
			dfs(num+1);
			chk[i] = 0;
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		dfs(0);
	}
}
