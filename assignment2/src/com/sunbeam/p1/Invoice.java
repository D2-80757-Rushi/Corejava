package com.sunbeam.p1;

public class Invoice {
		String partNumber;
		String partDescription;
		int Qty;
		int item;

	public Invoice() {
		this.partNumber =" ";
		this.partDescription=" ";
		this.Qty=0;
		this.item=0;	
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQty() {
		return Qty;
	}

	public void setQty(int qty) {
		Qty = qty;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
	public double calculate() {
		
		if(Qty<0){
			setQty(0);
		}
		if(item<0) {
			setItem(0);
		}
		
	    double amount = (item*Qty);
		return amount;
	}
}
