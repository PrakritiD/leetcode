
public class arrayPartitionI {
	public int arrayPairSum(int[] nums) {
        //first sort then make adjacent pairs
        //insertion sort
        for (int counter = 1; counter < nums.length; counter++) {

			int temp = nums[counter];

			int j = counter - 1;

			while (j >= 0 && nums[j] >= temp) {
				nums[j + 1] = nums[j];
				j--;
			}

			nums[j + 1] = temp;

		}
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i %2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
