package test;

public class Runnable {

    public static void main(String[] args){
        Dog scooby = new Dog("Scooby Doo", "woof!");

        System.out.println(scooby.speak());

        Dog someBitch = new Dog("Bitchy", "wtf!");

        System.out.println(someBitch.speak());
    }
}
