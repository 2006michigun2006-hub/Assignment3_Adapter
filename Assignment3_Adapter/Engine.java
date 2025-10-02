public class Engine {
    final String model;
    final String type;
    final int oil;
    final int rabota;

    public Engine(String model, String type, int oil, int rabota) {
        this.model = model;
        this.type = type;
        this.oil = oil;
        this.rabota = rabota;
    }
    public void votEngine() {
        System.out.println("Model of this Engine is : " + model + ", and its type looks like: " + type + ". Oil's level is " + oil + " liters and last but not least it was in action for " + rabota + " hours of work WOW!");
    }
}