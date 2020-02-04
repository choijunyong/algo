package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _notyetcountKOI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[]tmp = br.readLine().toCharArray();
		int[] cnt = new int[2];
		int i = 0;
		int j = 0;
		while (true) {
			for (j = i; j <= (i*2); j++) {
				System.out.println(tmp[j]);
				
			}
			System.out.println();
			i++;
			if (i== tmp.length) {
				break;
			}
			
		}
		
		//KOIOIOI
	}

}
