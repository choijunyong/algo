
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int result;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		int sol = cnt;
		for (int i = 0; i < cnt; i++) {

			char []tmp = br.readLine().toCharArray();
			boolean []chkAlpha = new boolean[26];
			for (int j = 1; j < tmp.length; j++) {

				
				if (chkAlpha[tmp[j]-'a']) {
					sol--;
					break;
				}
				if (tmp[j-1] == tmp[j]) {
						continue;
					}
					
					else {
						chkAlpha[tmp[j-1]-'a'] = true;
					}
						
					
				
			}
			
		}
		System.out.println(sol);
	}
}


