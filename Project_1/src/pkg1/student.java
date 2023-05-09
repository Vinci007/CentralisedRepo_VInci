package pkg1;

public class student { //Pillar1 - Class creation Body of class
	int rollNo, age; //create variable 
	public void display1() // method name display1
	{
		System.out.println("Welcome to all of you"); //printing a message
	}
	public void display2() //method name display2
	{
		System.out.println("Automation is very easy"); //printing a message
	}
	public static void main(String[] args) { //creation of main method - Pillar 2 body of main method
		student xyz=new student(); //object creation - Pillar3
		 xyz.display1();
		 xyz.display2();
		 xyz.rollNo=26;
		 System.out.println(xyz.rollNo);
		 xyz.age=19;
		 System.out.println(xyz.age);
	}
}
