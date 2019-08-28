package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class numcount {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int [] arr = new int [cnt+1];
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= arr.length; i++) {
			arr[i]	= Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int []check = new int[Integer.parseInt(st.nextToken())+1];
		for (int i = 1; i < check.length; i++) {
			check[i] = Integer.parseInt(st.nextToken());	
		}

	}

}
