import java.io.*;
import java.util.*;
class Q2{
  public static void main(String args[]) throws IOException{
    System.out.print("Enter input file name: ");
    Scanner sc = new Scanner(System.in);
    String name1 = sc.nextLine();
    System.out.print("Enter output file name: ");
    String name2 = sc.nextLine();
    
    FileInputStream f1 = new FileInputStream(name1);
    FileOutputStream f2 = new FileOutputStream(name2);
    int d;
    while((d=f1.read())!=-1)
    {
      f2.write((char)d);
    }
    f1.close();
    f2.close();
    
    System.out.print("File is copied.");
  }
}