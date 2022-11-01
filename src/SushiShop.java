public abstract class SushiShop {

    public Sushi orderSushi(SushiType type) {
        Sushi sushi = createSushi(type);

        sushi.infoAboutSushi();
        sushi.makeSushi();
        sushi.riceDistribution();
        sushi.cuttingIntoPieces();

        System.out.println("\nHere is your sushi! Come again!");
        return sushi;
    }

    protected abstract Sushi createSushi(SushiType type);
}