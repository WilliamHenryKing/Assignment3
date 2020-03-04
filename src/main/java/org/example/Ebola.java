package org.example;

public class Ebola extends Virus {

public String name = "Ebola";

    public Ebola() {

    }

    public Ebola(int infectivity, long populationInfected, long populationKilled, int severity, int lethality, String name) {
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
