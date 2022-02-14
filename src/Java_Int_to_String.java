import java.io.*;
import java.util.*;

public class Java_Int_to_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if ( a >= -100 && a <= 100 )
            System.out.println("Good job");
        else
            System.out.println("Wrong answer");
    }
}
