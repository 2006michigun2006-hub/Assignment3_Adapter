public class Main {
    public static void main(String[] args) {
        OrgansFactory liverFactory = new LiverFactory();
        Liver liver = liverFactory.createLiver("Brown", "Khovansky", true, 228228);
        liver.votLiver();

        OrgansFactory heartFactory = new HeartFactory();
        Heart heart = heartFactory.createHeart("Red", "Dimash", 5, 1337228);
        heart.votHeart();

        Engine engine = new Engine("BMW V8", "4-tonks", 30, 1337228);
        OrgansFactory engineAdapter = new EngineAdapter(engine);

        Heart engineHeart = engineAdapter.createHeart("BMW", "2-tanks", 20, 1337228);
        engineHeart.votHeart();
        ((EngineAdapter)engineAdapter).delaemEngine().votEngine();
    }
}