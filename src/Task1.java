public class Task1 {
    public static void main(String[] args)  {
        int [] nums = new int[10];
        int i;
        for (i = 0; i < nums.length;i++) {
            nums[i] = nums.length - i-1;//numbers 0 to 9
        }
        for (int array:nums){
            System.out.println(array);
        }


    }
}
