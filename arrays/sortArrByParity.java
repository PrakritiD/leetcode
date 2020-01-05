
public class sortArrByParity {
	public int[] sortArrayByParity(int[] A) {
        int arr_len = A.length;
        int[] ans = new int[arr_len];
        int j = 0;
        int k = arr_len - 1;
        for(int i = 0; i < arr_len; i++) {
            if(A[i] % 2 == 0)  {
                ans[j] = A[i];
                j++;
            } else {
                ans[k] = A[i];
                k--;
            }
        }
        return ans;
    }
}
