public class Adapter {
    //Product
    public static class Heart {
        private int p;
        private int b;
        //Getters and talk()
        public Heart(int p, int b) {
            this.p = p;
            this.b = b;
        }
        public int getP() {
            return p;
        }
        public int getB() {
            return b;
        }
    }
    //Abstract Factory
    public static abstract interface OrgansFactory {
        Heart createHeart(int p, int b);
    }
    //Concrete Factory
    public static class HeartFactory implements OrgansFactory {
        @Override
        public Heart createHeart(int p, int b) {
            return new Heart(p, b);
        }
    }
    //Abstract Adapter
    public static interface OrgansAdapter {
        void operate();
    }
    //Concrete Adapter
    public static class HeartToEngine implements OrgansAdapter {
        Heart heart;
        public HeartToEngine(Heart heart) {
            this.heart = heart;
        }
        @Override
        public void operate() {
            System.out.println("It goes in " + heart.getP() * 100 + " in " + heart.getB() / 10 + " seconds.");
        }
    }
    //Client
    public static void main(String[] poop) {
        OrgansFactory heartFactory = new HeartFactory();
        Heart heart = heartFactory.createHeart(10000, 50);
        OrgansAdapter engine = new HeartToEngine(heart);
        engine.operate();
    }
}
