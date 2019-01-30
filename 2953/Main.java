import java.lang.String;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tmp;
        String []a;

        int max = 0;
        int rank = 0;
        int b=0;
        int []val = new int[5];
        for (int i = 0; i < 5; i++) {
            tmp = sc.nextLine();
            a=tmp.split(" ");
            for (int j = 0; j < a.length; j++) {

                b =b+Integer.parseInt(a[j]);
            }
            val[i]=b;
            b = 0;

        }
        max = val[0];
        for (int i = 0; i <val.length; i++) {
            if (val[i] >= max) {
                max= val[i];
                rank = i+1;
            }
        }

        System.out.println(rank);
        System.out.println(max);

    }
}
//5 4 4 5
//5 3 4 4
//5 5 1 4
//5 5 1 4
//4 4 4 5
