import java.util.*;

class Q1B{

  public static boolean lastDigit(int x, int y){
    if((x%10)==(y%10))
      return true;
    else
      return false;
  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two positive integer values: ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(lastDigit(x,y));
  }
}