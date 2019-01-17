
public class FDAccount extends Account {
	//double interestRate ;
	//double amount ;
	int noOfDays ;
	int ageOfACHolder;
	
	public FDAccount(double amount, int noOfDays, int ageOfACHolder) {
		super();
	setAmount(amount);
	setNoOfDays(noOfDays);
	setAgeOfACHolder(ageOfACHolder);
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
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public int getAgeOfACHolder() {
		return ageOfACHolder;
	}
	public void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}
	 
 double calculateInterest() 
	{
	 if(getAmount()<10000000)
	 {
		 if(noOfDays>=7&&noOfDays<=14)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(4.5);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(5.0);
			 }
		 }
		 else if(noOfDays>14&&noOfDays<=29)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(4.75);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(5.25);
			 }
		 }
		 else if(noOfDays>29&&noOfDays<=45)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(5.5);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(6.0);
			 }
		 }
		 else if(noOfDays>45&&noOfDays<=60)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(7);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(7.5);
			 }
		 }
		 else if(noOfDays>60&&noOfDays<=184)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(7.5);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(8.0);
			 }
		 }
		 else if(noOfDays>184&&noOfDays<=365)
		 {
			 if(getAgeOfACHolder()<50)
			 {
				 	//general
				 setInterestRate(8);
				 
			 }
			 else
			 {
				 //senior
				 setInterestRate(8.5);
			 }
		 }
	
	
	
	
	
	 }
	 
	 else
		 //above 1 crore
	 {
		 if(noOfDays>=7&&noOfDays<=14)
		 {
			 setInterestRate(6.5);
		 }
		 else if(noOfDays>14&&noOfDays<=29)
		 {
			 setInterestRate(6.75);
		 }
		 else if(noOfDays>29&&noOfDays<=45)
		 {
			 setInterestRate(6.75);
		 }
		 else if(noOfDays>45&&noOfDays<=60)
		 {
			 setInterestRate(8);
		 }
		 else if(noOfDays>60&&noOfDays<=184)
		 {
			 setInterestRate(8.5);
		 }
		 else if(noOfDays>184&&noOfDays<=365)
		 {
			 setInterestRate(10);
		 }
	
}
	 System.out.println("amt="+getAmount()+"intreset"+getInterestRate());
	double interestGenerated=(double)(getAmount()*getInterestRate())/100;
	return interestGenerated;
	 
	}
 
}
