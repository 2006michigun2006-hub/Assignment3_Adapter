public class HeartFactory implements OrgansFactory {
    public Liver createLiver(String color, String name, boolean hasDisease, int probeg) {
        throw new UnsupportedOperationException("For what are you doing this? Heart is not the liver!!");
    }
    public Heart createHeart(String color, String name, int blood, int probeg) {
        return new Heart(color, name, blood, probeg);
    }
}
