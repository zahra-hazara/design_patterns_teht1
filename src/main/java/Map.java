abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[height][width];
        generateMap();
    }

    protected void generateMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    // Factory Method to be implemented by subclasses
    protected abstract Tile createTile();

    // Method to display the map as characters
    public void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}