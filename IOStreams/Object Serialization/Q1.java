import java.io.*;
import java.util.*;
class Employee implements Serializable{
    String name;
    //Date dateOfBirth;
    String department;
    String designation;
    double salary;
  Employee(){}
  Employee(String name,  String dept, String des, double sal){
    this.name = name;
    //this.dateOfBirth = dob;
    this.department = dept;
    this.designation = des;
    this.salary = sal;
  }
}
class Q1{
  public static void main(String args[]){
    //Serialization
    try{
      Employee obj = new Employee("Abc","CSE","HOD",50000.1234);
      FileOutputStream fos = new FileOutputStream("data.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(obj);
      oos.flush();
      oos.close();
    }
    catch(Exception e){
      System.out.println("Exception in serialization"+ e);
      System.exit(0);
    }
   
    //Deseralization
    try{
      Employee obj2;
      FileInputStream fin = new FileInputStream("data.txt");
      ObjectInputStream ois = new ObjectInputStream(fin);
      obj2 = (Employee)ois.readObject();
      ois.close();
      System.out.println("object2: "+obj2);
    }
    catch(Exception e){
      System.out.println("Exception in deserialization"+ e);
      System.exit(0);
    }
  }
}