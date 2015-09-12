// Hub
// Carlos A Perdomo January 22 2008 - CIS402-A - Assingment 3.1
// Orthopedic.java

/*
 * This program create different surgeons and Orthopedists (derived from surgeon)
 * Surgeon objects can only perform x-ray methods
 * Orthopedic objects cab perform x-ray, sterilize, and diagnostic methods
 */
 
/** The Class Orthopedic is define */
public class Orthopedic extends Surgeon
{
	String OrthopedistName;
	//** main method defined */
	
	//Default constructor - execute Surgeon contructor first
	Orthopedic()
	{
	}
	
	//Constructor that assigns a name (Overwrite surgeon)
	Orthopedic(String OrthopedistNameStr)
	{
		System.out.print(" Orthopedist b clone1 t ");
		System.out.print(OrthopedistNameStr);
		System.out.println(" has been created");
		OrthopedistName = OrthopedistNameStr;
	}
		
	//Main function for Orthopedic executable
	public static void main(String[] args)
	{

		System.out.println("\n   **  Undefined Surgeon **");
		Surgeon SurgeonDoctor1 = new Surgeon();	
		SurgeonDoctor1.xray("Eduardo");
		
		System.out.println("\n   **  Undefined Surgeon **");//1
		Surgeon SurgeonDoctor1 = new Surgeon();	//1
		SurgeonDoctor1.xray("Maria");//3		
		
		System.out.println("\n   **  Surgeon Luis **");
		Surgeon SurgeonDoctor2 = new Surgeon("Luis");
		SurgeonDoctor2.xray("Steven");
		
		System.out.println("\n   **  Undefined Orthopedist **");
		Orthopedic OrthopedicDoctor1 = new Orthopedic();
		OrthopedicDoctor1.xray("Sandra");
		OrthopedicDoctor1.sterilize();
		OrthopedicDoctor1.diagnostic("Osgood-Schlatter Disease");
		
		System.out.println("\n   **  Orthopedist Mary **");
		Orthopedic OrthopedicDoctor2 = new Orthopedic("Mary");		
		OrthopedicDoctor2.xray("Mike");
		OrthopedicDoctor2.sterilize();
		OrthopedicDoctor2.diagnostic("Clubfoot");
		
	}
	//* main method ends */
		
	//*This xray method overrides one from Surgeon
	void xray (String str)
	{	
		if ( this.OrthopedistName != null )
		{
			System.out.print(" This is the x-ray for orthopedist ");
			System.out.println(this.OrthopedistName);
		}
		else
		{
			System.out.println(" This is an x-ray (orthopedist name not specified) ");
		}
		System.out.print("  Patient: ");
		System.out.println(str);		
	}	
	
	//Method not found in parent class
	void sterilize ()
	{	
		if ( this.OrthopedistName != null )
		{
			System.out.print(" ");
			System.out.print(this.OrthopedistName);
			System.out.println(" is busy sterilizing");
		}
		else
		{
			System.out.println(" an orthopedist is doing sterilization");
		}
	}	
	
	//Method not found in parent class
	void diagnostic ( String str)
	{	
		if ( this.OrthopedistName != null )
		{
			System.out.print(" This is the diagnostic from orthopedist ");
			System.out.print(this.OrthopedistName);
			System.out.print(": ");
		}
		else
		{
			System.out.print(" This is a diagnostic (orthopedist name not specified): ");
		}
		System.out.println(str);
	}
		
}
/** The  Orthopedic class ends */

