package view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


public class PanelOpciones extends JPanel implements ActionListener{

    public final static String OPCION_1 = "Ver mejor promedio";
    public final static String BTN_ADD_CURSO = "Agregar Curso";
    //se crea la relacion
    private JButton opcion1; 
    private JButton btnAddCurso;

    private Vista vistaPrincipal;

    public PanelOpciones(Vista v) {
        super();

        setLayout(new GridLayout(1,3));

        vistaPrincipal= v;

        //inicializar boton
        opcion1 = new JButton(OPCION_1);
        btnAddCurso = new JButton(BTN_ADD_CURSO);
        //modificar las propiedas
        opcion1.setActionCommand(OPCION_1);
        btnAddCurso.setActionCommand(BTN_ADD_CURSO);
        
        opcion1.addActionListener(this);
        btnAddCurso.addActionListener(this);

        //Agregar
        add(opcion1);
        add(btnAddCurso);

    }

    public void addCurso() {
        //JOptionPane.showMessageDialog(vistaPrincipal, "un mensaje");
        String name= JOptionPane.showInputDialog(vistaPrincipal, "Digita el nombre del curso");
        String code= JOptionPane.showInputDialog(vistaPrincipal, "Digita el codigo del curso");
        //String jornada= JOptionPane.showInputDialog(vistaPrincipal, "Digita la jornada: Mañana, Tarde, Noche");
        String[] options= new String[3];
        options[0]= "Mañana";
        options[1]= "Tarde";
        options[2]= "Noche";
        char[] optionShort= new char[3];
        optionShort[0]= 'M';
        optionShort[1]= 'T';
        optionShort[2]= 'N';
        int option=JOptionPane.showOptionDialog(vistaPrincipal, "Escoja una opcion", "Jornada del curso", 0, JOptionPane.PLAIN_MESSAGE, null, options, null);
        if(name!= null && !name.equals("") && option!= -1 && code != ""){
            vistaPrincipal.addCurso(Integer.parseInt(code), name , optionShort[option]);
        }
        else {
            JOptionPane.showMessageDialog(vistaPrincipal, "Error en los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void listCursos() {
        JOptionPane.showMessageDialog(vistaPrincipal, vistaPrincipal.listCursos(), "Lista de cursos", JOptionPane.PLAIN_MESSAGE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals(OPCION_1)){
            listCursos();
        } else if(e.getActionCommand().equals(BTN_ADD_CURSO)){
            addCurso();
            //System.out.println("Curso Agregado");
        }
    }
}
