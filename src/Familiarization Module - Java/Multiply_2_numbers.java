import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiply_2_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int ret = mul(a,b);        
        System.out.println(ret);
    }
    
    public static int mul(int x, int y) {
        //Hint : Type return x * y below
        return x*y;
    }
}