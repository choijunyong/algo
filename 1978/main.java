package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws IOException {

		String a;
		int cnt=0; 
		boolean check = false;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ; 
		a = bf.readLine();
		int []map = new int [Integer.parseInt(a)];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < Integer.parseInt(a); i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < map.length; i++) {
			for (int j = 2; j <= map[i]; j++) {
				if (map[i]==1) {
					break;
				}
				else if (map[i]%j==0) {
					if (map[i]==j) {
						check = true;
					}
					else	
					{
						break;
					}
				}
			}
			if (check) {
				cnt++;
				check = false;
			}
		}
		System.out.println(cnt);

	}
}


