
public class minTimeVisitAllPoints {
	public int minTimeToVisitAllPoints(int[][] points) {
		int time = 0;
		int[] currPoint = points[0];
		for (int i = 1; i < points.length; i++) {
			int[] nextPoint = points[i];
			while (true) {
				if (nextPoint[0] > currPoint[0] && nextPoint[1] > currPoint[1]) {
					// up-right
					currPoint[0]++;
					currPoint[1]++;
				} else if (nextPoint[0] > currPoint[0] && nextPoint[1] < currPoint[1]) {
					// down-right
					currPoint[0]++;
					currPoint[1]--;
				} else if (nextPoint[0] < currPoint[0] && nextPoint[1] > currPoint[1]) {
					// up-left
					currPoint[0]--;
					currPoint[1]++;
				} else if (nextPoint[0] < currPoint[0] && nextPoint[1] < currPoint[1]) {
					// down-left
					currPoint[0]--;
					currPoint[1]--;
				} else if (nextPoint[0] > currPoint[0]) {
					currPoint[0]++;
				} else if (nextPoint[0] < currPoint[0]) {
					currPoint[0]--;
				} else if (nextPoint[1] > currPoint[1]) {
					currPoint[1]++;
				} else if (nextPoint[1] < currPoint[1]) {
					currPoint[1]--;
				} else {
					// same
					break;
				}
				time++;
			}
		}
		return time;
	}
}
