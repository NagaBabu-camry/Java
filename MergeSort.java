import java.util.Scanner;
import java.util.WeakHashMap;

public class MergeSort
{
    private static void mergeSort(int[] nums, int l, int r)
    {
        if (l < r)
        {
            int mid = (l + r) / 2;
            mergeSort(nums, l, mid);
            mergeSort(nums, mid + 1, r);

            merge(nums, l, mid, r);
        }
    }
    private static void merge(int[] nums, int l, int mid, int r)
    {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] lnums = new int[n1];
        int[] rnums = new int[n2];
        for(int x = 0; x < n1; x++)
        {
            lnums[x] = nums[l + x];
        }
        for (int x = 0; x < n2; x++) {
            rnums[x] = nums[mid + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (lnums[i] <= rnums[j]) {
                nums[k] = lnums[i];
                i++;
            } else {
                nums[k] = rnums[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = lnums[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = rnums[j];
            j++;
            k++;
        }
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
        System.out.println("Before Sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
        mergeSort(nums,0, nums.length-1);
        System.out.println();
        System.out.println("After Sorting");
        for(int num : nums)
        {
            System.out.print(num + " ");
        }
    }
}
