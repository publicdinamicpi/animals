public abstract class Mammal implements Animal {
    String name;
    public Mammal() {
    }

    @Override
    public abstract void move();

    @Override
    public void sleep() {
        System.out.println(this.getClass().getSimpleName() + " goes to sleep.");
    }

    @Override
    public abstract void sound();
}
