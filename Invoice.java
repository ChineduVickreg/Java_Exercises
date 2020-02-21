
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantityPurchased;
	private double pricePerItem;
	
public Invoice(String partNumber, String partDescription, int quantityPurchased, double pricePerItem){
	this.partNumber = partNumber;
	this.partDescription = partDescription;
	this.quantityPurchased = quantityPurchased;
	this.pricePerItem = pricePerItem;
	
}
//Set & get method for PartNumber
	public void setpartNumber(String partNumber) {
		this.partNumber = partNumber;
		}
	public void setpartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public void setquantityPurchased(int quantityPurchase) {
		this.quantityPurchased = quantityPurchased;
	}
	public void setpricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public int getQuantityPurchased() {
		return quantityPurchased;
	}
	public double getPricePerItem() {
		return pricePerItem;
		
	}
	public double getInvoiceAmount() {
		if (quantityPurchased < 0) {
			quantityPurchased = 0;
		}
		if(pricePerItem < 0) {
			pricePerItem = 0.0;
		}
		double invoiceAmount = pricePerItem * quantityPurchased;
		return invoiceAmount;
		
	}
	
	
}
