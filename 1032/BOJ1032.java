package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1032 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		char result[] = null;
		char tmp1 = 0;
		st= new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		String str[] = new String[cnt];
		for (int i = 0; i < cnt; i++) {

			str[i] = br.readLine();		

		}


		for (int i = 0; i < str[0].length(); i++) {
			
			char tmp = str[0].charAt(i);
			
			for (int j = 0; j < cnt; j++) 
			{
				tmp1= str[j].charAt(i);
				if (tmp == tmp1) 
				{
					continue;
				}
				else {
					tmp1= '?';
					break;
				}
			}
			System.out.print(tmp1);
		}

		
	}
}
