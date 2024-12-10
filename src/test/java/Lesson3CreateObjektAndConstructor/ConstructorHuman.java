package Lesson3CreateObjektAndConstructor;

public class ConstructorHuman {
    String name;
    Car car;
    BankAccount bankAccount;

    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Car: "+car.color+", "+car.engine);
        System.out.println("Bank Account: ID: "+bankAccount.id+", Balance: "+bankAccount.balance);
    }

}



class HumanTest{
    public static void main(String[] args) {
        ConstructorHuman constructorHuman = new ConstructorHuman();
        constructorHuman.name="John Doe";
        constructorHuman.car=new Car("Red","V8");
        constructorHuman.bankAccount=new BankAccount(123,1000.0);
        constructorHuman.info();

    }
}





class  Car{
    Car(String c,String d){
        color=c;
        engine=d;
    }

    String color;
    String engine;
}

class  BankAccount{
    BankAccount(int i, double b){
        id=i;
        balance=b;
    }
    int id;
    double balance;
}
