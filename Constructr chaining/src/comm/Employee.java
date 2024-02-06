package comm;

class Employee {
	int id;
	String name;
	double sal;
	
	Employee(int id){
		this.id=id;
		
	}
	Employee(int id , String name){
		this(id);
		this.name=name;
		
	}
	Employee(int id, String name , double sal){
		this(id,name);
		this.sal=sal;
		
	}
	public static void main(String args[]) {
		Employee e= new Employee(101, "Anjana", 15.5);
		System.out.println("empid :" +e.id);
		System.out.println("name : " +e.name);
		System.out.println("salary : " +e.sal + "lpa");
		}
}
