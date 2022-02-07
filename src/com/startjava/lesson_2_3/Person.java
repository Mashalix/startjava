public class Person {

    String gender = "Male";
    String name = "Uno";
    float height = 155.5f;
    float weight = 55.5f;
    int age = 35;

    void run() {
        System.out.println("Человек бежит");
    }

    void move() {
        System.out.println("Человек идет");
    }

    String sit() {
        return "Человек сидит";
    }

    String talk() {
        return "Человек говорит";
    }

    boolean learnJava() {
        System.out.println("Человек учит Java");
        return true;
    }
}
