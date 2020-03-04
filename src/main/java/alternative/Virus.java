package alternative;

import java.util.ArrayList;

public class Virus implements Symthoms {

    private int infectivity = 0;
    private long populationInfected = 0;
    private long populationKilled = 0;
    private int severity = 0;
    private int lethality = 0;
    private ArrayList listofSymthoms = new ArrayList<String>();
    private Marburg marburg = new Marburg();



    public Virus() {
    }

    public Virus(int infectivity, long populationInfected, long populationKilled, int severity, int lethality) {
        this.infectivity = infectivity;
        this.populationInfected = populationInfected;
        this.populationKilled = populationKilled;
        this.severity = severity;
        this.lethality = lethality;
    }

    public int getInfectivity() {

        return infectivity;
    }

    public void setInfectivity(int infectivity) {

        this.infectivity = infectivity;
    }

    public long getPopulationInfected()
    {
        return populationInfected;
    }

    public void setPopulationInfected(long populationInfected)
    {
        this.populationInfected = populationInfected;
    }

    public long getPopulationKilled() {

        return populationKilled;
    }

    public void setPopulationKilled(long populationKilled) {

        this.populationKilled = populationKilled;
    }

    public int getSeverity() {

        return severity;
    }

    public void setSeverity(int severity) {

        this.severity = severity;
    }

    public int getLethality() {

        return lethality;
    }

    public void setLethality(int lethality) {

        this.lethality = lethality;
    }

    public ArrayList getListofSymthoms() {
        return listofSymthoms;
    }

    public void setListofSymthoms(ArrayList listofSymthoms) {
        this.listofSymthoms = listofSymthoms;
    }

    @Override
    public String toString() {

        return "Virus Details ->" +
                "\nInfectivity = " + infectivity +
                "\nPopulation Infected = " + populationInfected +
                "\nPopulation Killed = " + populationKilled +
                "\nSeverity = " + severity +
                "\nLethality = " + lethality +
                "\nList of Symthoms = " + listofSymthoms;
    }

    @Override
    public String nausea() {
        this.severity++;
        this.infectivity++;
        return "Nausea";
    }

    @Override
    public String coughing() {
        this.infectivity += 3;
        this.severity += 1;
        return "Coughing";
    }

    @Override
    public String rash() {
        this.infectivity += 2;
        this.severity += 1;
        return "Rash";
    }

    @Override
    public String insomnia() {
        this.severity += 3;
        return "Insomnia";
    }

    @Override
    public String cysts() {
        this.infectivity += 2;
        this.severity += 2;
        return "Cysts";
    }

    @Override
    public String anaemia() {
        this.infectivity += 1;
        this.severity += 1;
        return "Anaemia";
    }

    @Override
    public String vomiting() {
        this.infectivity += 3;
        this.severity += 1;
        return "Vomiting";
    }

    @Override
    public String pneumonia() {
        this.infectivity += 3;
        this.severity += 2;
        return "Pneumonia";
    }

    @Override
    public String sneezing() {
        this.infectivity += 2;
        this.severity += 1;
        return "Sneezing";
    }

    @Override
    public String sweating() {
        this.infectivity += 3;
        this.severity += 1;
        return "Sweating";
    }

    @Override
    public String paranoia() {
        this.severity += 4;
        return "Paranoia";
    }

    @Override
    public String hyper_sensitivity() {
        this.infectivity += 1;
        this.severity += 2;
        return "Hyper Sensitivity";
    }

    @Override
    public String abscesses() {
        this.infectivity += 3;
        this.severity += 1;
        return "Abscesses";
    }

    @Override
    public String haemophilia() {
        this.infectivity += 4;
        this.severity += 4;
        return "Haemophilia";
    }

    @Override
    public String pulmonary_Oedema() {
        this.infectivity += 5;
        this.severity += 4;
        this.lethality += 2;
        return "Pulmonary Oedema";
    }

    @Override
    public String hemorrhagic_Shock() {
        this.severity += 15;
        this.lethality += 15;
        return "Hemorrhagic Shock";
    }

    @Override
    public String pulmonary_Fibrosis() {
        this.infectivity += 3;
        this.severity += 3;
        this.lethality += 2;
        return "Pulmonary Fibrosis";
    }
}
