import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args)
    {

        int midIndex=0;

        Scanner sc=  new Scanner(System.in);
        System.out.println("Array Length");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter Array Elements");
        for(int k=0;k<n;k++)
        {
         nums[k]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Before");
        for(int num :nums)
        {
            System.out.print(num+" ");
        }


        for(int i=0;i<nums.length;i++)
        {
            midIndex=i;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[midIndex]>nums[j])
                    midIndex=j;
            }
            int temp=nums[midIndex];
            nums[midIndex]=nums[i];
            nums[i]=temp;

        }




        System.out.println();
        System.out.println("After");
        for(int num :nums)
        {
            System.out.print(num+" ");
        }


    }
}
