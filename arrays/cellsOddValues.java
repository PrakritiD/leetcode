
public class cellsOddValues {
	
	public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int count = 0;
        for(int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for(int j = 0; j < m; j++) {
                matrix[row][j]++;
            }
            for(int j = 0; j < n; j++) {
                matrix[j][col]++;
            }
        }
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[0].length; c++) {
                if(matrix[r][c]%2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

}
