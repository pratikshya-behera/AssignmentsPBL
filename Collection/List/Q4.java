import java.util.*;

class NewArrayList<E> extends ArrayList<E>{
  public boolean add(E e){
    if(e instanceof Integer || e instanceof Float || e instanceof Double){
      super.add(e);
      return true;
    }
    else{
      throw new ClassCastException("Enter only Integer, Float and Double values");
    }
  }
}

class Q4{
  public static void main(String args[]){
    ArrayList<Object> n = new NewArrayList();
    //System.out.print("Enter values: ");
    try{
      n.add(10);
      n.add(1.3F);
      n.add(12.3457D);
      n.add("Test case");
    }
    catch(Exception e){
      e.printStackTrace();
    }
    System.out.print(n);
  }
}