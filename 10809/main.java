package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main {
	static int[][] map;
	static Queue<Integer> q = new LinkedList<>();
	static Queue<pair> q1 = new LinkedList<>();
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	// static int[][] map;
	static int[] edgemap;
	static boolean[][] visit;
	static int ver, edge, cnt, row, col, NX, NY;
	static List<Integer> l = new LinkedList<>();
	static int result = 0;


	public static void main(String[] args) throws IOException 
	{
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		h.put('a', 1);
		h.put('b', 2);
		h.put('c', 3);
		h.put('d', 4);
		h.put('e', 5);
		h.put('f', 6);
		h.put('g', 7);
		h.put('h', 8);
		h.put('i', 9);
		h.put('j', 10);
		h.put('k', 11);
		h.put('l', 12);
		h.put('m', 13);
		h.put('n', 14);
		h.put('o', 15);
		h.put('p', 16);
		h.put('q', 17);
		h.put('r', 18);
		h.put('s', 19);
		h.put('t', 20);
		h.put('u', 21);
		h.put('v', 22);
		h.put('w', 23);
		h.put('x', 24);
		h.put('y', 25);
		h.put('z', 26);
		int cnt = 0 ;
		int []a = new int [h.size()+1] ;
		boolean [] d = new boolean[h.size()+1];
		for (int i = 1; i <= h.size(); i++) {
			a[i] = -1;
			d[i] = false;
		}
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String  b = bf.readLine();
		
		for (int i = 0; i < b.length(); i++) {
		 int c = h.get(b.charAt(i));
		 if (d[c] == false) {
			 d[c] = true;
			 a[c] =cnt;
			 
		}
		 cnt++;	
		 
		}
		for (int i = 1; i <= h.size(); i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}

class pair {
	int x, y;

	pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
