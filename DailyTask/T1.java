package TLE.DailyTask;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        int count = 0;

        int l = 0;
        int r = p.length();

        while(r<=s.length()){

            String cur = s.substring(l, r);
            if(cur.equals(p)) count++;
            l++;
            r++;
        }

        System.out.println(count);
    }
}
