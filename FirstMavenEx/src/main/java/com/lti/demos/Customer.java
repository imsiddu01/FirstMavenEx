package com.lti.demos;

/**
 * @author ASUS
 *
 */
public class Customer {
	private int custNo;
	private String cusrName;
	private double billAmount;
	public Customer(int custNo, String cusrName, double billAmount) {
		super();
		this.custNo = custNo;
		this.cusrName = cusrName;
		this.billAmount = billAmount;
		
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCusrName() {
		return cusrName;
	}
	public void setCusrName(String cusrName) {
		this.cusrName = cusrName;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", cusrName=" + cusrName + ", billAmount=" + billAmount + "]";
	}
	public Customer() {
		super();
	}
	
	

}
