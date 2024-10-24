import java.util.Scanner;

public class InsertionSort
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array Length");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter Elements");
        for(int a=0;a<n;a++)
        {
            nums[a]=sc.nextInt();
        }

        for(int i=1;i<nums.length;i++)
        {
            int key = nums[i];
            int j=i-1;
            while (j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }

        System.out.println();
        System.out.println("Sorted");
        for(int num : nums)
        {
           System.out.print(num + " ");
        }

    }
}
