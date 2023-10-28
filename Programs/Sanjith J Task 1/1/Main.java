import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+i*n);
        }
    }
}
