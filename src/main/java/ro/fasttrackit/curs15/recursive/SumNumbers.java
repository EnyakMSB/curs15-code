package ro.fasttrackit.curs15.recursive;

public class SumNumbers {
    public int sum(int n){
        if(n==0 || n==1){
            return n;
        }else{
           return sum(n-1)+n;
        }
    }

    public int sumOfNumber(int n){
        if(n<10){
            return n;
        }else{
            return sumOfNumber(n/10)+n%10;
        }
    }
}
