package by.bntu.fitr.poisit.lab12.model;

public class LogicStrMaxSumEl {
    public static int findSrtMaxSumEl(int[][] array) { //method that finds a string with the maximum sum of element modules.
        int a = 0;
        int indexStr = 0;
        for(int i = 0; i < array.length; i++){
            int sum = 0;
            for(int j = 0; j < array.length; j++){
                sum += array[i][j];
            }
            if(a < sum){
                a = sum;
                indexStr = i;
            }
        }
        return indexStr;
    }
}

