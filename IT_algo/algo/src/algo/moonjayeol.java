package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class moonjayeol {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		char []a = br.readLine().toCharArray();
		if (65<=(int)a[0]&& (int)a[0] < 97  ) {

			for (int i = (int)a[0]; i < 91; i++) {
				System.out.print((char)i);
			}
		}
		else if (97<= (int)a[0] &&(int)a[0] <=122) 
		{

			for (int i = 97; i <= (int)a[0]; i++) {
				System.out.print((char)i);
			}
		}

		else {
			System.out.println("Error");
		}

	}
}
