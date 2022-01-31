public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "Male";
        wolfOne.name = "Bond";
        wolfOne.weight = 12.5f;
        wolfOne.age = 5;
        wolfOne.color = "Grey";
        System.out.println("gender = " + wolfOne.gender);
        System.out.println("name = " + wolfOne.name);
        System.out.println("weight = " + wolfOne.weight);
        System.out.println("age = " + wolfOne.age);
        System.out.println("color = " + wolfOne.color);
        System.out.println(wolfOne.sit());
        System.out.println(wolfOne.howl());
        System.out.println(wolfOne.hunt());
    }
}