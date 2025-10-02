public class Heart {
    private final String color;
    private final String name;
    private final int blood;
    private final int probeg;

    public Heart(String color, String name, int blood, int probeg) {
        this.color = color;
        this.name = name;
        this.blood = blood;
        this.probeg = probeg;
    }

    public void votHeart() {
        System.out.println("This heart despite of everything is: " + name +
                ", coloured with " + color + ", has " + blood +
                " liters of blood and " + probeg + " hours of work overall.");
    }
}
