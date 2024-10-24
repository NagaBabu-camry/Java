public class Demo {
    public static void main(String[] args) {
        int nums[]={5,6,8,9,11};
        int target = 11;
        int result1 =binarySearch(nums, target);
        int result2 =linerSearch(nums, target);

        if(result1 != -1)
            System.out.println("Element found at :" + result2);
        else
            System.out.println("Element not found");
    }

    public static int linerSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps Taken by liner :" + steps);
                return i;
            }
        }
        System.out.println("Steps Taken by liner :" + steps);
        return -1;
    }
    public static int binarySearch ( int[] nums, int target){
            int left = 0;
            int steps =0;
            int right = nums.length - 1;
            while (left <= right) {
                steps++;
                int mid = (left + right) / 2;
                if (nums[mid] == target) {
                    System.out.println("Steps for Birnay:"+steps);
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;

                } else
                    right = mid - 1;
            }
        System.out.println("Steps for Birnay:"+steps);
            return -1;
        }
    }
