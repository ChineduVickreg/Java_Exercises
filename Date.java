public class Date{
	private int day;
	private int month;
	private int year;
public Date(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}
public void setday(int day){
	this.day = day;
}

public int getday(){
	return day;
}
public void setmonth(int month){
	this.month = month;
}
public int getmonth(){
	return month;
}
public void setyear(int year){
	this.year = year;
}
public int getyear(){
	return year;
}
public void displayDate(){
	System.out.print(month);
	System.out.print("/");
	System.out.print(day);
	System.out.print("/");
	System.out.print(year);

	//return (month "/" day "/" year)
	//return displayDate();

	
	//int displayDate = month/day/year;
}

/*public int getdisplayDate(){ 
	String month1 = "January";
	String month2 = "Febuary";
	String month3 = "March";
	String month4 = "April";
	String month5 = "May";
	String month6  = "June";
	String month7 = "July";
	String month8 = "August";
	String month9 = "September";
	String month10 = "October";
	String month11 = "Novermber";
	String month12 = "December";
	system.out.println()

}
*/



}