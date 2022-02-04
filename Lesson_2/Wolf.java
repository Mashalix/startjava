public class Wolf {

    private String gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void move() {
        System.out.println("Идет");
    }

    public String sit() {
        return "Сидит";
    }

    public String howl() {
        return "Воет";
    }

    public boolean hunt() {
        System.out.println("Охотится");
        return true;
    }
}