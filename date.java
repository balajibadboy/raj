public class Date {
	int day;
	int month;
	int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
		System.out.print(year);
	}
	public void displayDate(int day,int month,int year)
	{
		System.out.print("date is "+day+"/"+month+"/"+year+"");
	}
	
	public static void main(String args[]) {

		Date d1=new Date();
		d1.displayDate(15,03,2017);
		
	}

}