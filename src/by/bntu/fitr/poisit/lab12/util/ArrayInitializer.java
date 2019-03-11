package by.bntu.fitr.poisit.lab12.util;

import java.util.Random;

public class ArrayInitializer {
    public static void randomInit(int[][] array) {
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = 2 * random.nextInt(100 / 2 - 1) + 1;
            }

        }
    }

}
