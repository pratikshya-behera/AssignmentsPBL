import java.util.*;
class EmployeeDB extends Employee{

  ArrayList<Employee> list = new ArrayList();  

  boolean addEmployee(Employee e){
    list.add(e.empId);
  }
  
  boolean deleteEmployee(int empId){
    list.remove(empId);
  }

  String showPaySlip(int empId){
    Employee e = new Employee();
    Iterator itr = list.iterator();

    while(itr.hasNext()){
      Object element = itr.next();
      
      list.remove(empId);
    }

  }

  String showPaySlip(int empId){
    
  }

  public static void main(){
    
  }
}