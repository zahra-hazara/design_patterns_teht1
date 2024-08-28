class ForestTile implements Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getType() {
        return "Forest";
    }

    @Override
    public void action() {
        // Implement specific forest tile action
    }
}