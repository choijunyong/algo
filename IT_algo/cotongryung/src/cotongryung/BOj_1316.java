package cotongryung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOj_1316 {
	
	static int result;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		for (int i = 0; i < cnt; i++) {
			
			char []tmp = br.readLine().toCharArray();
			boolean []chk = new boolean[tmp.length]; 
			for (int j = 0; j < tmp.length; j++) {
				
				chk [tmp[j]-'a'] = true;
				for (int j2 = j+1; j2 < chk.length; j2++) {
					if (chk [tmp[j]-'a']) {
						chk[j] = true;
					}
					else {
						
						chk[j] = true;
					}
				}
				
				
			}
			
			
		}
	}

}
