import java.io.*;
import java.util.*;

public class Java_Static_Initializer_Block {

    static
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > 0 && b > 0)
            System.out.println( a * b );
        else
            System.out.println( "java.lang.Exception: Breadth and height must be positive" );
    }

    public static void main(String[] args) {

    }
}
