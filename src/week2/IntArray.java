package week2;

import java.util.Random;
import java.util.Scanner;

public class IntArray {
    int[] numbers;
    Random rand = new Random();

    IntArray(int size) {
        numbers = new int[size];
    }

    void generate() {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rand.nextInt(0, 100);
    }

    void adjust(int lower, int upper) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = lower + numbers[i] * (upper - lower) / 100;
        }
    }
    void print() {
        for (int n : numbers) {
            System.out.print("  " + n);
        }
        System.out.println();
    }

    public int get(int i) {
        // TODO Auto-generated method stub
        return numbers[i];
    }
}
