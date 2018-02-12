public enum Directions {
    NORTH("polnoc"),
    EAST("wschod"),
    SOUTH("poludnie"),
    WEST("zachod");

    private String polishDirection;

    Directions(String polishDirection) {
        this.polishDirection = polishDirection;
    }

    public String getPolishDirection() {
        return polishDirection;
    }
}
