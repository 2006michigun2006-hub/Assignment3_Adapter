public interface OrgansFactory {
    Liver createLiver(String color, String name, boolean hasDisease, int probeg);
    Heart createHeart(String color, String name, int blood, int probeg);
}