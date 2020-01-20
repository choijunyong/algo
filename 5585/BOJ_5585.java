package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5585 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int money = 1000;
		int jan = money - N;
		int arr[] = {500,100,50,10,5,1};
		int cnt = 0;
		
		
		for (int i = 0; i < arr.length; i++) {
			for (; ;) {
				if (jan - (arr[i]) < 0) {
					break;
				}	
				else {
					jan = jan - arr[i];
					cnt++;
					
				}
			}
			if (jan <= 0) {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
