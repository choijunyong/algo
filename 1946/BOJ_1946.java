package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;



public class BOJ_1946 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<chijik> arr= new ArrayList<chijik>();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int TestCase = Integer.parseInt(st.nextToken());

		for (int i = 0; i < TestCase; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				int su = Integer.parseInt(st.nextToken());
				int myun = Integer.parseInt(st.nextToken());

				arr.add(new chijik(su,myun));				
			}
			Collections.sort(arr);
			
			int min = 99999999;
			for (int j = 0; j < arr.size();) {
				
				if (min > arr.get(j).myun) {
					min = arr.get(j).myun;
					j++;
					}
				else arr.remove(j);

			}
			
			System.out.println(arr.size());
			arr.clear();
		}
	}
}
class chijik implements Comparable<chijik>{

	int su;
	int myun;
	public chijik(int su , int myun) {
		// TODO Auto-generated constructor stub
		this.su = su;
		this.myun = myun;
	}

	@Override
	public int compareTo(chijik o) {
		// TODO Auto-generated method stub
		if (this.su < o.su) {
			return -1;
		}
		else if(this.su > o.su) {
			return 1;

		}
		return this.su - this.myun;
	}

}


