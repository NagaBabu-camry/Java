import java.util.Scanner;

public class BubbleSorting {

    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Array Length");

       // int nums [] ={6,2,5,1,9,7};
        int n= sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements in Array");
        for(int k=0;k<n;k++){
            nums[k]=sc.nextInt();
        }

        System.out.println("Before");
        for(int num : nums) {
            System.out.print(num + " ");
        }

        for (int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                   int temp = nums[j];
                   nums[j]=nums[j+1];
                   nums[j+1]=temp;
                }
            }
            System.out.println();
            for(int num : nums){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        System.out.println("After");
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
