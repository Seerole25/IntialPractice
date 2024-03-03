package CoreJava.coreconcepts;

import org.junit.Test;

public class ReversingtheString 

{
	@Test
	public void Reverse()
	{
	String str= "Siva Nageswara Rao", nstr="";
    char ch;
    
  System.out.println("Original word: "+str);
  
  for (int i=0; i<str.length(); i++)
  {
    ch= str.charAt(i); //extracts each character
    nstr= ch+nstr; //adds each character in front of the existing string
    
  }
  System.out.println("Reversed word: "+ nstr);
   }

}
