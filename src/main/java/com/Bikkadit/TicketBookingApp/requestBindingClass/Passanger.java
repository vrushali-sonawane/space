package com.Bikkadit.TicketBookingApp.requestBindingClass;


public class Passanger {
	
	private String fName;
	private String lName;
	private String f;
	private String t;
	private String doj;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getF() {
		return f;
	}
	public void setF(String f) {
		this.f = f;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Passanger [fName=" + fName + ", lName=" + lName + ", f=" + f + ", t=" + t + ", doj=" + doj + "]";
	}

}
