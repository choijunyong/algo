package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11399 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int [N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		Arrays.sort(arr);
		
		
		int result  =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				result = result+ arr[j];
			}
		}
		
		System.out.println(result);
	}

}
// 1+ 3 + 7+ 9 + 13 