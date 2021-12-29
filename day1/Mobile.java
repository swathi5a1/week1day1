/*ClassRoom: work 1 
 *
==========
- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- Create main method
- Create object for Mobile class and call the methods using the object
- Execute the class and get the result in console?
Class room 2:

1. Create Global Variables with different data types
    mobileModel (with String data type)
    mobileWeight (with int data type)
    isFullCharge (with boolean data type)
    mobileCost (with double datatype)
    - Call all the global variables from main method and print all values in console

*/


package week1.day1;

public class Mobile {
			
	
	String mobileModel = "Iphone";
	int mobileWeight = 12;
	boolean isFullcharge = true;
	double mobileCost = 33500.56;
	public void makeCall() {
	
		System.out.println("make a call");
	}
	public void sendMsg() {
		
		System.out.println("send a msg");
	}
	
	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.makeCall();
		obj1.sendMsg();
		System.out.println(obj1.mobileModel);
		System.out.println(obj1.mobileWeight);
		System.out.println(obj1.isFullcharge);
		System.out.println(obj1.mobileCost);
		
	}
}
