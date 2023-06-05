import java.lang.*;

class Q7{
  public static void main(String args[]){
    char c1 = 'p';

    if(Character.isUpperCase(c1))
      System.out.print(c1+"->"+Character.toLowerCase(c1));

    if(Character.isLowerCase(c1))
      System.out.print(c1+"->"+Character.toUpperCase(c1));
  }
}