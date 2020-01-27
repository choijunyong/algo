package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_10989_1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String tmp= br.readLine();
		int cnt = Integer.parseInt(tmp);
		int []arr = new int[10001];
		
		for (int i = 0; i < cnt; i++) {
			tmp= br.readLine();
			int tmp1 = Integer.parseInt(tmp);
			arr[tmp1] ++;;
		}		
		for (int i = 1; i < 10001; i++) {
			
			if (arr[i] == 0) continue; 
			
			for (int j = 0; j < arr[i]; j++) 
			{
				bw.write(Integer.toString(i)+"\n");
			}
		}
        br.close();
        bw.close();
	}

}
