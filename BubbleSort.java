package com.as.cs.exercises;
import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int[] a ={22,5,56,49,2};
		int tempVal=0;
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;++j){
				if(a[j]>a[j+1]){
					tempVal = a[j];
					a[j]=a[j+1];
					a[j+1]=tempVal;
				}
			
			}

		}

		for(int i=0; i<a.length; ++i){
			System.out.println((a[i] + " "));
		
		}
	}
}



