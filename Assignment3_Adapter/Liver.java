public class Liver {
    private final String color;
    private final String name;
    private final boolean hasDisease;
    private final int probeg;

    public Liver(String color, String name, boolean hasDisease, int probeg) {
        this.color = color;
        this.name = name;
        this.hasDisease = hasDisease;
        this.probeg = probeg;
    }
    public void votLiver() {
        System.out.println("This liver is " + color + ", its name is " + name + ". Unfortunately or not, the statement that it has disease is " + hasDisease + " and it already worked hard for " + probeg + " hours");
    }
}