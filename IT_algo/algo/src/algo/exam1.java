package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class exam1 {

	static int arr[];
	static int treecnt, gettree,last, first;


	public static int check(int Mid)
	{

		int sum =0;
		for (int i = 0; i < treecnt; i++) {
			
			if (arr[i] > Mid) {
				;
			}
		
			if (sum < gettree) {
				return 0;
			}
		}

		return 1;
	}




	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		treecnt = Integer.parseInt(st.nextToken());
		gettree = Integer.parseInt(st.nextToken());

		arr = new int [treecnt];
		st = new StringTokenizer(br.readLine());
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if (max < tmp) {
				max = tmp;
			}
			arr[i] = tmp; 
		}
		last = max;
		first = 1;
		int sol = 0;
		while(first <= last)
		{

			int mid = ( first + last ) /2 ; 
			if (check(mid) == 1 ) {
				
				last = mid -1;
				sol = mid;
				

			}
			else {
				first = mid + 1;

			}

		}

		System.out.println(sol);
	}
	
	

}
