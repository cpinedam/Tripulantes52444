package view;

import model.Curso;
import model.Formador;
import model.Tripulante;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CursoController;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Vista extends JFrame{

   private PanelOpciones panelOpc;
   private PanelCurso panelCurso;
   private PanelListaCursos panelListaCursos;
   private PanelDetalleCurso panelDetalleCurso;
   private CursoController cursoController;

   public Vista() {
      super();
      setSize(700,400);
      setTitle("Tripulantes");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
   
      cursoController = new CursoController();
   
      panelOpc = new PanelOpciones(this);
      panelCurso = new PanelCurso(this);
      panelListaCursos = new PanelListaCursos(this);
      panelDetalleCurso = new PanelDetalleCurso(this);

      JPanel panelAuxiliar = new JPanel();
      panelAuxiliar.setLayout(new GridLayout(1,4));
      panelAuxiliar.add(panelCurso);
      panelAuxiliar.add(panelListaCursos);
      panelAuxiliar.add(panelDetalleCurso);
      add(panelAuxiliar, BorderLayout.CENTER);
      add(panelOpc, BorderLayout.SOUTH);
      
   }
   public void addCurso(int pCode, String pName, char pJourney) {
      cursoController.addCurso(pCode, pName, pJourney); 
      updateListaCursos();  
   }
   public String listCursos() {
      return cursoController.listCursos();
   }

   public void updateInformationCurso() {
      Curso c = cursoController.getCursos().get(panelListaCursos.getActiveCurso());
      panelDetalleCurso.updateInformationCurso(
         c.getName(), c.getCode(), c.getJourney(), c.getTripulantes().size());
   }

   public void updateListaCursos() {
   panelListaCursos.updateListaCursos(cursoController.listCursosData());
   }
}
