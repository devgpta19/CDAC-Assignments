package com.demo.beans;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

	private int arr[];

	public MyArray() {
		arr = new int[10];
	}

	public MyArray(int n) {
		arr = new int[n];
	}

	Scanner sc = new Scanner(System.in);

	public void add() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public void addAuto() {
		int[] arr2 = { 8, 4, 3, 9, 1, 0, 2, 7, 5, 6 };
//		int []arr2 = {10,23,42,46,51,70,81,86,89,90};
		arr = arr2;
	}

	public void display() {
		System.out.println(Arrays.toString(arr));
	}

	public void display(int arr1[]) {
		System.out.println(Arrays.toString(arr1));
	}

	public void binarySearch(int x) {

		int pos = binSearch(arr, 0, arr.length - 1, x);
		if (pos == -1)
			System.out.println("The Number is Not present in Array");
		else
			System.out.println("The Number is found At " + pos + " in the array");
	}

	private int binSearch(int[] arr, int start, int end, int target) {

		int mid = (start + end) / 2;

		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] > target) {
			end = mid - 1;
			return binSearch(arr, start, end, target);
		} else if (arr[mid] < target) {
			start = mid + 1;
			return binSearch(arr, start, end, target);
		} else
			return -1;

	}

	public void quickSort() {
		qSort(arr, 0, arr.length - 1);
	}

	public void qSort(int[] arr, int start, int end) {

		if (start >= end)
			return; // Important Condition

		int par = partition(arr, start, end);
		qSort(arr, start, par - 1);
		qSort(arr, par + 1, end);
	}

	private int partition(int[] arr2, int start, int end) {
		int i = start;
		int pivot = start;
		int j = end;
		while (i < j) {

			while (i < end && arr[pivot] >= arr[i])
				i++;

			while (j > start && arr[pivot] < arr[j])
				j--;

			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

		}

		if (pivot != j) {
			int temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		return j;
	}

	public void bubbleSort() {
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0, j = 1; i < arr.length - 1; i++, j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		display();
	}

	public void insertionSort() {
		int j,key;
		for(int i=1; i<arr.length; i++) {
			j = i-1;
			key = arr[i];
			while(j>-1 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void selctionSort() {
		for(int i=0;i<arr.length;i++) {
			int minpos = findMin(arr, i);
			
			int temp = arr[minpos];
			arr[minpos] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	private int findMin(int[] arr2, int start) {
		int minpos = start;
		for(int i=start; i<arr2.length; i++) {
			if(arr[minpos]> arr[i]) {
				minpos = i;
			}
		}
		return minpos;
	}

	public void heapSort() {
		
		
		
	}

	public void mergeSort() {
		
		mergeSorting(arr, 0, arr.length-1);
		
	}

	private void mergeSorting(int[] arr2, int start, int end) {
		if(start > end) return;
		int mid = (start+end) / 2;
		mergeSorting(arr2, start, mid);
		mergeSorting(arr2, mid+1, end);
		
		merge(arr, start, mid, end);
		
	}

	private void merge(int[] arr2, int start, int mid, int end) {
		int n1 = mid-start+1; // length of 1st Array
		int n2 = mid-end; // length of 2nd Array
		
		int []leftArr = new int [n1];
		int []rightArr = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArr[i] = arr[start+i];
		}
	}

}
