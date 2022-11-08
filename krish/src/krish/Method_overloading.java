package krish;

public class Method_overloading {
public	void emp_details(int a,String name,int b) {
System.out.println(name);
}
public void emp_details(int id) {
System.out.println(id);
}
public void emp_details(int a,String mail_id) {
System.out.println(mail_id);

}
public static void main(String[] args) {
	Method_overloading ml=new Method_overloading();
	ml.emp_details(123);
	ml.emp_details(0,"bala@gmail.com");
	ml.emp_details(0, "bala", 0);
}
}
