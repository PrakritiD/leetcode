
public class SumZero {

	public int[] sumZero(int n) {
        int[] ans = new int[n];
        int num = n/2;
        for(int i = 0; i < n/2; i++) {
            ans[i] = -num;
            ans[n - i - 1] = num;
            num--;
        }
        if(n%2 != 0) {
            ans[n/2] = 0;
        }
        return ans;
    }
	
}
