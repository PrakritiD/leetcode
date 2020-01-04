public class NumbersWithEvenNumOfDigits {
	public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int len = 0;
            while(num != 0) {
                num /= 10;
                len++;
            }
            if(len%2 == 0) {
                count++;
            }
        }
        return count;
    }
}
