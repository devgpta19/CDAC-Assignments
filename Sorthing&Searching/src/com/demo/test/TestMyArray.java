package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyArray;

public class TestMyArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyArray marr = new MyArray();
		int ch = 0;
		
		do {
			System.out.println("1. Add Elements in Array\n"
					+ "2. Display Array\n"
					+ "3. Search an element using binary search\n"
					+ "4. Perform Quick-sort\n"
					+ "5. Perform Bubble-sort\n"
					+ "6. Perform Insertion-sort\n"
					+ "7. Perform Selection-sort\n"
					+ "8. Perform Merge-sort\n"
					+ "9. Perform Count-sort\n"
					+ "10. Perform Heap-sort\n"
					+ "11. EXIT");
			System.out.println("Enter Your Choice");
			ch = sc.nextInt();
			
			switch(ch) {
			case 0->{
				marr.addAuto();
				marr.display();
			}
			case 1->{
				marr.add();
				marr.display();
			}
			case 2->{
				marr.display();
			}
			case 3->{
				System.out.println("Enter an Element to Search");
				int x = sc.nextInt();
				marr.binarySearch(x);
			}
			case 4->{
				marr.quickSort();
			}
			
			case 5->{
				marr.bubbleSort();
			}
			
			case 6->{
				marr.insertionSort();
			}
			
			case 7->{
				marr.selctionSort();
			}
			
			case 8->{
				marr.heapSort();
			}
			
			case 9->{
				marr.mergeSort();
			}
			
			case 11->{
				System.out.println("Thank You For Visiting...");
				sc.close();
				System.exit(0);
			}
			}
			
			
		} while (ch != 10);

	}

}
