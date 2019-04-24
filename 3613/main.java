package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
	static ArrayList<Integer>[] map;
	static Queue<String> q = new LinkedList<>();
	static Queue<Integer> q1 = new LinkedList<Integer>();
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	//	static int[][] map;
	static int[] edgemap;
	static boolean[] visit;
	static int ver, edge, cnt, row, col;
	static List<Integer> l = new LinkedList<>();
	static int result = 0;

	public static void main(String[] args) throws IOException {


		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		char []a = new char [150];
		a= bf.readLine().toCharArray();
		int type =0;
		String result="";
		int c = 0;
		int com =0;
		String tmpx = "_";


		for (int i = 0; i < a.length; i++) {
			if (a[i]=='_')  
			{
				if (type==2) {
					System.out.println("\"Error!\"");
					return;
				}
				type =1;


			}
			else if(a[i] >= 'A' && a[i] <='Z')
			{
				if (type==1) {
					System.out.println("\"Error!\"");
					return;
				}
				type =2 ;

			}
			else {
				if(type == 1|| type ==2)
					{continue;
					
					}
				type =3;
			}





		}

		if (type==1) {


			for (int i = 0; i < a.length; i++) {
	
				if (a[i]=='_') {
					
					if (i == a.length-1) {
						continue;
					}
					
					char tmp1= a[i+1];
					String tmp =String.valueOf(tmp1);
					result = result + tmp.toUpperCase();
					c=1;
					
					
				}
				else if(c==0)
				{
					result = result + a[i];

				}
				else
					c=0;
				continue;
			}
			System.out.println(result);
		}


		else if (type ==2 )
		{


			for (int i = 0; i < a.length; i++) {
				if (a[i] >= 'A' && a[i]<='Z') {
					char tmp1= a[i];
					String tmp4 = String.valueOf(tmp1);
					result = result + tmpx;
					result = result +tmp4.toLowerCase();

				}
				else
				{
					result = result + a[i];

				}

			}
			System.out.println(result);

		}
		else if(type ==3)
		{
			for (int i = 0; i < a.length; i++) {
				result = result + a[i];
			}
			System.out.println(result);
		}

	}

	
	class pair {
		int x, y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}


	}
}
