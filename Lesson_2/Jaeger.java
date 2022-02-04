public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName() {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark() {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin() {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }
    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }
}

