// Carlos A Perdomo January 22 2008 - CIS402-A - Assingment 3.1
// Surgeon.java

/*
 * This class creates Surgeon objects that can execute x-rays methods
 */
 
/** The  Surgeon class is define */
import java.util.*;
import static net.mindview.util.Print.*
public class Surgeon
{
	String SurgeonName;
	//Default constructor
	Surgeon()
	{
		System.out.println(" Surgeon has been created");
	}
	
	//Constructor that assigns a name
	Surgeon(String SurgeonNameStr)
	{
		System.out.print(" Surgeon  ");
		System.out.print(SurgeonNameStr);
		System.out.println(" has been created");
		SurgeonName = SurgeonNameStr;
	}
	
	/** xreay-method */
	void xray (String str)
	{	
		if ( this.SurgeonName != null )
		{
			System.out.print(" This is the x-ray for surgeon ");
			System.out.println(this.SurgeonName);
			print(" @@   not this ");
			System.out.println(SurgeonName);			
		}
		else
		{
			System.out.println(" This is an x-ray (surgeon name not specified) ");
		}
		System.out.print("  Patient: ");
		System.out.println(str);
	}
	//** x-ray method ends*/
	
}
/** The  Surgeon class ends */

