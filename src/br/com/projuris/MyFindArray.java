package br.com.projuris;

import java.util.stream.IntStream;

public class MyFindArray implements FindArray {
    @Override
    public int findArray(int[] array, int[] subArray) {

        int result = -1;

        for (int j = 0; j < subArray.length; j++) {

            int value = subArray[j];
            boolean match = IntStream.of(array).anyMatch(i -> i == value);

            if (match) {
                for (int f = 0; f < array.length; f++) {

                    if (array[f] == value) {
                        result = f;
                    }

                }

                break;
            }

        }

        return result;

    }
}
