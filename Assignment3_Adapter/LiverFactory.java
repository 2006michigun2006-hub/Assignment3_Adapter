public class LiverFactory implements OrgansFactory {
    public Liver createLiver(String color, String name, boolean hasDisease, int probeg) {
        return new Liver(color, name, hasDisease, probeg);
    }
    public Heart createHeart(String color, String name, int blood, int probeg) {
        throw new UnsupportedOperationException("Of my God, Heart is not the Liver bro!!");
    }
}
