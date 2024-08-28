class RoadTile implements Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getType() {
        return "Road";
    }

    @Override
    public void action() {
        // Implement specific road tile action
    }
}