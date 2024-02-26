package javapractices;

public class MaxValue {

	public static void main(String[] args) {
		int arr[]= {10, 20, 30, 40 ,80, 90, 70};
		int maxValue= arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxValue)
			{
				maxValue = arr[i];
			}
		}
        System.out.println("Max value of array is : "+maxValue);
	}

}
