package model;

import java.util.ArrayList;

public class Tripulante {
    /**________________________________
     * Atributos
    __________________________________*/
    //definicion de constante:
    public final static double NOTA_MAXIMA = 5.0; 
    //variables
    private String name;
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private String email;
    // Listas
    private ArrayList <Curso> cursos;

    public Tripulante (){
        super();
    }

    public Tripulante(String tName, Integer tId, double tNota1, double tNota2, double tNota3, String tEmail){
        super();
        this.name =  tName;
        this.id = tId;
        this.nota1 = tNota1;
        this.nota2 =  tNota2;
        this.nota3 =  tNota3;
        cursos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public String getEmail() {
        return email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNota1(double nota1) {
        if (nota1 <= NOTA_MAXIMA){
            this.nota1= nota1;
        }
        else{
            System.out.println("La nota debe ser menor o igual a "+ NOTA_MAXIMA);
        }
    }
    public void setNota2(double nota2) {
        if (nota2 <= NOTA_MAXIMA){
            this.nota2 = nota2;
        }
        else{
            System.out.println("La nota debe ser menor o igual a "+ NOTA_MAXIMA);
        }
    }
    public void setNota3(double nota3) {
        if (nota3 <= NOTA_MAXIMA){
            this.nota3 = nota3;
        }
        else{
            System.out.println("La nota debe ser menor o igual a "+ NOTA_MAXIMA);
        }
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public double getAverage(){
        return(nota1 + nota2 + nota3) /3;
    }
    public double getHighNote() {
        if (nota1 >= nota2 && nota1 >= nota3) {
            return nota1;
        }
        else if (nota2 >= nota3){
            return nota2;
        }
        else {
            return nota3;
        }
    }
    public double getLowNote() {
        if (nota1 <= nota2 && nota1 <= nota3) {
            return nota1;
        }
        if (nota2 <= nota3){
            return nota2;
        }
        else {
            return nota3;
        }
    }
    public boolean checkIfPass() {
        if (getAverage()>=3) {
            return true;
        }
        else {
            return false;
        }
    }
    public String adicionarCurso(Curso c){
        cursos.add(c);
        return "Curso adicionado " + c + " para el tripulante " + name ;
    }

}
