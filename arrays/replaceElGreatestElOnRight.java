
public class replaceElGreatestElOnRight {
	public int[] replaceElements(int[] arr) {
        for(int i  = 0; i < arr.length; i++) {
            if(i + 1 == arr.length) {
                arr[i] = -1;
                break;
            }
            int max = arr[i + 1];
            for(int j = i + 2; j < arr.length; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}
