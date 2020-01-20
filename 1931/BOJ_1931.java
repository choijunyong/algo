package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;



public class BOJ_1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<a> l = new ArrayList<a>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			l.add(new a(c,d));
		}


		Collections.sort(l, new Comparator<a>(){

			@Override
			public int compare(a o1, a o2) {
				// TODO Auto-generated method stub
				if (o1.ggt > o2.ggt) {
					return 1;
				}
				if(o1.ggt < o2.ggt) {
					return -1;
				}
				System.out.println("빼기:"+(o1.si - o1.ggt));
				return o1.si - o1.ggt;
			}
		});

		int ggt = l.get(0).ggt;
		int cnt = 1;

		System.out.println("  si:"+l.get(0).si+"   ggt:"+l.get(0).ggt);
		for (int i = 1; i < n; i++) {
			
			System.out.println("  si:"+l.get(i).si+"   ggt:"+l.get(i).ggt);

			if (l.get(i).si < ggt) {
				continue;
			}
			else {
				ggt = l.get(i).ggt;
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}



class a {
	int si;
	int ggt;

	public a(int si, int ggt) {
		// TODO Auto-generated constructor stub
		this.si = si;
		this.ggt =ggt;
	}
}
