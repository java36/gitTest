package test;

public class Dog {

    private String name;

    private String sound;

    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String speak(){
        return String.format("Hello, My name is %s and I %s", name, sound);
    }
}
