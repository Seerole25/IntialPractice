package CoreJava.readInputData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

// 3rd jan class video
public class ReadUserData 
{
	@Test
	public void readMyUserData() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myfile = new FileInputStream("Data/MyData.properties");
		prop.load(myfile);
		//String UN = prop.getProperty("UseName");
		System.out.println("My User Name  : "+prop.getProperty("UseName"));
		System.out.println("My Password  : "+prop.getProperty("Password"));
		System.out.println("My DOB is : "+prop.getProperty("DOB"));
		System.out.println("My Education  : "+prop.getProperty("Education"));
		System.out.println("My Branch  : "+prop.getProperty("Branch"));
		System.out.println("My Age  : "+prop.getProperty("Age"));
		System.out.println("My Address  : "+prop.getProperty("Address"));
		System.out.println("My Pincode is : "+prop.getProperty("Pincode"));
		System.out.println("My State  : "+prop.getProperty("State"));
		System.out.println("My PhoneNumber  : "+prop.getProperty("PhoneNumber"));
		
	}

}
