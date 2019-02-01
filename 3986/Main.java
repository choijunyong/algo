import java.lang.String;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack s  = new Stack();

        int cnt1=0;
        int cnt2 =0;
        int cnt = sc.nextInt();
        String [] tmp = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            tmp[i] = sc.next();
        }
        for (int i = 0; i < cnt; i++) {
            String []a = new String[tmp[i].length()];
            a=tmp[i].split("");
            s.clear();
            for (int j = 0; j < tmp[i].length(); j++)
            {

                if (j == 0 || cnt2 ==1) {
                    s.push(a[j]);
                    cnt2=0;
                }
                else
                {
                    if (a[j].equals("A") && s.peek().equals("A")) {
                        s.pop();
                        if (s.isEmpty()) {
                            cnt2=1;
                        }

                    }
                    else if (s.peek().equals("B") && a[j].equals("B")) {
                        s.pop();
                        if (s.isEmpty()) {
                            cnt2=1;
                        }

                    }
                    else
                    {
                        s.push(a[j]);
                        cnt2 = 0;
                    }



                }


            }
            if (s.isEmpty()) {
                cnt1 += 1;
            }
        }
        System.out.println(cnt1);
    }
}