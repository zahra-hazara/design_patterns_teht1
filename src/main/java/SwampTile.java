class SwampTile implements Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public void action() {
        // Implement specific swamp tile action
    }
}