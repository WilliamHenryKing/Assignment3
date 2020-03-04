package org.example;

public class Marburg extends Virus {

    private String name = "Marburg";

    public Marburg() {

    }

    public Marburg(String name) {
        this.name = name;
    }

    public Marburg(int infectivity, long populationInfected, long populationKilled, int severity, int lethality, String name) {
        super(infectivity, populationInfected, populationKilled, severity, lethality);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "\n" + super.toString();
    }
}
