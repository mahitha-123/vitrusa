import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Employee {
	 int id;
	String name;
	int  age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age +"]";
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
public class EmployeeService {
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(101, "Shital", 24, "Developer", "IT", 25000);
	Employee emp2=new Employee(102, "Meena", 26, "Tester","CO", 57000);
	Employee emp3=new Employee(103, "Bob", 20, "DevOps Eng","Admin", 5000);
	Employee emp4=new Employee(104, "Max", 27, "System Eng","CO",  70000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	public EmployeeService() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view emp based on there id
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update the employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				emp.setName(name);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete emp
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	//add emp
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		
		Employee emp=new Employee(id, name, age);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
		
	}
	
	}

	class Empdetails
     { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do {
			menu();
			System.out.println("Enter your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("view All Employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank you for using application!!");
				System.exit(0);
				
			default:
				System.out.println("Please enter valid choice");
				break;
			
			
			}
			
		}while(ordering);
		
			}
}
		
	}
