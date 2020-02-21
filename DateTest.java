public class DateTest{

	public static void main(String... args){

	Date date1 = new Date (0, 0, 0);
	
	System.out.println();
	date1.setmonth(12);
	date1.setday(30);
	date1.setyear(2020);
	date1.displayDate(); 

}
}