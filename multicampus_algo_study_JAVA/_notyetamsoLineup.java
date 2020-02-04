package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _notyetamsoLineup {

	static int hash = 200000;
	static int arr[];
	static int STEP = 7;
	static int max_id_cnt;
	
	public static int mk_id(int num)
	{
		int key = num % hash;
		while(arr[key] != 0) {
			
			if (arr[key] == num) {
				return key;
			}
			key = (key + STEP) % hash;
		}
		arr[key] = num;
		max_id_cnt++;
		return key;
		
		
		
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());		
		int cnt = Integer.parseInt(st.nextToken());
		arr = new int [cnt+1];
		
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int id = Integer.parseInt(st.nextToken());
			int new_id = mk_id(id);
			arr[Integer.parseInt(st.nextToken())] = new_id;
		}
		
		
		
	}

}
