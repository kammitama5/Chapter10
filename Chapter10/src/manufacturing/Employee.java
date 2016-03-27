package manufacturing;

import javax.swing.JOptionPane;

public class Employee {
	
	String name; //name of employee
	String idNumber; //employee number
	String dateofHire; // date hired
	
	public Employee(String name, String idNumber, String dateofHire) {
		this.name = name;
		this.idNumber = idNumber;
		this.dateofHire = dateofHire;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getIdNumber() {
		return idNumber;
	}



	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}



	public String getDateofHire() {
		return dateofHire;
	}



	public void setDateofHire(String dateofHire) {
		this.dateofHire = dateofHire;
	}



	public void printInformation() {
		JOptionPane.showMessageDialog(null,  "Name: " + name  + "\n"+ 
									 "Employee Number: " + idNumber + "\n"+
									"Date Hired: " + dateofHire);
		
	}

}
