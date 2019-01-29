
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException
    {


//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a ;
        int b;
        int c;
        String [] arr;

        Scanner sc = new Scanner(System.in);

        a= sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        int tmp = a *b *c;

        String d = Integer.toString(tmp);
        int []result = new int[20];

        arr = d.split("");
        for (int i = 0; i <10 ; i++) {
            result[i] =0;
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("0")) {
                result[0] = result[0]+1;
            }
            else if (arr[i].equals("1")){
                result[1] =result[1]+1;
            }
            else if (arr[i].equals("2"))
            {
                result[2] =result[2]+1;
            }
            else if (arr[i].equals("3")) {
                result[3] =result[3]+1;
            }
            else if (arr[i].equals("4")) {
                result[4] =result[4]+1;
            }
            else if (arr[i].equals("5")) {
                result[5] =result[5]+1;
            }
            else if (arr[i].equals("6")) {
                result[6] =result[6]+1;
            }
            else if (arr[i].equals("7")) {
                result[7] =result[7]+1;
            }
            else if (arr[i].equals("8")) {
                result[8] =result[8]+1;
            }
            else if (arr[i].equals("9")) {
                result[9] =result[9]+1;
            }

        }
        for (int j = 0; j < 10; j++) {
            System.out.println(result[j]);
        }





//        150
//        266
//        427


    }
}
