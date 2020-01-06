
public class sqOfSortedArr {
	public int[] sortedSquares(int[] A) {
        int[] neg = new int[A.length];
        int i = 0;
        while(i < A.length && A[i] < 0) {
            neg[neg.length - i - 1] = A[i] * A[i]; //descending
            i++;
        }
        //i pos has non-neg number
        int[] pos = new int[A.length - i];
        int j = 0;
        while(i < A.length) {
            pos[j] = A[i] * A[i];
            j++;
            i++;
        }
        //now we have two sorted arrays so merge sort
        int[] ans = new int[A.length];
        int pos_neg = 0;
        int pos_pos = 0;
        while(pos_neg < neg.length && neg[pos_neg] == 0) {
            pos_neg++;
        }
        for(int k = 0; k < ans.length; k++) {
        	if(pos_neg == neg.length)  {
        		if(pos_pos == pos.length) {
        			break;
        		} else {
        			ans[k] = pos[pos_pos];
        			pos_pos++;
        			continue;
        		}
        	}

        	if(pos_pos == pos.length)  {
        		ans[k] = neg[pos_neg];
        		pos_neg++;
        		continue;
        	}

        	if(neg[pos_neg] < pos[pos_pos]) {
        		ans[k] = neg[pos_neg];
        		pos_neg++;
        	} else {
        		ans[k] = pos[pos_pos];
        		pos_pos++;
        	}
        }
        return ans;
	}
}
