package hw3Package;

import java.util.Random;
import java.util.Scanner;

public class Student {
	int[] studentID = new int[5];
	String[] studentName = new String[5];
	Scanner sc = new Scanner(System.in);
	
	public void fillArray(){
	int n=1; // to keep count of the students number for print
	while (n<=studentName.length){
	
		for (int i =0; i<studentName.length; i++){
			System.out.println("Please enter the student's "+n+" name");
			studentName[i] = sc.nextLine();
			n++;
		}
	  }
	Random rn = new Random();
		for (int j =0; j<studentID.length; j++){
			studentID[j]= rn.nextInt(20);
		}
	for (int k=0; k<studentID.length;k++ ){
		System.out.println("Student "+studentName[k] + " 's ID number is : "+studentID[k]);
	}
	
	
	}
}
