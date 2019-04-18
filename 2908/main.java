package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		String []a = new String [40];
		String tmp ;
		 
		
		for (int i = 0; i < 40; i++) 
		{
			if (!st.hasMoreTokens())break;
			a[i]=st.nextToken();
		}
		
			int c =Integer.parseInt(a[0]);
			int d = Integer.parseInt(a[1]);
			
			int new_c = (c%10) *100 + ((c%100)/10) *10 + c/100;
			int new_d= (d%10) *100 + ((d%100)/10) *10 + d/100;
			
			if (new_c>new_d) {
			 System.out.println(new_c);
			}
			
			else System.out.println(new_d);
		
	}
}

