package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class binarySearch {
	static int j;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int []arr = new int[Integer.parseInt(st.nextToken())+1];


		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < arr.length; i++) 
		{
			arr[i] = Integer.parseInt(st.nextToken());

		}

		st = new StringTokenizer(br.readLine());
		int []chk = new int [Integer.parseInt(st.nextToken())+1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < chk.length; i++) {
			chk[i] = Integer.parseInt(st.nextToken());
		}




		for (int j = 1; j < chk.length; j++) {
			int first = 1;
			int last = arr.length-1;

			while(first <= last) {

				
				
				int mid = (first + last)/2; 
				if (arr[mid] > chk[j]) {
					last = mid - 1;

				}
				else if (arr[mid] < chk[j]) {
					first = mid + 1;
				} 
				else if (arr[mid] == chk[j]) {
					System.out.println(mid);
					break;

				}
				if (first > last) {
					System.out.println("0");	
				} 
				
				
		

			}

		}

	}

}
