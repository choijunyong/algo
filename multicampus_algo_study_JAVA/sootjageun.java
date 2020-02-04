package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class sootjageun {


	static Queue<Integer> q = new LinkedList<Integer>();

	public static int div(int a)
	{
		int sum = 0;

		for (;;)
		{
			while(a>0)
			{                
				sum += (a%10);
				a/=10;
			}
			if (sum < 10) break;
			a = sum;
			sum = 0;
		}
		return sum;
	}




	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		LinkedList<Integer> l = new LinkedList<Integer>();
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken()); 
		int sol=0;
		int max =0;
		int tmp1= 0;
		
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st.nextToken());
			tmp1 = div(tmp);
			if (max < tmp1) {
				max = tmp1;
				sol = tmp;
			}
			else if (tmp1 == max) {
				if (sol > tmp) {
					sol = tmp;
				}

			}
		}

	}
}

