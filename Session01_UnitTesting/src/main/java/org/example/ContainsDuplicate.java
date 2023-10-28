package org.example;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] numbers) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 5};
        int[] anotherArray = {1, 2, 3, 4, 1};

        System.out.println(containsDuplicate(array));
        System.out.println(containsDuplicate(anotherArray));
    }
}
