package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character>s = new Stack<Character>();
		char tmp1[];
		
		while(true)
		{
			int flag =0;
			String tmp = br.readLine();
			if (tmp.equals(".")) {
				break;	
			}
			tmp1 = tmp.toCharArray();

			loop1: for (int i = 0; i < tmp1.length; i++) {
				if (tmp1[i] == '(' || tmp1[i] =='[') {
					s.add(tmp1[i]);
					continue;
				}
				if(tmp1[i]== ')' || tmp1[i]==']'){
					if (s.isEmpty()) {
						flag = 1; 
						break loop1;
					}
					else if (tmp1[i] == ')' && s.peek() =='(') {
						s.pop();
						continue;
					}
					else if (tmp1[i] == ']' && s.peek() =='[') {
						s.pop();
						continue;
					}
					flag =1;
					

				}
			}
			if (s.isEmpty() && flag == 0) {
				System.out.println("yes");
			}
			else System.out.println("no");
			s.clear();
		}

		

	}

}
