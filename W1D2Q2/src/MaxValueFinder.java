
public class MaxValueFinder {
	
	public static void main(String[] args) {
		int[][] data = {
                {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}
		};
		MaxValueFinder example1 = new MaxValueFinder();
		example1.findMaxValue(data);
	}
	
	public void findMaxValue(int[][] numbers) {
		int row = 0, col = 0;	
		int max = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > max) {
                    max = numbers[j][i];
                    row = j + 1;
                    col = i + 1;
                }
            }
        }	
        System.out.println("The max value of the 2D array is " + max 
				+ " and it is in row " + row + " column " + col);
	}

}
