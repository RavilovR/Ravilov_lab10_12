package mirea;

public class Main {

    public static void main(String[] args) {
        Digits di = new Digits();
        di.FillArray();
        System.out.println("Нечётные числа последовательности:");
        di.Recursion();
        return;
    }
}