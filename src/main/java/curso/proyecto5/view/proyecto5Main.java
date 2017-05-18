package curso.proyecto5.view;

import curso.proyecto.business.Agenda;

public class proyecto5Main {

    public static void main(String[] args){
         Agenda agenda = new Agenda();
         TerminalManager terminal = new TerminalManager(agenda);
         terminal.iniciar();
       
    }
}
