import java.io.*;
import java.util.*;
class Q1
{
  public static void main(String args[]) throws IOException
  {
    //File myFile = new File("Input.txt");
    //myFile.createNewFile();
    
    System.out.print("Enter file name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();  
    System.out.print("Enter character to be counted: ");
    char ch = sc.next().charAt(0); 

    FileInputStream f = new FileInputStream(name);
    int d,count=0;
    while((d=f.read())!=-1)
    {
      if(f.read()==ch)
      count++;
    }
    System.out.print("Total number of characters in file:"+count);
    f.close();
  }
}