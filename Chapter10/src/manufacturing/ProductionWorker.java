package manufacturing;

import javax.swing.JOptionPane;

public class ProductionWorker<ProdouctionWorker> extends Employee {
	
	double shift;
	double hourlyPay;

	public ProductionWorker(String name, String idNumber, String dateofHire, int shift, double hourlyPay) {
		
		super(name, idNumber, dateofHire);
		this.shift = shift;
		this.hourlyPay = hourlyPay;
	}
	
	

	public double getShift() {
		return shift;
	}



	public void setShift(double shift) {
		this.shift = shift;
	}



	public double getHourlyPay() {
		return hourlyPay;
	}



	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}



	public void printInformation() {
		
		JOptionPane.showMessageDialog(null,  "Name: " + name  + "\n"+ 
				 "Employee Number: " + idNumber + "\n"+
				"Date Hired: " + dateofHire + "\nThe shift is "+ shift  + "\n"+ "The rate is " + hourlyPay);
		
	}
}
