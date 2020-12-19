package mirea;

import java.util.ArrayList;
import java.util.Scanner;

public class Digits {
    public ArrayList<Integer> integers = new ArrayList<>();
    public int num = 1;
    public int i = 0;
    public Digits() {

    }
    public void FillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Вводите числа. Чтобы закончить введите 0: ");
        while (num != 0) {
            num = sc.nextInt();
            integers.add(num);
        }
        sc.close();
    }
    public void Recursion() {
        if (integers.get(i) % 2 != 0) {
            System.out.println(integers.get(i));
        }
        if (++i < integers.size()) {
            Recursion();
        }
    }
}