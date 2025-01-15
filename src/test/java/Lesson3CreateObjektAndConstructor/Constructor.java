package Lesson3CreateObjektAndConstructor;

public class Constructor {
    //Constructor(){}//Default constructor ,made automatically for Java

    public Constructor(String color, String engine){//Constructor with parameters, User defined
        this.color = color;
        this.engine = engine;
    }
    String color;
    String engine;
}
class ConstructorTest{
    public static void main(String[] args) {
        Constructor constructor = new Constructor("yellow","v4");
        System.out.println(constructor.color);
        System.out.println(constructor.engine);
    }
}
