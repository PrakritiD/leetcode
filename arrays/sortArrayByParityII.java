
public class sortArrayByParityII {
	 public int[] sortArrayByParityII(int[] A) {
	        int[] odd = new int[A.length];
	        int[] even = new int[A.length];
	        int j = 0;
	        int k = 0;
	        
	        for(int i = 0; i < A.length; i++) {
	            if(A[i] % 2 == 0) {
	                even[j] = A[i];
	                j++;
	            } else {
	                odd[k] = A[i];
	                k++;
	            }
	        }
	        
	        for(int i = 0; i < A.length; i++) {
	            if(i % 2 == 0) {
	                j--;
	                A[i] = even[j];
	            } else {
	                k--;
	                A[i] = odd[k];
	            }
	        }
	        return A;
	 }
}
