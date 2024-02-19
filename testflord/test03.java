package testFlord;
import java.lang.*;

public class test03 {
    public static void main(String[] args) {
        for(Color c : Color.values()){
            System.out.println(Color.valueOf(c.toString()));
        }
        System.err.println("aaa");
        Color b =  Color.BLUE;

        switch(b){
            case RED:
            System.out.println("RED");
            break;
            case BLUE:
            System.out.println("bbbbb");
            break;
            case GREEN:
            System.out.println();
            break;
        }


    }
}


interface Animal {
    public void eat();
    public void travel();
}

abstract class MammalInt implements Animal{
    // public void eat(){
    //     System.out.println("sss");
    // }
    // public void travel(){
    //     System.out.println("ttt");
    // }
    // public int noOfLegs(){
    //     System.out.println("nonono");
    //     return 0;
    // }
}

enum Color{
    RED, GREEN, BLUE;

    private Color(){
        System.out.println("create a Color?");
    }
}