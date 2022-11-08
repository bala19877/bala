package krish;

public class Employee_details {
public void Employee(String name) {
System.out.println(name); 
}
public void Employee(long ph_no) {
System.out.println(ph_no);
}
public void Employee(char grade) {
System.out.println(grade);
 }
public void Employee(int id) {
System.out.println(id);
}
private void Employee(String mail_id,int a) {
System.out.println(mail_id);
}
public static void main(String[] args) {
	Employee_details ed=new Employee_details();
	ed.Employee("Bala");
	ed.Employee(123);
	ed.Employee("A");
	ed.Employee(9790260);
	ed.Employee("bala@gmail.com", 0);
}
}
