package Overloading2;

public class MethodOverloading {
    public void show(int i){
        System.out.println(i);
        System.out.println("Data type is int");
    }
    public void show(int i,int b){
        System.out.println(i+b);
        System.out.println("Data type is int");
    }
    public void show(boolean b){
        System.out.println(b);
        System.out.println("Data type is boolean");
    }
    public void show(String s){
        System.out.println(s);
        System.out.println("Data type is String");
    }
    public void show(String s,int a){
        System.out.println("String: " + s + "Int: " +a);
    }

    public void show(int a,String s){
        System.out.println("Good");
    }



}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading overloadingMethod = new MethodOverloading();
        overloadingMethod.show(100);
        boolean b = true;
        overloadingMethod.show(b);
        String s = "Hallo";
        overloadingMethod.show(s);
        overloadingMethod.show(4,5);
        overloadingMethod.show(10,"sdgdfg");
        overloadingMethod.show("sdfsd",4);
    }
}
