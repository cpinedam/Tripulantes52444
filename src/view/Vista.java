package view;

import model.Curso;
import model.Formador;
import model.Tripulante;

import javax.swing.JFrame;

import controller.CursoController;

import java.awt.BorderLayout;

public class Vista extends JFrame{

   private PanelOpciones panelOpc;

   private CursoController cursoController;

   public Vista() {
      super();
      setSize(600,400);
      setTitle("Tripulantes");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
   
      cursoController = new CursoController();
   
      panelOpc = new PanelOpciones(this);

      add(panelOpc, BorderLayout.SOUTH);
   }

   public void addCurso(int pCode, String pName, char pJourney) {
      cursoController.addCurso(pCode, pName, pJourney);   
   }
   public String listCursos() {
      return cursoController.listCursos();
   }
}
