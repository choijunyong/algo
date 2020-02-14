package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1759_makePassword {


	static boolean visit[];
	static char arr[];
	static int Depth;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Depth= Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		arr = new char[N];
		visit = new boolean[N];
		st = new StringTokenizer(br.readLine());
		String tmp="";
		for (int i = 0; i < N; i++) {
			tmp = tmp+ st.nextToken();
		}

		arr = tmp.toCharArray();
		Arrays.sort(arr);
		DFS(0,0);

	}

	public static void DFS(int start , int depth) {

		if(depth == Depth) {
			print();
			return;
		}
		for (int i = start; i < arr.length; i++) {
			visit[i] = true;
			DFS(i+1, depth+1);
			visit[i] = false;
		}
	}

	public static void print() {
		
		int mocnt = 0;
		int jacnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(visit[i]) {
				if(arr[i] == 'a'|| arr[i] == 'o' ||arr[i] ==  'u' || arr[i] ==  'e'|| arr[i] == 'i')
				{
					
					mocnt++;
				}
				else {
					jacnt++;
				}
			}
		}
		if (mocnt >= 1 && jacnt >=2) {
			for (int i = 0; i < arr.length; i++) {
				if (visit[i]) {
					System.out.print(arr[i]+"");
				}
			}
			System.out.println();	
		}

		
		

	}

}
