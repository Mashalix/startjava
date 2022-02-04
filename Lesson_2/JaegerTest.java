public class JaegerTest {

    public static void main(String[] args) {
        Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", "Pan Pacific Defense Corps", 81.8f, 2.004f);
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.2f, 1.98f);

        System.out.println(gipsyAvenger);
        System.out.println(gipsyDanger);
       
       gipsyDanger.drift();
       gipsyAvenger.move();
    }
}
