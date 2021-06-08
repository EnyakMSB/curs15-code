package ro.fasttrackit.curs15;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int inmultire(int a, int b) {
        return a * b;
    }

    public double impartire(int a, int b) {
        return b == 0 ? 0 : (double) a / b;
    }
}
