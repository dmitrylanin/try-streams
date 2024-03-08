public enum Position {
    JUNIOR ("JUNIOR"),
    MIDDLE ("MIDDLE"),
    SENIOR ("SENIOR");

    private final String position;
    Position(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

}
