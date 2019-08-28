package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class changgo {

	static int []arr = new int [1001];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int max= 0;
		int maxidx = 0;
		int maxidx1 = 0; 
		st = new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());

			if (max <= value) {
				max = value;
				maxidx = idx;
			}
			if (maxidx1 < idx) {
				maxidx1 = idx;
			}
			arr[idx]= value;

		}


		int tmpmax = 0;
		int result = 0;
		for (int i = 0; i < maxidx; i++) {


			if (tmpmax <= arr[i]) {
				tmpmax = arr[i];
			}
			else {
				arr[i] = tmpmax;
			}

		}
		tmpmax = 0;
		for (int i = maxidx1; i > maxidx; i--) {


			if (tmpmax <= arr[i]) {
				tmpmax = arr[i];
			}
			else {
				arr[i] = tmpmax;
			}

		}
		for (int i = 0; i < maxidx; i++) {
			result = result+ arr[i];
		}
		for (int i = maxidx1; i >= maxidx; i--) {
			result = result+ arr[i];
		}
		System.out.println(result);


	}

}
