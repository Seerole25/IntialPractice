package CoreJava.generalStore;

import org.junit.Test;

import myInterface.ArithematicOperation;
import myInterface.CommercialCalculator;
import myInterface.MiniCalculator;
import myInterface.ScientificCalculator;

public class CustomerBill 
{
	@Test
	public void printCustomerBill()
	{
		int prod1=25468;
		int prod2=12345;
		//Reference object                runtime object
		MiniCalculator mCal=new MiniCalculator();
		mCal.displayLogo();
		int Bill=mCal.addition(prod1, prod2);
		System.out.println("Customer Bill is :"+Bill);
	}
	@Test
	public void printCustomerBillinCommercialCalculator()
	{
		int prod1=25468;
		int prod2=12345;
		CommercialCalculator cCal=new CommercialCalculator();
		cCal.displayLogo();
		int Bill=cCal.addition(prod1, prod2);
		System.out.println("Customer Bill is :"+Bill);
	}
	@Test
	public void printCustomerBillinScientificCalculator()
	{
		int prod1=25468;
		int prod2=12345;
		ScientificCalculator sCal=new ScientificCalculator();
		sCal.displayLogo();
		int Bill=sCal.addition(prod1, prod2);
		System.out.println("Customer Bill is :"+Bill);
		sCal.Sinevalue();
	}
	
	// Overriding means Subclass (Child Class) can rewrite the function which is there in  Super class(Parent Class)
	@Test
	public void printCustomerBillonlyUsingScientificCalculator()
	{
		int prod1=254;
		int prod2=123;
		// SuperClass 1 is reference Object			SubClass is run time reference Object
		ArithematicOperation aCal =          new ScientificCalculator();
		int Bill=aCal.addition(prod1, prod2);
		System.out.println("Customer Bill is :"+Bill);
	
	}

}
