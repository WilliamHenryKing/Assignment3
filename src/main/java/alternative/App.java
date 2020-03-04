package alternative;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ArrayList listOfSymthoms = new ArrayList<String>();
        Virus virus1 = new Marburg();

        virus1.setInfectivity(5);
        listOfSymthoms.add(virus1.nausea());
        listOfSymthoms.add(virus1.insomnia());
        listOfSymthoms.add(virus1.cysts());
        listOfSymthoms.add(virus1.pneumonia());
        virus1.setListofSymthoms(listOfSymthoms);
        virus1.setPopulationInfected(740000);
        virus1.setPopulationKilled(560);
        System.out.println(virus1);

        Virus virus2 = new Ebola();
        listOfSymthoms.clear();
        listOfSymthoms.add(virus2.rash());
        listOfSymthoms.add(virus2.coughing());
        listOfSymthoms.add(virus2.anaemia());
        listOfSymthoms.add(virus2.abscesses());
        listOfSymthoms.add(virus2.pulmonary_Fibrosis());
        listOfSymthoms.add(virus2.haemophilia());
        virus2.setListofSymthoms(listOfSymthoms);
        virus2.setPopulationInfected(40900);
        virus2.setPopulationKilled(1600);
        System.out.println("\n\n" + virus2);


    }
}
