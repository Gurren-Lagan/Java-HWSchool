//modified by Yair Reyes
// test class for HelloWorld.java
import java.util.Scanner;
public class TestHelloWorldFinalScanner{
public static void main(String [] args){

	 Scanner reader = new Scanner(System.in);
	 String greeting;
	 String name;

	 System.out.println("Enter your greeting: ");
		greeting = reader.nextLine();

	 System.out.println("Enter the name: ");
	  name = reader.nextLine();

	 HelloWorld salt = new HelloWorld(greeting,name);

	System.out.println(salt.salute());
}

}
