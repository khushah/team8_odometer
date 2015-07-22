package odometer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {
public static void main(String[] args){
	Odometer odometer=new Odometer();
	ArrayList<Integer> listOfNumbers=odometer.findNumbers(new Scanner(System.in).nextInt());
	Iterator<Integer> iterator = listOfNumbers.iterator();
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
}
}
