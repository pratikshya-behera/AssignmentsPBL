import java.util.*;
class Q3{

  static void printAll(ArrayList <String> n){ 
    Iterator itr = n.iterator();
    while(itr.hasNext()){
      Object element = itr.next();
      System.out.print(element + " ");
    }
  }

  public static void main(String args[]){
    ArrayList <String> n = new ArrayList();
    Collections.addAll(n,"January","February","March","April","May","June","July","August","September","October","November","December");
    printAll(n);
  }
}