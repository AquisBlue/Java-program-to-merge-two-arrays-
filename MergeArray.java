import java.util.Arrays;

public class MergeArray 
{
	public static void concantenate(int arr1[],int arr2[])
	{
		int array[] = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			array[i]=arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++)
		{
			array[arr1.length+j]=arr2[j];
		}
		Arrays.sort(array);
		for(int i:array)
			System.out.println(i);
	}
	public static void main(String[] args) 
	{
		int arr1[] = {2,3,7};
		int arr2[] = {1,5,4,6};
		concantenate(arr1,arr2);

	}

}
