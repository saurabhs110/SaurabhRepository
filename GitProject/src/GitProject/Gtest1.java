package GitProject;

import java.util.Scanner;

public class Gtest1 {
  
	
		public static void main(String[] args) {
			 
		
		        // TODO Auto-generated method stub
		        int x, z, temp;
		        System.out.println("Enter x and Z");
		        Scanner in = new Scanner(System.in);
		        x = in.nextInt();
		        z = in.nextInt();
		        System.out.println("Befores Swapping: " + x + z);
		        temp = x;
		        x = z;
		        z = temp;
		        System.out.println("After Swapping: " + x + z);
		        System.out.println("Varibale has changed successfully");
		    } 
			
}


