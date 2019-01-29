import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] a;
        String b;
        int []tmp = new int[100];
        b= sc.nextLine();
        a=b.split(" ");
        String output = "";
        int result;
        for (int i = 0; i < a.length; i++)
        {
            tmp[i]=Integer.parseInt(a[i]);
        }

        for (int i = 0; i < 7; i++) {
            result=tmp[i]-tmp[i+1];
            if (result == -1 ){
                output= "ascending";
                System.out.println("good");
            }
            else if (result == 1) {
                output= "decending";
                System.out.println("good");
            }
            else
            {
                output = "Mixed";
                break;
            }

        }
        System.out.println(output);
    }
}
