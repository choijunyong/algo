import java.io.IOException;
import java.util.Scanner;

public class arrayexample {
    public static void main(String[] args){


        int count = 1;
        int result =0;
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt() ;

        String [] a = new String[cnt];
        for (int i = 0; i < cnt; i++) {

            a[i] = sc.next();
        }

        for (int i = 0; i < cnt; i++)
        {
            String []b = new String[a[i].length()];
            b= a[i].split("");
            for (int j = 0; j <a[i].length(); j++) {
                if (b[j].equals("O")) {
                    result = result+count;
                    count ++;
                }
                else {
                    count = 1;
                }
            }
            System.out.println(result);
            result =0;
            count =1;



        }
    }
}
