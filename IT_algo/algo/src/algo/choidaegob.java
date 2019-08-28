package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class choidaegob {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		LinkedList<Double>l = new LinkedList<Double>();
		st= new StringTokenizer(br.readLine());
		int cnt = Integer.parseInt(st.nextToken());
		double []arr = new double[cnt];
		for (int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());

			arr[i] = Double.parseDouble(st.nextToken());

		}
		double max =0;
		for (int i = 0; i < arr.length; i++) {
			double tmp = arr[i];
			
			for (int j = i+1; j < arr.length; j++) {
				if (max<=tmp) {
					max = tmp;
					
				}
				tmp = tmp*arr[j];
			

			}

		}
		System.out.println(String.format("%.3f", max));



	}

}
