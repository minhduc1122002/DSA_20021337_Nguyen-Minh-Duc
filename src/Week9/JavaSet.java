package Week9;

import java.util.HashSet;
import java.util.Scanner;

public class JavaSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }
}
