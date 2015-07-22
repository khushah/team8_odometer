import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args){
	Scanner readerObject = new Scanner(System.in);
	String numberString = readerObject.next();
	Odometer odometer=new Odometer(numberString.length());


	System.out.println();
	System.out.println(odometer.nextValue(new Integer(numberString)));
	System.out.println(odometer.previousValue(new Integer(numberString)));
	
}
}