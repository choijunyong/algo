package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ_3913 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();

		char a[] = tmp.toCharArray();
		String Result ="";
		int flag =-1;
		Boolean chk_Val = false;
		Boolean chk_Val1 = false;



		for (int i = 0; i < a.length; i++) {

			if (a[i] == '_') {
				chk_Val = true;

				if (i==0) {
					System.out.println("Error!");
					System.exit(0);
				}
				else if(a[i-1] =='_') {
					System.out.println("Error!");
					System.exit(0);}


			}
			else if(65 <= (int)a[i] && (int)a[i] <= 90){
				chk_Val1 = true;
				if (i==0) {
					System.out.println("Error!");
					System.exit(0);
				}

			}

			if (chk_Val && chk_Val1) {

				System.out.println("Error!");
				System.exit(0);

			}

		}
		int tmp1123 =a.length;
		
		if (a[tmp1123-1]=='_') {
			System.out.println("Error!");
			System.exit(0);
			
		}

			for (int i = 0; i < a.length; i++) {


				if (a[i] == '_' || flag ==1) {

					if (flag ==1) {
						Result = Result + Character.toUpperCase(a[i]);
						flag =0;
						continue;
					}
					flag = 1;
					continue;

				}
				else if ((65 <= (int)a[i] && (int)a[i] <= 90)) {
					flag =3;


					if (i==0) {
						Result = Result + Character.toLowerCase(a[i]);
					}
					else {
						Result = Result +'_';
						Result = Result + Character.toLowerCase(a[i]);
					}

					continue;


				}
				
				Result = Result + a[i];
			}


			System.out.println(Result);
		}

	}
