package com.sample.dg;


//Bubble Sort is the simplest sorting algorithm 
//swap the elements if they are in wrong order.

public class BubbleSortTest 
{	
    public static void main(String args[])
    {
        BubbleSortTest bst = new BubbleSortTest();
        
        //Initial array for ascending order
        int arr[] = {99, 22, 50, 24, 33, 11, 9};
        
        bst.bubbleSort(arr, true);
        
        System.out.println("Sorted collection ascending order");
        
        bst.printArray(arr);
        
        //Initial array for descending order
        int arr1[] = {99, 22, 50, 24, 33, 11, 9};
        
        bst.bubbleSort(arr1, false);
        
        System.out.println("Sorted collection descending order");
        
        bst.printArray(arr1);
    }
    
	void bubbleSort(int arr[], boolean ascOrdesc)
    {
        int n = arr.length;
        
        //Run two loops (Outer and Inner)
        for (int i = 0; i < n-1; i++)
        {
        	
            for (int j = 0; j < n-i-1; j++)
            {
            	if (arr[j] > arr[j+1])
                {
            		if(ascOrdesc)
            		{
            			// swap temp and arr[i]
            			int temp = arr[j];
            			arr[j] = arr[j+1];
            			arr[j+1] = temp;
            		}
            		
                }
            	else
            	{
            		if(!ascOrdesc)
            		{
            			// swap temp and arr[j+1]
            			int temp = arr[j+1];
            			arr[j+1] = arr[j];
            			arr[j] = temp;
            		}
            		
            	}
            }
        }
    }
 
    /* Prints the collection */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    

}
