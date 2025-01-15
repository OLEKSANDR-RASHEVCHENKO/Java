package Losson1;

public class ArithmetickOpetation {
    public static void main(String[] args) {
        //+
        int a = 5 ;
        int b = 10;

        int c = a+b;
        System.out.println(a+b);
        System.out.println(c);

        // -
        System.out.println(a-b);

        //*
        System.out.println(a*b);

        // /
        int g= 10;
        int h = 3;
        int i= g/h;
        System.out.println(i);

        // %
        System.out.println(g%h);

        // --/++
        int j = g-h++;
        System.out.println(j);
        System.out.println(h);
    }
}
