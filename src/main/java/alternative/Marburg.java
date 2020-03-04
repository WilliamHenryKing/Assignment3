package alternative;

public class Marburg {

    private String name = "Marburg";

    public Marburg() {

    }

    public Marburg(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n";
    }
}
