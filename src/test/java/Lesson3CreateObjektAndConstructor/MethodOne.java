package Lesson3CreateObjektAndConstructor;

public class MethodOne {
    public int getSumma(int first, int second,int third) {
        int result = first+second+third;
        return result;
    }
    public int average(int a,int b,int c){
       int result =  getSumma(a,b,c)/3;
       return result;
    }
}
class  test{
    public static void main(String[] args) {
        MethodOne methodOne = new MethodOne();
        int sum = methodOne.getSumma(1,2,3);
        System.out.println(sum);
        System.out.println( methodOne.average(1,2,3));
    }
}
