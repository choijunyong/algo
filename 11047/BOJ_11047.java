package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11047 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int cnt =0;
		
		for (int i = N-1; i >= 0; i--) {
			for (int j = 1; ; j++) {
			
				if (K-arr[i] < 0) {
					break;
				}
				else {
					
					K = K - arr[i];
					cnt++;
					
				}
			}
			if (K== 0) {
				break;
			}
			
			
		}
		System.out.println(cnt);
		
		

	}

}
