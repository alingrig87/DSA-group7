package org.example;

public class W01_FizzBuzz {

    public static void showFizzBuzz(int n) {
        // 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ..... 98 Fizz Buzz
        for(int i = 1; i <= n; i++) {
            if(i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if(i % 3 == 0){
                System.out.print("Fizz ");
            }
            else if(i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        showFizzBuzz(100);
    }
}
