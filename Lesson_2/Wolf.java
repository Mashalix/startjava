public class Wolf {

    String gender;
    String name;
    float weight;
    int age;
    String color;

    void run() {
        System.out.println("Бежит");
    }

    void move() {
        System.out.println("Идет");
    }

    String sit() {
        return "Сидит";
    }

    String howl() {
        return "Воет";
    }

    boolean hunt() {
        System.out.println("Охотится");
        return true;
    }
}