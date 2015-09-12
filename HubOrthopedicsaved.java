// Carlos A Perdomo January 22 2008 - CIS402-A - Assingment 3.1
// Orthopedic.java

/*
 * This program display the double length of a hardcoded "Hello World" string
 * An object of the Orthopedic class is created which call the method that returs the double length
 */
 
/** The  Orthopedic is define */
public class Orthopedic extends Surgeon
{
	static String ThisOrthopedistName;
	//** main method defined */
	
	Orthopedic(String OrthopedistName)
	{
		System.out.print(" Orthopedist  ");
		System.out.print(OrthopedistName);
		System.out.println(" has been created");
		ThisOrthopedistName = OrthopedistName;
	} 
		
	public static void main(String[] args)
	{
		/** The string is defined */
		System.out.println("\n   **  Undefined Surgeon **");
		Surgeon SurgeonDoctor1 = new Surgeon();	
		SurgeonDoctor1.xray("Paul");
		
		System.out.println("\n   **  Sugeon Luis **");
		Surgeon SurgeonDoctor2 = new Surgeon("Luis");
		SurgeonDoctor2.xray("Steven");
		
		System.out.println("\n   **  Undefined Orthopedist **");
		Orthopedic OrthopedicDoctor1 = new Orthopedic();
		OrthopedicDoctor1.xray("Sandra");
		OrthopedicDoctor1.Diagnostic("Osgood-Schlatter Disease");
		OrthopedicDoctor1.sterilize();
		
		System.out.println("\n   **  Orthopedist Mary **");
		Orthopedic OrthopedicDoctor2 = new Orthopedic("Mary");
		ThisOrthopedistName = OrthopedicDoctor2.ThisSurgeonName;		
		OrthopedicDoctor2.xray("Mike");
		OrthopedicDoctor2.sterilize();
		
	}
	//* main method ends */
	
	//*This xray method overrides one from surgeon
	void xray (String str)
	{	
		if ( ThisOrthopedistName != null )
		{
			System.out.print(" This is the x-ray for orthopedist ");
			System.out.println(ThisOrthopedistName);
		}
		else
		{
			System.out.println(" This is an x-ray (orthopedist not specified) ");
		}
		System.out.print("  Patient: ");
		System.out.println(str);		
	}	
	
	//Method not found in parent class
	void sterilize ()
	{	
		if ( ThisOrthopedistName != null )
		{
			System.out.print(ThisOrthopedistName);
			System.out.println("Is busy sterilizing");
		}
		else
		{
			System.out.println("an orthopedist is doing sterilization");
		}
	}	
	
	//Method not found in parent class
	void Diagnostic ( String str)
	{	
		if ( ThisOrthopedistName != null )
		{
			System.out.print(" This is the diagnostic from orthopedist: ");
			System.out.println(ThisOrthopedistName);
		}
		else
		{
			System.out.println(" This is a diagnostic (orthopedist not specified): ");
		}
		System.out.println(str);
	}
		
}
/** The  Orthopedic class ends */

