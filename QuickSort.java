import java.util.Scanner;

public class QuickSort
{
    private static void quickSort(int[] nums, int low, int high)
    {
        if(low<high)
        {
            int pi=partition(nums,low,high);

            quickSort(nums,low,pi-1);
            quickSort(nums,pi+1,high);          /// Recursion
        }
    }

    private static int partition(int[] nums, int low, int high)
    {
        int pivot = nums[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
            if(nums[j]<pivot)
            {
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        int temp=nums[i+1];
        nums[i+1]=nums[high];
        nums[high]=temp;

        return i+1;
    }


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Array Length");
        int n =sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Array Elements");
        for (int a=0;a<n;a++)
        {
            nums[a]=sc.nextInt();
        }

        quickSort(nums, 0, nums.length-1); ////quickSort(Array, Low, High)

        for(int num : nums)
        {
            System.out.print(num + " ");
        }


    }


}

