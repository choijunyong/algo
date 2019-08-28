package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920_findsoo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int [N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int findarr[] = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			findarr[i] = Integer.parseInt(st.nextToken());
		}

	
	
		
		for (int i = 0; i < findarr.length; i++) {
			int first = 0;
			int last = arr.length -1;				
			
			while (last >= first) {
				int mid  = (first + last)/2;
				if (arr[mid] > findarr[i]) {
					last = mid - 1;
				}
				else if (arr[mid] <  findarr[i]) {
					first = mid + 1;
				}
				else if (arr[mid] == findarr[i]) {
					System.out.println("1");
					break;
				}
				if (first > last) {
					System.out.println("0");
					break;
				}
				
				
				
			}

		
		}


	}


}
