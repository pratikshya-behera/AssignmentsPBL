import java.util.Scanner;

class Q12{
  public static void main(String args[]){
    int n,m;
    int flag=0;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sc.nextInt();

    m=n/2;
    
    if(n==0||n==1)
      System.out.println("Not Prime");
    else{
      for(int i=2;i<=m;i++){
        if(n%i==0)
          flag=1;
        break;
      }
      if(flag==0)
        System.out.println("Prime");
      if(flag==1)
        System.out.println("Not Prime");
    }
  }
}