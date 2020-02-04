package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class geunmoo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Queue<Double>q = new LinkedList<Double>();

		for (int i = 0; i < 5; i++) {

			st = new StringTokenizer(br.readLine());
			double Start = Double.parseDouble(st.nextToken());
			double end = Double.parseDouble(st.nextToken());
			double cha = end - Start;

			if (cha >= 5) {
				q.add(4.0);
			}
			else if (cha  <= 1) {
				q.add(0.0);

			}
			else {
				cha= cha -1.0;
				q.add(cha);
			}
		}
		double result = 0;
		while(!q.isEmpty())
		{
			result = result+q.poll();
		}
		if (result  >= 15 ) {
			double a= (result/0.5)*5000;
			System.out.println((int)(a-(a*0.05)));
		}
		else if (result <5)
		{
			double a= (result/0.5)*5000;
			System.out.println((int)(a+(a*0.05)));
		}
		else {
			
			double a= (result/0.5)*5000;
			System.out.println((int)a);
		}
	}
}
