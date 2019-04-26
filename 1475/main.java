package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		HashMap< Integer, Integer> h = new HashMap<Integer, Integer>();
		h.put(6, 9);
		h.put(9, 6);
		int []tmp= new int[10];
		int cnt = 1;
		Arrays.fill(tmp, 1);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String []b = a.split("");

		for (int i = 0; i < a.length(); i++) {
			int num= Integer.parseInt(b[i]);
			if (tmp[num]>0) {
				tmp[num] =tmp[num]-1;
			}
			else
			{
				if (num == 6 || num == 9)
				{
					if (tmp[num] == 0) {
						if (tmp[h.get(num)] == 0) {
							Arrays.fill(tmp, 1);
							tmp[num] = tmp[num]-1;
							cnt++;
						}
						else {
							tmp[h.get(num)] = tmp[h.get(num)]-1;
						}
					}
				}
				else {
					Arrays.fill(tmp, 1);
					cnt++;
					tmp[num] =tmp[num]-1;
				}
			}

		}
		System.out.println(cnt);
	}
}

class pair {
	int x, y;

	pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
