package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        Map<Character, Integer> map = new HashMap<>();

        // Ввод строк
        for (int i = 0; i < 10; i++) {
            var line = reader.readLine();
            for (var currentChar: line.toLowerCase().toCharArray()) {
                map.merge(currentChar, 1, (old, value) -> old + 1);
            }
        }
        // напишите тут ваш код
        for (Character c: alphabet) {
            System.out.printf("%c %d\n", c, toInt(map.get(c)));
        }
    }

    static int toInt(Integer i) {
        return i == null ? 0 : i;
    }
}
