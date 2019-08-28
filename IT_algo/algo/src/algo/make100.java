package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class make100 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		LinkedList<Integer>l = new LinkedList<Integer>();
	
		int sum = 0;
		int []arr = new int [9];
		
		for (int i = 0; i < 9; i++) {

			st = new StringTokenizer(br.readLine());
			arr[i]= Integer.parseInt(st.nextToken());
			sum = sum + arr[i];
		}
	
	
		for (int i = 0; i < 8; i++) {
			for (int j = i+1; j < 9; j++) {
				if (sum -(arr[i]+arr[j]) == 100) {
					 arr[i] = 0;
					 arr[j] = 0;
					break;
				}
			}
		}
	
		for (int i = 0; i < arr.length; i++) {
	
			if (arr[i]==0) {
				continue;
			}
			l.add(arr[i]);
		}
		l.sort(null);
		while (!l.isEmpty()) {
		
			System.out.println(l.poll());
			
		}
		
	}

}
