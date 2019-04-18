package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws IOException
	{
		 
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int []a = new int [5];
		int result =0;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(bf.readLine());
			a[i]=Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]<=40) {
				a[i]= 40;
			}
			result = result + a[i];
		}
		System.out.println(result/5);
		
	}
}

