class BuildingTile implements Tile {
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getType() {
        return "Building";
    }

    @Override
    public void action() {
        // Implement specific building tile action
    }
}
