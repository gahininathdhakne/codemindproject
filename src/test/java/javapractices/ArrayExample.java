package javapractices;

import java.util.concurrent.SynchronousQueue;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[] = {10, 20, 10, 40, 50};
		int counter =0;
		System.out.println("1st element:- "+arr[0]);
		System.out.println("1st element:- "+arr[1]);
		System.out.println("1st element:- "+arr[2]);
		System.out.println("1st element:- "+arr[3]);
		System.out.println("1st element:- "+arr[4]);
		
	//	System.out.println(arr.length);
		
	/*	for(int i=0;i<arr.length;i++)
		{
			System.out.println("Element at index "+i+":"+arr[i]);
		}
		*/

		//for each loop
		/*for(int a:arr)
		{
			System.out.println("Element:"+a);
		}*/
		 
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10)
			{
				counter = counter+1; // counter++;
			}
		}
		System.out.println("Element 10 is occured: "+counter+" Times");
	}
}
