import java.util.Random;
class CityMap extends Map {
    private Random random = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            case 2:
                return new BuildingTile();
            default:
                throw new IllegalArgumentException("Invalid tile type");
        }
    }
}
