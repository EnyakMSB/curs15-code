package ro.fasttrackit.curs15.ExercitiuRecursivitate;

public class ExercitiuRecursivitate {
    public int sumaNumereIntregi(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return sumaNumereIntregi(n - 1) + n;
        }
    }

    public int sumaPrimelorNNumerePare(int n) {
        if (n >= 2 && (n % 2 == 0)) {
            return n + sumaPrimelorNNumerePare(n - 2);
        } else {
            return 0;
        }
    }

    public int sumNumberDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return sumNumberDigits(n / 10) + n % 10;
        }
    }

    public String reversedPalindrome(String word) {
        if (word == null || "".equals(word)) {
            return "";
        } else {
            return reversedPalindrome(word.substring(1)) + word.charAt(0);
        }
    }

    public boolean ckeckPalindrome(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return ckeckPalindrome(word.substring(1, word.length() - 1));
        } else {
            return false;
        }
    }
}
