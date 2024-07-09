package Ques_2;

public class Main_class {
	public static void main(String[] args) {
		Employee emp1= new Employee(23,"Harini ","Nachimuthu",27000);
		System.out.println("ID : "+emp1.getID());
		System.out.println("Firstname : "+emp1.getFirstname());
		System.out.println("Lastname : "+emp1.getLastname());
		System.out.println("Name : "+emp1.getname());
		System.out.println("Salary : "+emp1.getsalary());
		emp1.setsalary(1000);
		System.out.println("Annualsalary : "+emp1.getAnnualsalary());
		System.out.println(emp1.toString());
		System.out.println("--------------------------------------------------");
		emp1.raiseSalary(2);
}

}
//System.out.println()