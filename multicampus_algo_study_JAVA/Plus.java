package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Plus {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String b ="";
		String c = "";
		st = new StringTokenizer(br.readLine());
		char[] a= st.nextToken().toCharArray();
		long result = Long.parseUnsignedLong(st.nextToken());	
		long result1 =0 ;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] =='0' && a[i+1] == 0) 
			{
				continue;
			}
			
			c= c +String.valueOf(a[i]);
			b= "";
			
			for (int j = i+1; j < a.length; j++)
			{
				if (a[j] == '0'&& a[j+1]=='0') 
				{
					continue;
				}
				else {
	
				b= b +String.valueOf(a[j]);
				}
			}

			if (b=="") 
			{
				System.out.println("NONE");
				break;
			}
			long tmp2 = Long.parseUnsignedLong(c);
			long tmp3 = Long.parseUnsignedLong(b);
		
			result1= tmp2 + tmp3;
			if (result1 == result) {
				System.out.println(tmp2+"+"+tmp3+ "="+ result);
				break;
			}
			else {
				tmp2= 0;
				tmp3 = 0;
			}
		}
	}
}


