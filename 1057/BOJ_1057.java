package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1057 {

	static boolean visit[];
	static int N,kim,im;
	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		kim = Integer.parseInt(st.nextToken());
		im = Integer.parseInt(st.nextToken());
		int cnt = 0;
		while(kim != im) {

			kim = kim/2 + kim%2;
			im = im /2 + im%2;
			cnt++;
		}

		System.out.println(cnt);

	}


}
// 조건 : 끝자리 홀수면 무조건 마지막은 이긴거
// 김과 임은 만나기 전까지 무조건 승 
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//1 2 	1      1
// 3 4  3				8
// 5 6  5		8
// 7 8  8				9
//9 10  9		9
// 11 12 11
//13 14 13		13
//15 16 15
//