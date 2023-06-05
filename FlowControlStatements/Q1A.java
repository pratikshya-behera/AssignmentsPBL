import java.util.*;

class Q1A{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer value: ");
    int x = sc.nextInt();
    if(x==0)
      System.out.println("Zero");
    else if(x>0)
      System.out.println("Positive");
    else
      System.out.println("Negative");
  }
}