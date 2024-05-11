package GP;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		 
	
	        // TODO Auto-generated method stub
	        int x, z, temp;
	        System.out.println("Enter x and Z");
	        Scanner in = new Scanner(System.in);
	        x = in.nextInt();
	        z = in.nextInt();
	        System.out.println("Before Swapping: " + x + z);
	        temp = x;
	        x = z;
	        z = temp;
	        System.out.println("Afters Swapping: " + x + z);
	         
	    } 
		
		
	}


