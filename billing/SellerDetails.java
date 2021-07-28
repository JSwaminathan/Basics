package billing;

import java.util.ArrayList;

public class SellerDetails {
	private ArrayList<Product> productList;
	private String sellerName;
	private int sellerNumber;

	public SellerDetails() {
		productList = new ArrayList<Product>();

	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getSellerNumber() {
		return sellerNumber;
	}

	public void setSellerNumber(int sellerNumber) {
		this.sellerNumber = sellerNumber;
	}

	private void readSellerFile() {

	}
}
