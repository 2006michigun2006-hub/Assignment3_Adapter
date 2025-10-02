public class EngineAdapter implements OrgansFactory {
    private final Engine engine;
    public EngineAdapter(Engine engine) {
        this.engine = engine;
    }
    public Liver createLiver(String color, String name, boolean hasDisease, int probeg) {
        throw new UnsupportedOperationException("Look, logically it's simpler to make the Engine same as Heart. Go do Engine normally already!");
    }
    public Heart createHeart(String color, String name, int blood, int probeg) {
        return new Heart(engine.model, engine.type, engine.oil, engine.rabota);
    }
    public Engine delaemEngine() {
        return engine;
    }
}
