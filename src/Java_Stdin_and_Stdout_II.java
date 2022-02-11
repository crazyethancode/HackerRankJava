import java.io.*;
import java.util.*;

public class Java_Stdin_and_Stdout_II {
    public static class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();
            double decimal = scanner.nextDouble();
            scanner.nextLine();
            String str = scanner.nextLine();
            System.out.println("String: "+str);
            System.out.println("Double: "+decimal);
            System.out.println("Int: "+numb);
        }
    }
}
