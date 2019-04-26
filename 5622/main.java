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
		boolean check = false;
		int val=0;
		String [] tmp = {"","","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String a = bf.readLine();
		String []arr = new String[a.length()];		
		arr= a.split("");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 3; j < tmp.length; j++) {
				
				for (int j2 = 0; j2 < 3;j2++) {
					if (arr[i].charAt(0) == tmp[j].charAt(j2)) {
						check = true;
						val = j-1;
						break;
					}
					
				}
				if (check) {
//					System.out.print(val+" ");
					result = result + val; 
					check = false;	
					break;
				}
			}
		}
				
		
		System.out.println(result+a.length());
		
	
	}
}

class pair {
	int x, y;

	pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
