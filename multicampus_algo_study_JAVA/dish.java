package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class dish {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Character> q = new LinkedList<Character>();
		char[]a = br.readLine().toCharArray();
		int result = 10;


		for (int i = 1; i < a.length; i++) {

			if (a[i] == a[i-1]) {
				result += 5;
			}
			else {
				result +=10;
			}

		}
		System.out.println(result);
	}
}
