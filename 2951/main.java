package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class main {

	public static void main(String[] args) throws IOException
	{

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int []result = new int [1000];
		boolean check = false;
		int sum =0;
		Queue<Integer>q = new LinkedList<Integer>();
		st = new StringTokenizer(bf.readLine());
		int n =Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int m =Integer.parseInt(st.nextToken());
		boolean isPrime = false;
		for (int i = n; i <= m; i++) 
		{
			
			if (i == 1) {
				continue;
			}
			isPrime = false;
			for (int j = 2; j < i; j++) 
			{
				if (i%j == 0) 
				{
					isPrime = true;
					break;
				}
			}
			if (!isPrime) 
			{
				q.add(i);
				check = true;
			}
			
		}
		int size = q.size();
		System.out.println(size);
	}
}

