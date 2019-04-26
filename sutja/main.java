package exam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class main 
{
	static int[][] map;
	static Queue<Integer> q = new LinkedList<>();
	static Queue<pair> q1 = new LinkedList<>();
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	//	static int[][] map;
	static int[] edgemap;
	static boolean[][] visit;
	static int ver, edge, cnt, row, col,NX,NY;
	static List<Integer> l = new LinkedList<>();
	static int result = 0;

	public static void main(String[] args) throws IOException 
	{
		HashMap<String,String> hs = new HashMap<String, String>();
		hs.put("9", "구");
		hs.put("8", "팔");
		hs.put("7", "칠");
		hs.put("6", "육");
		hs.put("5", "오");
		hs.put("4", "사");
		hs.put("3", "삼");
		hs.put("2", "이");
		hs.put("1", "일");
		hs.put("0", "영");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String [] tmp2 = {"","만 ","억 ","조 ","경 "};
		String [] tmp3 = {"","십","백","천"};


		String tmp  = bf.readLine();
		int size =tmp.length()-1;
		String result="";
		int tmpSize = size / 4;
		
		if (tmpSize == 0) {
			tmpSize = +1 ;
		}
		
			
			for (int i = 0; i < tmp.length() ; i++) {
				result = result + hs.get(tmp.valueOf(tmp.charAt(i)));
				result = result + tmp3[size % 4];
				if (size % 4 ==  0 ) {
					result = result + tmp2[size/4];
				}
				size = size - 1;
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

