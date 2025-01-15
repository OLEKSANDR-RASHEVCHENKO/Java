package If_Else;

public class Test1 {
    public static void main(String[] args) {
        int a = 10;

        if (a<20)
            System.out.println("a is less then 20");
        else
            System.out.println("a is more then 20");
        System.out.println("Hallo all"); //если не ставть скобки то будет выполнять только первая стора после стейтмонта




        if (a<20){
            System.out.println("a is less then 20");
        }else {
            System.out.println("a is more then 20");
        }
        System.out.println("Hallo all");




        int salary = 300;
        if (salary<=200){
            System.out.println("so less");
        } else if (salary<=400) {
            System.out.println("50/50");
        } else if (salary<=600) {
            System.out.println("Gut");
        }else {
            System.out.println("grate");
        }







    }
}
