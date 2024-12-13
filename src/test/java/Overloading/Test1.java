package Overloading;

public class Test1 {
    public int sum(int a, int b,int c) {
        return a + b + c;
    }
    public int sredneeArifm(int a, int b, int c) {
        return sum(a,b,c) / 3;
    }
}
