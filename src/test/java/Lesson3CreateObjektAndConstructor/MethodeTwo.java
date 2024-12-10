package Lesson3CreateObjektAndConstructor;

public class MethodeTwo {
    String color;
    String engine;
    int speed;

    public int gas(int i) {
        speed +=i;
        return  speed;
    }
    public int stop(int i) {
        speed -= i;
        return speed;
    }
    public void showInfo(){
        System.out.println("color: " + color + " engine: " + engine + " speed: " + speed);
    }
}
class useMethod {
    public static void main(String[] args) {
        MethodeTwo methodeTwo = new MethodeTwo();
        methodeTwo.color = "Black";
        methodeTwo.engine = "V8";
        methodeTwo.speed = 50;

        methodeTwo.showInfo();
        methodeTwo.gas(30);
        methodeTwo.showInfo();
        methodeTwo.stop(20);
        methodeTwo.showInfo();
    }
}