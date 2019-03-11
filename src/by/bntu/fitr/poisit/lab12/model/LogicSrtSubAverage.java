package by.bntu.fitr.poisit.lab12.model;

public class LogicSrtSubAverage {
    public static int[][] findAverage(int[][] array) { //method subtracts from the elements of each row of the matrix its average
        int sum = 0;
        int amount = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                amount += 1;
                average = sum / amount;
            }
        }

        int[][] result = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[i][j] - average;
            }
        }
        return result;
    }

}
