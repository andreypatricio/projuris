package br.com.projuris;

import java.util.stream.IntStream;

public class MyFindChar implements FindCharachter {

    @Override
    public char findChar(String word) {

        char result = ' ';

        char[] chars = word.toCharArray();

        for (char letter : chars) {
            IntStream in = word.codePoints();
            long count = in.filter(i -> i == letter).count();
            if(count == 1) {
                result = letter;
                break;
            }

        }

        return result;

    }
}
