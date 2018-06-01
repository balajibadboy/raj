public class saving {
public static int annualInterestRate;
double savingBalance;
public saving(double balance) {
	this.savingBalance=balance;
}
public  void calculateMonthlyInterest() {
	Double Interest=(savingBalance*(annualInterestRate/100.0))/12;
	savingBalance=savingBalance+Interest;
}
public static void modifyInterestRate(int newvalue){
annualInterestRate= newvalue;
}
public void showBalance()
{System.out.println("balance"+savingBalance);
}	
public static void main(String args[])
{
	saving a=new saving(10000);
	saving b=new saving(20000);
	saving.modifyInterestRate(4);
	a.showBalance();
	b.showBalance();
	a.calculateMonthlyInterest();
	b.calculateMonthlyInterest();
	a.showBalance();
	b.showBalance();
	saving.modifyInterestRate(5);
	a.showBalance();
	b.showBalance();
	a.calculateMonthlyInterest();
	b.calculateMonthlyInterest();
	a.showBalance();
	b.showBalance();
}}