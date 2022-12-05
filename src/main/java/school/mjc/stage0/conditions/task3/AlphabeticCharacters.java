package school.mjc.stage0.conditions.task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        int code = (int) character;

        int[] vowels = {65, 69, 73, 79, 85, 97, 101, 105, 111, 117};

        boolean contains = IntStream.of(vowels).anyMatch(x -> x == character);

        if (contains) {
            System.out.println("Vowel");
        } else if (code > 64 && code < 91 || code > 96 && code < 123) {
            System.out.println("Consonant");
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
