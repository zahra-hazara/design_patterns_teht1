class WaterTile implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action() {
        // Implement specific water tile action
    }
}
