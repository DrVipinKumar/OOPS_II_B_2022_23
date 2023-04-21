package encapsulation;

class Student{
	private String name;
	private int roll;
	private String branch;
	Student(String name,int roll, String branch){
		this.name=name;
		this.roll=roll;
		this.branch=branch;
	}
	public String getName() {  //getter method
		return this.name;
	}
	public int getRoll() {  //getter method
		return roll;
	}
	public void setBranch(String branch) {  //setter method
		this.branch=branch;
	}
	public String getBranch() {
		return this.branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", branch=" + branch + "]";
	}
	
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("KIET",1,"MCA");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		s1.setBranch("CSE");
		System.out.println(s1.getBranch());
		System.out.println(s1);
		Employee e1 =new Employee("Rahul", 1, "IT");
		System.out.println(e1.name());

	}

}
