package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cuttingcake {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int line1ver = Integer.parseInt(st.nextToken());
		int line2ver = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int line3ver = Integer.parseInt(st.nextToken());
		int line4ver = Integer.parseInt(st.nextToken());

		if (line1ver<= line3ver&& line3ver <= line2ver) {
			System.out.println("cross");
		}
		else if (line1ver<= line4ver && line4ver<= line2ver) {
			System.out.println("cross");
		}
		else if (line1ver>= line3ver && line3ver >= line2ver) {
			System.out.println("cross");
		}
		else if (line1ver>= line4ver && line4ver >= line2ver) {
			System.out.println("cross");
		}
	
		else {

			System.out.println("not cross");
		}


	}

}
