package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class yeasan {

	
	static int arr[];

	static int cnt;
	static int chong;
	public static int check(int M)
	{
		
		int sum =0;
		for (int i = 0; i < cnt; i++) {
			if (arr[i] > M) {
				sum = sum + M;
			}
			else {
				sum = sum + arr[i];
			}
			if (sum > chong) {
				return 0;
			}
		}
		
		return 1;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st= new StringTokenizer(br.readLine());
		cnt = Integer.parseInt(st.nextToken());
		arr = new int [cnt];
		st = new StringTokenizer(br.readLine());
		int max = 0 ;
		for (int i = 0; i < arr.length; i++) {
			int tmp =  Integer.parseInt(st.nextToken());
			if (max < tmp) {
				max = tmp;
			}
			arr[i] = tmp;
		}
		st = new StringTokenizer(br.readLine());
		chong = Integer.parseInt(st.nextToken());
		int first = 1;
		int last = max;
		int sol = 0;


			while(first <= last)
			{
				int mid = (first + last) / 2;
				if (check(mid) == 1) {
					first = mid + 1;
					sol = mid;
				}
				else {
					last = mid -1;
					
				}
			}
		
		System.out.println(sol);
	}

}
