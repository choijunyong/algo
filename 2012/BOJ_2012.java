package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_2012 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine());
		int TestCase = Integer.parseInt(st.nextToken());	
		long result = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 1; i <= TestCase; i++) {
			st = new StringTokenizer(br.readLine());
			int idx =  Integer.parseInt(st.nextToken());
			arr.add(idx);
		}
		
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			int tmp = (i+1) - arr.get(i);
			result = tmp < 0 ? -tmp + result : tmp + result;
			
		}
		System.out.println(result);
	}
}

