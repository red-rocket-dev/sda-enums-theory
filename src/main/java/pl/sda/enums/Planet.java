package pl.sda.enums;

public enum Planet implements Printable {
    EARTH("Earth", "Ziemia"),
    SATURN("Saturn", "Saturn"),
    VENUS("Venus", "Wenus"),
    JUPITER("Jupiter", "Jowisz"),
    MERCURY("Mercury", "Merkury");

    private String readableName;
    private String polishReadableName;//TODO: jak poprawniej

    //TODO: jakie sa konstruktory


    Planet(String readableName, String polishReadableName) {
        this.readableName = readableName;
        this.polishReadableName = polishReadableName;
    }

    public String getReadableName() {
        return readableName;
    }

    public String getPolishReadableName() {
        return polishReadableName;
    }

    @Override
    public String toString() {
        return this.polishReadableName;
    }

    @Override
    public void print() {
        System.out.println("Printing from enum " + toString());
    }
}
