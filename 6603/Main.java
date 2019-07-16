package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class Main {
	static int [] array;
	static int [] visit;
	static int cnt;
	
	public static void dfs(int start, int depth) {
		if( depth == 6 ) {
			for(int i = 0 ; i < cnt; i++) {
				if(visit[i] == 1) {
					System.out.print( array[i] + " ");
				}
			}
			System.out.println();
		}
		
		for(int i = start; i < cnt; i++) {
			visit[i] = 1;
			dfs( i + 1, depth+1);
			visit[i] = 0;
		}

		
	}
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 

		while(true) {
			st = new StringTokenizer(bf.readLine());
			cnt = Integer.parseInt(st.nextToken()); 

			if (cnt == 0) {
				break;
			}
			array = new int[cnt+1];
			visit = new int[cnt+1];
			for (int i = 0; i < cnt; i++) {
				array[i] = Integer.parseInt(st.nextToken());
			}
			dfs(0,0);
			System.out.println();
		}


	}

}