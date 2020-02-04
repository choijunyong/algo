package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class unique {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		boolean []chk  = new boolean[cnt+1];
		String[]tmp  = new String[cnt+1];
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= cnt; i++) {
			tmp[i] = st.nextToken();

		}
		boolean chk1 =false ;
		for (int i = 1; i <= cnt; i++) {
			String a = tmp[i];
			int cnt1 = 0 ;

			if (chk[i] == true) {
				continue;
			}
			for (int j = i + 1; j <= cnt; j++) {

				if (a.equals(tmp[j]))
				{
					if (cnt1 == 0 ) {
						System.out.print(a+" "+i+" "+j+" ");
						cnt1++;
						chk[j] = true;
						chk1 = true;
					}
					if (chk[j] == false) {
						chk[j] = true;
						System.out.print(j+" ");
						chk1 = true;
					}
				}

			}
			if (!chk1) {
				continue;
			}
			System.out.println();	
			cnt1 = 0;
		}
		if (!chk1) {
			System.out.println("unique");
		}

	}

}



