package controller;

import java.util.ArrayList;

import model.Curso;

public class CursoController {

    private ArrayList <Curso> cursos;
   
    public CursoController() {
        super();
        cursos= new ArrayList<>();
    }
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    public void addCurso(int pCode, String pName, char pJourney){
        Curso c = new Curso(pCode, pName, pJourney);
        cursos.add(c);
    
    }
    public String listCursos(){
        String lista ="";
        for (Curso curso : cursos) {
            lista += curso + "\n"; //Salto de linea
        }
        return lista;
    }
    public String[] listCursosData() {
        String[] listData = new  String[cursos.size()];
        for (int i = 0; i < listData.length; i++) {
            listData[i] = cursos.get(i).toString();
            
        }
        return listData;
    }
}
