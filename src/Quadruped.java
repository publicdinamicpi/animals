public class Quadruped extends Mammal implements Animal {

    public Quadruped(String name) {
        super.name= name;
        System.out.println("\t I'm born as " + name);
    }

    @Override
    public void move() {
        System.out.println(name + " is walking...");
    }

    @Override
    public void sound() {
        System.out.println(name + " makes sound...");
    }
}
