import java.lang.*;
import java.io.*;
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int temp;
    Scanner sc= new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println(x+" , "+y);
    temp=x;
    x=y;
    y=temp;
    System.out.println(x+" , "+y);
  }
}
