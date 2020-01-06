
public class flippingAnImage {
	public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0; i < A.length; i++) {
            int[] arr = A[i];
            int len = arr.length;
            //flip
            for(int j = 0; j < len/2; j++) {
                int temp = arr[j];
                arr[j] = arr[len  - j - 1];
                arr[len  - j - 1] = temp;
            }
            for(int j = 0; j < len; j++) {
                if(arr[j] == 0) {
                    arr[j] = 1;
                } else {
                    arr[j] = 0;
                }
            }
            A[i] = arr;
        }
        return A;
    }
}
