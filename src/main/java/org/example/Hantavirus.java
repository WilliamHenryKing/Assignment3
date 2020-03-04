package org.example;

public class Hantavirus extends Virus {

    private String name = "Hantavirus";

    public Hantavirus() {

    }

    public Hantavirus(int infectivity, long populationInfected, long populationKilled, int severity, int lethality, String name) {
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
