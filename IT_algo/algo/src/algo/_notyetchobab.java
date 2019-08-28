package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class _notyetchobab {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int dishcnt = Integer.parseInt(st.nextToken());
		int chobabcnt = Integer.parseInt(st.nextToken());
		int contidish = Integer.parseInt(st.nextToken());
		int coupon  = Integer.parseInt(st.nextToken());
		int []gaji = new int [chobabcnt+1];
		int []arr = new int[dishcnt];
		//LinkedList<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < dishcnt; i++) {

			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());

		}

		int max = 0;
		int result = 1;
		arr[coupon]=1;
		
		int idx = 0; 
		for (int i = 0; i < idx+contidish; i++) {
			
			if (i+1 == idx+contidish) {
				
				if (max < result) {
					max = result;
					result = 1;
					gaji = new int [chobabcnt+1];
					idx++;
					i = idx;
					
				}

			}
			if (gaji[arr[i]] == 0) {
				gaji[arr[i]]++;
				result ++;
			}
		
			
		}
		System.out.println(max);

	}

}
