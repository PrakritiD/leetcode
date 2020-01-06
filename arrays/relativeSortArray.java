import java.util.Arrays;

public class relativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int k = 0;
        for(int i = 0; i < arr2.length; i++) {
            int item = arr2[i];
            for(int j = 0; j < arr1.length; j++) {
                if(arr1[j] == item) {
                    ans[k] = item;
                    arr1[j] = -1;
                    k++;
                }
            }
        }
        int[] not_in_arr2 = new int[arr1.length - k];
        int m = 0;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != -1) {
                not_in_arr2[m] = arr1[i];
                m++;
            }
        }
        
        Arrays.sort(not_in_arr2);
        for(int i = 0; i < arr1.length; i++) {
            if(i < k) {
                arr1[i] = ans[i];
            } else {
                arr1[i] = not_in_arr2[not_in_arr2.length - m];
                m--;
            }
        }
        return arr1;
	}
}
