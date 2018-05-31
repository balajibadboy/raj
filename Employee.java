import java.util.Scanner;
class Emp
{
String first_name,second_name;
Double salary;
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getSecond_name() {
	return second_name;
}
public void setSecond_name(String second_name) {
	this.second_name = second_name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Double increment(){
System.out.println("yearly salary=salary*12");
System.out.println(((salary*1.1)+salary)*12);
return 0;
 }
}
public class Employee
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
Emp emp1=new Emp();
Emp emp2=new Emp();
emp1.setFirst_name(sc.next());
emp1.setSecond_name(sc.next());
emp1.setSalary(sc.nextDouble());
System.out.println(emp1.getFirst_name());
System.out.println(emp1.getSecond_name());
System.out.println(emp1.getSalary());
}}

