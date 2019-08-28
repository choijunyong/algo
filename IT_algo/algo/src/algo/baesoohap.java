package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baesoohap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int max =0;
		int result = 0;
		for (int i =1;;i++) {
		
			max = num *i;
			
			if (result + max >= 10000) {
				System.out.println(num*(i-1));
				break;
			}

			result = result + max;
			
			
			
		}

		
	}

}
