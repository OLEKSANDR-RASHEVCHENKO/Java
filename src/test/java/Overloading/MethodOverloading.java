package Overloading;

public class MethodOverloading {
    public void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is int");
    }
    public void show(int a, int b){
        System.out.println(a);
    }
    public void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");
    }
    public void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is String");
    }
    public void show(String s,int a){
        System.out.println("String " + s + "int " + a);
    }
    public void show(int a,String s){
        System.out.println("Nice day");
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        int a = 500;
        m1.show(a);
        boolean b = true;
        m1.show(b);
        String s = "Hello";
        m1.show(s);
        m1.show(4,7);
        m1.show("asd",10);
        m1.show(10,"dsfsd");
    }
}
