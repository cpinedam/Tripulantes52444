package model;

import java.util.ArrayList;

public class Curso {

    public final static Integer MAXIMO_TRIPULANTES=5;  

    private int code;
    private String name;
    private char journey;
    private Formador formador;
    private ArrayList <Tripulante> tripulantes;

    /** constructor, para reservar memoria */
    public Curso(int pCode, String pName, char pJourney, int fCode, String fName ) {
        super();
        this.code=pCode;
        this.name=pName;
        this.journey=pJourney;
        formador = new Formador(fName, fCode);
        tripulantes = new ArrayList<>();
    }

    public Curso(int pCode, String pName, char pJourney ) {
        super();
        this.code=pCode;
        this.name=pName;
        this.journey=pJourney;
        formador = null;
        tripulantes = new ArrayList<>();
    }
    public ArrayList<Tripulante> getTripulantes() {
        return tripulantes;
    }
    
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public char getJourney() {
        return journey;
    }
    public Formador getFormador() {
        return formador;
    }
    public void setName(String name) {
        this.name=name;
    }
    
    public String agregarTripulante(Tripulante t){
        if(tripulantes.size() == MAXIMO_TRIPULANTES){
            return "No se puede agregar más de " + MAXIMO_TRIPULANTES+ " tripulantes";
        }
        tripulantes.add(t);
        return "Tripulante agregado al curso " + name;
    }
    
    public double calcularPromedioCurso() throws Exception{
        if (tripulantes.size() == 0){
            //lanza una excepcion
            throw new Exception("No hay tripulantes registrados en el curso" );
        }
        double total = 0.0;
        for (Tripulante tripulante : tripulantes){
            total += tripulante.getAverage();
        }
        return total/tripulantes.size();
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: "+ name + ", Codigo: "+ code;
    }
    
}

