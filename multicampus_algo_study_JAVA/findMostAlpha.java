package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findMostAlpha {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		int [] cnt = new int[1000];
		for (int i = 0; i <a.length; i++) {
			cnt[(int)a[i]]++;
		}
		int max = 0;
		int idx = 0;
		for (int i = (int)'a'; i <= (int)'z'; i++) {
			if (max < cnt[i]) {
			 	idx = i;
			 	max  = cnt[i];
			}
			
		}
		System.out.println((char)idx);
	}

}
