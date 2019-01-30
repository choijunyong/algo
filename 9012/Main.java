import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws IOException {

        Stack s = new Stack();

        Scanner sc = new Scanner(System.in);
        int cnt;
        cnt = sc.nextInt();
        int result1 = 0;

        String []a = new String[cnt];
        String result = "";
        for (int i = 0; i <cnt; i++) {
            a[i]=sc.next();

        }
        for (int i = 0; i < cnt; i++) {
            String []b = new String[a[i].length()];
            b= a[i].split("");
            for (int j = 0; j < a[i].length() ; j++) {
                if (b[j].equals("(")) {
                    s.push(b[j]);
                    result1 =result1 + 1;
                }
                else if (b[j].equals(")")) {
                    result1 =result1-1;
                    if (s.empty() && result1 !=0) {
                        break;
                    }
                    s.pop();


                }
            }
            if (result1==0) {
                result = "YES";
            }
            else{
                result = "NO";
            }
            System.out.println(result);
            result1 = 0;
        }
    }
}
