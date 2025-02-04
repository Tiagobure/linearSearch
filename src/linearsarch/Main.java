package linearsarch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vector = new int[8];
	
	   for(int i = 0; i< vector.length;i++) {
		   vector[i] = (int) (Math.random() * 10);
		   System.out.println(vector[i]);
	   }
	   System.out.println("Whats number you search?");
	   Scanner sc = new Scanner(System.in);
	   int search =sc.nextInt();
	   
	   boolean find = false;
	   for(int i = 0; i <vector.length;i++) {
		   
		   if(vector[i] == search) {
			   find = true;
			   break;
		   }
	   }
	   if(find) {
		   System.out.println("found");

	   }else {
		  System.out.println("I didn't find it!!");
	   }
	   
	   sc.close();
	}

}
