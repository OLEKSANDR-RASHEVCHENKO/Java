package Overloading;

public class MethodOverloadingTwo {
    public int add(int a, int b){
        return a+b;
    }
    public String add(String s1, String s2){
        return s1+s2;
    }
}
class MethodOverloadingTestTwo{
    public static void main(String[] args) {
        MethodOverloadingTwo obj = new MethodOverloadingTwo();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add("Hello", "World"));
    }
}
