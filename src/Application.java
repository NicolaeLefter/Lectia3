import automobil.Automobil;
import automobil.componnte.Motor;
import automobil.componnte.Modelul;
import automobil.componnte.Culoare;
import automobil.componnte.CutieViteza;
import automobil.componnte.TaraOrigine;
import automobil.service.AutomobilService;

public class Application {

    public static void main(String[] args) {

// Creem componente si atribuim valori
        Modelul modelul1 = new Modelul();
        modelul1.setModel("BMW X5");
        modelul1.setProducator("BMW");
        Motor motor1 = new Motor();
        motor1.setCapacitate(2.2);
        motor1.setCombustibil("disel");
        Culoare culoare1 = new Culoare();
        culoare1.setCuloarea("alb");
        CutieViteza cutieViteza1 = new CutieViteza();
        cutieViteza1.setModelul("DSG7-automat");
        cutieViteza1.setNumberSteps(7);
        TaraOrigine taraOrigine1 = new TaraOrigine();
        taraOrigine1.setOrigine("Germania");

        Modelul modelul2 = new Modelul();
        modelul2.setModel("VW JETTA");
        modelul2.setProducator("VW");
        Motor motor2 = new Motor();
        motor2.setCapacitate(1.8);
        motor2.setCombustibil("benzina");
        Culoare culoare2 = new Culoare();
        culoare2.setCuloarea("neagra");
        CutieViteza cutieViteza2 = new CutieViteza();
        cutieViteza2.setModelul("mecanica");
        cutieViteza2.setNumberSteps(6);
        TaraOrigine taraOrigine2 = new TaraOrigine();
        taraOrigine2.setOrigine("USA");


        //Creem automobilul si setam componetele

        Automobil automobil1 = new Automobil(modelul1, motor1, culoare1, cutieViteza1,taraOrigine1 );
        automobil1.setNume("Primul automobil");
        Automobil automobil2 = new Automobil(modelul2,motor2, culoare2, cutieViteza2,taraOrigine2);
        automobil2.setNume("Al doilea automobil");


        AutomobilService automobilService = new AutomobilService();
        automobil1.setCuloareCuloarea("albastru");

        automobilService.afisareInformatiiAutomobil(automobil1);
        automobilService.reparareAutomobil(automobil1);


        automobil2.setCutieVitezaNumberSteps(10);
        automobilService.afisareInformatiiAutomobil(automobil2);
        automobilService.reparareAutomobil(automobil2);


    }
}
