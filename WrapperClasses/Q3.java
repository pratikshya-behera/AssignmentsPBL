import java.util.*;
class Q3{
  public static void main(String args[]){
    System.out.print("Enter an integer value: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = Integer.toBinaryString(num);
    System.out.println("Binary equivalent: "+str);
  }
}