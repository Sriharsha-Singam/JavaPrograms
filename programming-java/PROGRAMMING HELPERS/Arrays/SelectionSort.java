import java.util.*;
public class SelectionSort
{
  public static void main(String[] args)
  {
    int arr[]={234,151,123,4,5342,76,48};
    int arrLength = arr.length;
    for(int i=0;i<arrLength-1;i++)
    {
        int min=i;
        for (int k=i+1;k<arrLength;k++)
        {
            if(arr[k]>arr[min])
            {
                min = k;
            }
        }
        if (i != min) 
        {
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    for (int j=0;j<arrLength;j++) 
    {
        System.out.println(arr[j]+" ");
    }
  }
}
