public class AccountTest1{
	public static void main(String... args){

	Account1 obj = new Account1(200.0);
	
	obj.setName("Ezeugo Nwachukwu");
	System.out.printf("Your name is: %s%n",obj.getName());
	
	obj.setBalance(279000000);
	System.out.printf("The balance is :%.0f%n",obj.getBalance()); 
 
	
	obj.setDeposit(100000);
	System.out.printf("your deposit is %d%n", obj.getDeposit());
	
	obj.setWithdraw(1500);
	System.out.printf("your withdraw is %d%n", obj.getWithdraw());

	obj.setTransfer(7000);
	System.out.println(obj.getTransfer());
	}

}