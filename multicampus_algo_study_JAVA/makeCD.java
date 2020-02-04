package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class makeCD {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		LinkedList<Integer>l = new LinkedList<Integer>();

		st = new StringTokenizer(br.readLine());
		int size = Integer.parseInt(st.nextToken());
		int capa = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; ; i++) {

			if (!st.hasMoreTokens())
			{
				break;
			}
			l.add(Integer.parseInt(st.nextToken()));
		}
		l.sort(null);
		int result = 0;
		int cnt=0;
		while (!l.isEmpty()) {
			result = result + l.poll();
			if ( capa < result) {
				break;
			}
			cnt++;
		}

		System.out.println(cnt);
	}

}
