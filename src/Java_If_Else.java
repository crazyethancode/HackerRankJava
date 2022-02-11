import java.io.*;
import java.util.*;

public class Java_If_Else {
    public static class Solution {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numb = scanner.nextInt();
            if ( numb % 2 != 0 ){
                System.out.println("Weird");
            }
            else if ( numb % 2 == 0  &&  numb <= 5 && numb >= 2 ) {
                System.out.println("Not Weird");
            }
            else if ( numb % 2 == 0 && numb <= 20 && numb >= 6 ) {
                System.out.println("Weird");
            }
            else if ( numb % 2 == 0 && numb > 20 ) {
                System.out.println("Not Weird");
            }
        }
    }
}
