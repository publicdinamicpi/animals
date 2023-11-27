public class Main {
    public static void main(String[] args) {

        System.out.println("Creting the world...");
        Quadruped elephant = new Quadruped("Manolo");
        System.out.println("I'm an " + elephant.getClass().getSimpleName());
        elephant.move();




    }
}