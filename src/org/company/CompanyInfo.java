package org.company;

public class CompanyInfo {
	void companyName(){
		System.out.println("Greentech");
	}
    void companyId(){
    	System.out.println("12345");
    }
	void companyAddress() {
		System.out.println("Tambaram, Chennai");
	}
	
	
	public static void main(String[] args) {
		
		CompanyInfo a= new CompanyInfo();
		  a.companyName();
		  a.companyId();
		  a.companyAddress();
		
	}
}
