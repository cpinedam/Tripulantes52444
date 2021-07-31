import model.Curso;
import model.Tripulante;
import view.Vista;

public class App {
    public static void main(String[] args) {
        Curso programacion1 = new Curso(1234, "Fundamentos de programacion", 'M', 7400, "Dev 1");
        programacion1.getName();

        try {
            programacion1.calcularPromedioCurso();    
        } catch (Exception e) {
            // handle exception
            e.getMessage();
        }

        Tripulante t = new Tripulante();
        t.setName("Tripulante 1");
        t.setNota1(4);
        t.setNota2(4.3);
        t.setNota3(5);
        Tripulante t2 = new Tripulante();
        t2.setName("Tripulante 2");
        t2.setNota1(4.3);
        t2.setNota2(3.3);
        t2.setNota3(3.5);
        Tripulante t3 = new Tripulante();
        t3.setName("Tripulante 3");
        t3.setNota1(4.8);
        t3.setNota2(2.3);
        t3.setNota3(2.5);
        Tripulante t4 = new Tripulante();
        t4.setName("Tripulante 4");
        t4.setNota1(2.1);
        t4.setNota2(4.8);
        t4.setNota3(3.6);
        Tripulante t5 = new Tripulante();
        t5.setName("Tripulante 5");
        t5.setNota1(2.4);
        t5.setNota2(3.9);
        t5.setNota3(2.9);
        programacion1.agregarTripulante(t);
        programacion1.agregarTripulante(t2);
        programacion1.agregarTripulante(t3);
        programacion1.agregarTripulante(t4);
        programacion1.agregarTripulante(t5);
        // for (Tripulante desarrollador : programacion1.getTripulantes()){
        //     System.out.println(desarrollador.getName());  
        //     System.out.println(desarrollador.getHighNote());
        // }
        //System.out.println(programacion1.calcularPromedioCurso());
        Vista v = new Vista();
        v.setVisible(true);
    }
}
