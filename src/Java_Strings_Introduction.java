import java.io.*;
import java.util.*;

public class Java_Strings_Introduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int len = a.length() + b.length();
        System.out.println(len);

        int result = a.compareTo(b);
        String s1, s2;
        if (result <= 0)
        {
            System.out.println("No");
            s1 = a.substring(0, 1).toUpperCase();
            System.out.print(s1 + a.substring(1) + " ");
            s2 = b.substring(0, 1).toUpperCase();
            System.out.print(s2 + b.substring(1));
        }
        else
        {
            System.out.println("Yes");
            s2 = a.substring(0, 1).toUpperCase();
            System.out.print(s2 + a.substring(1) + " ");
            s1 = b.substring(0, 1).toUpperCase();
            System.out.print(s1 + b.substring(1));
        }
    }
}
