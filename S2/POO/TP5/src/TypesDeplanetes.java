public enum TypesDeplanetes {
    MERCURY("tellurique"),
    VENUS("tellurique"),
    EARTH("tellurique"),
    MARS("tellurique"),
    JUPITER("gaz"),
    SATURN("gaz"),
    URANUS("glace"),
    NEPTUNE("glace");
    
    private final String type;
    
    TypesDeplanetes(String type) {
        this.type = type;
    }
    
    public String type() {
        return type;
    }
}
