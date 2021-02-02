package lecture13;

import java.util.Scanner;

public class Stack {

	private int top;
	private static final int SIZE = 5;
	private String[] s = new String[SIZE]; 
	private String name;
	Scanner input = new Scanner( System.in );

	// Constructor
	public Stack(){
		top=-1;
	}

	
	public void push(){
		if (isStackFull())
			System.out.println("\nStack Overflow !");
		else {
			name = getName();
			top = top +1;			
			s[top] = name;
		}	
	}

	
	public void pop(){
		if (isStackEmpty())
			System.out.println("\nStack Underflow !");
		else {
			String X = s[top];
			System.out.println("\nServicing " + X + "!");
			top = top - 1;	
		}
	}

	
	public void printStackLogical() {
		if (isStackEmpty())
			System.out.println("\nStack Underflow !"); // and exit		
		else {
			for(int i=top; i>=0; i--){
				System.out.println("s["+ i +"]=" + s[i]);
			}
		}
	}
	
	
	public void printStackPhysical() {
		for (int j=0; j < SIZE; j++) 
			System.out.println("s["+ j +"]=" + s[j]);	
	} 
	
	
	private String getName() {		
		System.out.println("\nEnter name: ");
		return input.nextLine(); 			
	} 	
	
	
	public boolean isStackFull () {
		return ((top == SIZE - 1)); 
	} 
	
	
	public boolean isStackEmpty () {
		return (top == -1);
	} 
}
	