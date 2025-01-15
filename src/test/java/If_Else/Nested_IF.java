package If_Else;

public class Nested_IF {
    int engine;
    int doorCount;

    Nested_IF(int engine,int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}
class Nested_if_test {
    public static void main(String[] args) {


        Nested_IF nestedIf = new Nested_IF(3, 4);
        Nested_IF nestedif2 = new Nested_IF(2, 5);
        if (nestedIf.engine>nestedif2.engine) {
            if (nestedIf.doorCount > nestedif2.doorCount) {
                System.out.println("first ");
            } else {
                System.out.println("two");
            }}
            else{
                System.out.println("less");
            }
        }

    }

