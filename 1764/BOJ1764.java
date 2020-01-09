package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> s1 = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;


		st= new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String str[] = new String[N]; 
		for (int i = 0; i < N; i++) {
			str[i]= br.readLine();

		}
		Arrays.sort(str);
		
		for (int i = 0; i < M; i++) {
			String s = br.readLine();
			int idx = Arrays.binarySearch(str, s);
			if (idx >= 0) {
				s1.add(s);
			}
		}
		Collections.sort(s1);
		System.out.println(s1.size());
		for (int j = 0; j < s1.size(); j++) {
			System.out.println(s1.get(j));
		}
	}
}