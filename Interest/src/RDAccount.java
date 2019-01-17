	public class RDAccount extends Account {
		//double interestRate ;
		//double amount ;
		int noOfMonths; 
		int getAgeOfACHolder; 
		//monthlyAmount ?
		
		
		public RDAccount(double amount,int noOfMonths, int monthlyAmount) {
			super();
			this.amount=amount;
			this.noOfMonths = noOfMonths;
			this.getAgeOfACHolder = monthlyAmount;
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
		public int getNoOfMonths() {
			return noOfMonths;
		}
		public void setNoOfMonths(int noOfMonths) {
			this.noOfMonths = noOfMonths;
		}
		public int getAgeOfACHolder() {
			return getAgeOfACHolder;
		}
		public void setAgeOfACHolder(int monthlyAmount) {
			this.getAgeOfACHolder = monthlyAmount;
		}
		
		
		double calculateInterest(){
			 if(noOfMonths==6)
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
			 else if(noOfMonths==9)
			 {
				 if(getAgeOfACHolder()<50)
				 {
					 	//general
					 setInterestRate(7.75);
					 
				 }
				 else
				 {
					 //senior
					 setInterestRate(8.25);
				 }
			 }
			 else if(noOfMonths==12)
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
			 else if(noOfMonths==15)
			 {
				 if(getAgeOfACHolder()<50)
				 {
					 	//general
					 setInterestRate(8.25);
					 
				 }
				 else
				 {
					 //senior
					 setInterestRate(8.75);
				 }
			 }
			 else if(noOfMonths==18)
			 {
				 if(getAgeOfACHolder()<50)
				 {
					 	//general
					 setInterestRate(8.5);
					 
				 }
				 else
				 {
					 //senior
					 setInterestRate(9.0);
				 }
			 }
			 else if(noOfMonths==21)
			 {
				 if(getAgeOfACHolder()<50)
				 {
					 	//general
					 setInterestRate(8.75);
					 
				 }
				 else
				 {
					 //senior
					 setInterestRate(9.25);
				 }
			 }
		
			 
			 System.out.println("amt="+getAmount()+"intreset"+getInterestRate());
				double interestGenerated=(double)(getAmount()*getInterestRate())/100;
				return interestGenerated;

			 } 
	}


