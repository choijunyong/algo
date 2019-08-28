package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hap_dfs {

	static int num;
	public static int dfs(int num1)
	{
	
		
		if (num1  <=  0) {
			return 0;
		}
		
		return num1 + dfs(num1-1);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		num = Integer.parseInt(tmp);
		int sol= dfs(num);
		System.out.println(sol);
	}

}
