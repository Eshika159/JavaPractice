import java.util.*;
public class Test {
public static void main(String args[])
{
	System.out.println("Select the option:");
	System.out.println("1. Interest Calculator –SB");
	System.out.println("2. Interest Calculator –FD"); 
	System.out.println("3. Interest Calculator –RD");
	System.out.println("4. Exit" );
	Scanner sc=new Scanner(System.in);
	int d=sc.nextInt();
	
	if(d==1){
		System.out.println("Enter the average amount in the account: ");
		double am=sc.nextDouble();
		System.out.println("Enter the type of account: ");
		String type=sc.next();
		
		//System.out.println("Enter the number of days: ");
		//int days=sc.nextInt();
		//System.out.println("Enter your age:");
		//int age=sc.nextInt();
		if(am<1)
			System.out.println("Invalid Amount. Please enter correct values");
		if(!(type.equals("Normal"))|| (!(type.equals("NRI"))))
			System.out.println("Invalid TypeOfAccount. Please enter correct values");
		
			//if(days<1)
			//System.out.println("Invalid Number of days. Please enter correct values");
		//if(age<1)
			//System.out.println("Invalid Age. Please enter correct values");
		System.exit(0);
		SBAccount sb=new SBAccount(am,type);
		System.out.println("Interest gained is: "+sb.calculateInterest());
	
	}
	else if(d==2)
	{
		System.out.println("Enter the FD amount: ");
		double am=sc.nextDouble();
		System.out.println("Enter the number of days: ");
		int days=sc.nextInt();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(am<1)
			System.out.println("Invalid Amount. Please enter correct values");
		if(days<1)
			System.out.println("Invalid Number of days. Please enter correct values");
		if(age<1)
			System.out.println("Invalid Age. Please enter correct values");
		System.exit(0);
		FDAccount fd=new FDAccount(am,days,age);
		System.out.println("Interest gained is: "+fd.calculateInterest());
	}
	else if(d==3)
	{
		System.out.println("Enter the RD amount in the account: ");
		double am=sc.nextDouble();
		System.out.println("Enter the number of Months: ");
		int days=sc.nextInt();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(am<1)
			System.out.println("Invalid Amount. Please enter correct values");
			if(days<1)
			System.out.println("Invalid Number of days. Please enter correct values");
		if(age<1)
			System.out.println("Invalid Age. Please enter correct values");
		System.exit(0);
		RDAccount fd=new RDAccount(am,days,age);
		System.out.println("Interest gained is: "+fd.calculateInterest());

	}
	else if(d==4)
	{	return;
		//System.exit(0);
	}
}
}
