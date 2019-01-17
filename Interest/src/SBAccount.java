public class SBAccount extends Account {
	//double interestRate; 
	//double amount ;
	//int no_of_months;
	String typeOfAccount;
	
	
	public SBAccount(double am, String type) {
		this.amount = amount;
		this.typeOfAccount = typeOfAccount;
	
		// TODO Auto-generated constructor stub
	}
	public String getTypeOfAccount() {
		return typeOfAccount;
	}
	public void setTypeOfAccount(String typeOfAccount) {
		this.typeOfAccount = typeOfAccount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	double calculateInterest()
	 {
		if(getTypeOfAccount().equals("Normal"))
		{
			setInterestRate(4);	
		}
		else if(getTypeOfAccount().equals("NRI"))
		{
			setInterestRate(6);	
		}
		 System.out.println("amt="+getAmount()+"intreset"+getInterestRate());
			double interestGenerated=(double)(getAmount()*getInterestRate())/100;
			return interestGenerated;
			
	 }

}
