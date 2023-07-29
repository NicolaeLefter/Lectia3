package automobil.service;

import automobil.Automobil;
;

public class AutomobilService {

public void afisareInformatiiAutomobil(Automobil automobil){
    System.out.println("Modelul este: " + automobil.getModelul().getModel());
    System.out.println("Producatorul automobilului este: " + automobil.getModelul().getProducator());
    System.out.println("Motorul are capacitatea: " + automobil.getMotor().getCapacitate());
    System.out.println("Tipul de combustibileste: " + automobil.getMotor().getCombustibil());
    System.out.println("Culoarea automobilului este: " + automobil.getCuloare().getCuloarea());
    System.out.println("Cutia de viteza a automobilului este: " + automobil.getCutieViteza().getModelul() +"," + "cu" + " "+ automobil.getCutieViteza().getNumberSteps() + " trepte");
    System.out.println("Tara de origine a automobilului este: " + automobil.getTaraOrigine().getOrigine());
}
public void reparareAutomobil(Automobil automobil){
    System.out.println("Automobilul de model: " + automobil.getModelul().getModel() + " " + "este in service");
}
}
