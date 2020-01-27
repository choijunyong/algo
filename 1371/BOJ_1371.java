package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



public class BOJ_1371 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
		int arr[] = new int [300];
		String tmp;
		while((tmp = br.readLine()) != null) {
			if (tmp.equals("") && sc.hasNextLine()) {
				break;
			}
			tmp.replace(" ", "");
			for (int i = 0; i < tmp.length(); i++) {
				arr[(int)tmp.charAt(i)]++;
			}
		}
		int max = findmax(arr);
		
		for (int i = 97; i <= 122; i++) {
			
			if (max == arr[i]) {
				System.out.print((char)i+"");
			}
		}
	}
	public static int findmax(int arr[])
	{
		int max = -999999;
		for (int i = 97; i <= 122; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}