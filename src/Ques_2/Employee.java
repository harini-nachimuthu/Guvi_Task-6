package Ques_2;

public class Employee {
	int id;
	String firstname;
	String lastname;
	int salary;
	public Employee(int id,String firstname,String lastname,int salary) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	public int getID() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getname() {
		return firstname+lastname;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary(int salary) {
		System.out.println("Updated salary : "+salary);
	}
	public int getAnnualsalary() {
		return salary*12;
	}
	//public int raisesalary(int percent) {
		//int a= (int) ((percent/100) +salary *salary);
		//return a;
	//}
	public String toString() {
		return("Employee  details : \n"+"ID :"+id+", Name :"+ firstname+lastname +", Salary : "+salary);
	}
	public void raiseSalary(int percent) {
		salary+=(salary*percent)/100;
		System.out.println("Update salary is : " + salary );
	}

}
