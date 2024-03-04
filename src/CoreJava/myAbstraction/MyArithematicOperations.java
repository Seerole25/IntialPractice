package CoreJava.myAbstraction;

import org.junit.Test;
// Variables // Functions [Method]
public abstract class MyArithematicOperations

// Here in MyMiniCalculator we have written subtraction function and In MyCommercialCalc we have***
// **written multiplication function.
// In Abstract classes child class can inherited only one parent class.So,here we create an object for MyCommercialCalc.
//When ever we create a object already MyMiniCalculator extends the MyArithematicOperations
//if we create object in MyArithematicOperations then automatically multiplication will be inherited from MyCommercialCalc
// We can not create object for abstract classes we can only extends the abstract class and **
//** it does not allow to create a object.Please see example object creation in MyCommercialCalc(myAbstraction)**
//** and it will through an error "Cannot instantiate the type MyArithematicOperations"
// In a class if it contains abstract method then compulsory it must be a abstract class.
//It is not a mandatory that abstract class should contains abstract method.
//It may contains either concrete function or abstract functions or it may contains both the functions
	
{
	
	MyCommercialCalc m = new MyCommercialCalc();
	@Test
	public void test()
	{
		m.Multiplication(22,100);
	}	
	public int adition(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	public abstract int subtraction(int a,int b);
	
	
}
