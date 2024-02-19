package testFlord;
public class test02 {
    public static void main(String[] args) {
        Animal a = new Animal("pig", 0);
        Animal b = new Penguin("Penguin1", 1);
        Penguin c = (Penguin)b;

        c.bark();
    }
}




class Animal {
    private String name;
    private int id;
    public Animal(String myName, int myId){
        name = myName;
        id = myId;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void introduction(){
        System.out.println("hello, I am " + id +"."+name);
    }
}



class Penguin extends Animal{
    private String barking ;
    public Penguin(String myName, int myId){
        super(myName, myId);
        this.barking = "bbbbbb";
    }

    public void bark(){
        System.out.println("Penguin Bark " + this.barking);
    }
}

interface A {
    public void eat();
    public void sleep();
}

interface B {
    public void show();
}

class C implements A, B{
    public void eat(){
        System.out.println();
    }
    public void sleep(){
        System.out.println();
    }
    public void show(){
        System.out.println();
    }
}



abstract class Employee{
    private String name;
    
    public Employee(String name){
        System.out.println("abaaba");
        this.name = name;
    }

    public double computePay(){
        System.out.println("computePay");
        return 1;
    }

}