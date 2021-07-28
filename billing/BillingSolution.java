package billing;

import java.util.ArrayList;

public class BillingSolution {
	GstCalaculator gst;
	ArrayList<SellerDetails> sd;

	public BillingSolution() {
		gst = new GstCalaculator();
		sd = new ArrayList<SellerDetails>();

	}

	

	private void getPurchase() {
		ArrayList<Product> product = new ArrayList<Product>();
		
	}

	private void initialiseGst() {

	}
	private void initialsiseSellers() {
		
	}
	public static void main(String args[]) {
		BillingSolution bs = new BillingSolution();
		bs.initialiseGst();
		bs.initialsiseSellers();

	}
}
