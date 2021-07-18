package model;
public class Curso {
    private int code;
    private String name;
    private char journey;

    private Formador formador;

    /** constructor, para reservar memoria */
    public Curso(int pCode, String pName, char pJourney, int fCode, String fName ) {
        super();
        this.code=pCode;
        this.name=pName;
        this.journey=pJourney;
        formador = new Formador(fName, fCode);
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
    
    
    
}
