package automobil;


import automobil.componnte.CutieViteza;
import automobil.componnte.TaraOrigine;
import automobil.componnte.Modelul;
import automobil.componnte.Motor;
import automobil.componnte.Culoare;

import java.sql.SQLOutput;

// Declaram variabilele
public class Automobil {
    private Modelul modelul;
    private Motor motor;
    private Culoare culoare;
    private CutieViteza cutieViteza;
    private TaraOrigine taraOrigine;
    private String nume;

//Creem constructorul

    public Automobil(Modelul modelul, Motor motor, Culoare culoare, CutieViteza cutieViteza, TaraOrigine taraOrigine) {
        this.modelul = modelul;
        this.motor = motor;
        this.culoare = culoare;
        this.cutieViteza = cutieViteza;
        this.taraOrigine = taraOrigine;
    }
    //Getters pentru fiecare componenta

    public Modelul getModelul() {
        return modelul;
    }

    public Motor getMotor() {
        return motor;
    }

    public Culoare getCuloare() {
        return culoare;
    }

    public CutieViteza getCutieViteza() {
        return cutieViteza;
    }

    public TaraOrigine getTaraOrigine() {
        return taraOrigine;
    }
    public String getNume(){
        return  nume;
    }

    // Setters pentru fiecare componenta

    public void setModelul(Modelul modelul) {
        this.modelul = modelul;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }

    public void setCutieViteza(CutieViteza cutieViteza) {
        this.cutieViteza = cutieViteza;
    }

    public void setTaraOrigine(TaraOrigine taraOrigine) {
        this.taraOrigine = taraOrigine;
    }
    public void setNume(String nume){
        this.nume = nume;
    }

    //Creem setters pentru componenta Modelul
    public void setModelulModel(String model) {
        this.modelul.setModel(model);
    }

    public void setModelulProducator(String producator) {
        this.modelul.setProducator(producator);
    }

    //Creem setters pentru componenta Motor
    public void setMotorCapacitate(double capacitate) {
        this.motor.setCapacitate(capacitate);
    }

    public void setMotorCombustibil(String combustibil) {
        this.motor.setCombustibil(combustibil);
    }

    //Creem setters pentru componenta Culoare
    public void setCuloareCuloarea(String culoarea) {
        this.culoare.setCuloarea(culoarea);
    }

    // Creem setters pentru componenta CutieVoteza
    public void setCutieVitezaModelul(String modelul) {
        this.cutieViteza.setModelul(modelul);
    }

    public void setCutieVitezaNumberSteps(int numberSteps) {
        this.cutieViteza.setNumberSteps(numberSteps);
    }

    // Creem setters pentru componenta TaraOrigine
    public void setTaraOrigineOrigine(String origine) {
        this.taraOrigine.setOrigine(origine);
    }



}

