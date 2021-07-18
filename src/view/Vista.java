package view;

import jdk.internal.org.jline.terminal.Curso;
import model.Curso;
import model.Formador;

public class Vista {
   public static void main(String[] args) {
        Curso cursoFrances = new Curso(52441, "Frances_101", 'N',07400,"Pedro Perez");
        Curso cursoItaliano = new Curso(52443, "Italiano_103", 'T',05000,"Putin");
        System.out.println(cursoFrances.getCode());
        System.out.println(cursoFrances.getName());
        System.out.println(cursoFrances.getJourney());
        System.out.println(cursoItaliano.getCode());
        System.out.println(cursoItaliano.getName());
        System.out.println(cursoItaliano.getJourney());
        cursoFrances.setName("NewFrances");
        System.out.println(cursoFrances.getName());
        System.out.println(cursoItaliano.getName());
        System.out.println(cursoFrances.getFormador().getName());
        System.out.println(cursoFrances.getFormador().getCode());
        Formador teacher= new Formador("Carlitos", 98664);
        System.out.println(teacher.getName());
        
   } 
}
