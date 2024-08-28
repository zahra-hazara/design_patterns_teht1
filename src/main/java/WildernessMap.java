import java.util.Random;

class WildernessMap extends Map {
    public WildernessMap(int rows, int cols) {
        super(rows, cols);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0:
                return new SwampTile();
            case 1:
                return new WaterTile();
            case 2:
                return new ForestTile();
            default:
                throw new IllegalArgumentException("Invalid tile type");
        }
    }
}
