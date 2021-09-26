import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Coordenadores coordenador1 = new Coordenadores("Joao", "28682888859", 95, "SEDUC",3000, 1, 5);
        Professores professor1 = new Professores("José", "06999998442", 100, "SEDUC", 2500, "licenciatura", "Matemática", 30,10);
        Professores professor2 = new Professores("Luiz", "06699999941", 101, "SEDUC", 2500, "doutorado", "História", 35,5);
        Professores professor3 = new Professores("Maria", "06999999444", 102, "SEDUC", 2500, "licenciatura", "Literatura", 20,2);
        Professores professor4 = new Professores("Juliana", "06999999445", 103, "SEDUC", 3500, "mestrado", "História", 25,4);
        Professores professor5 = new Professores("Paula", "06999999446", 104, "SEDUC", 3500, "pós-graduado", "Geografia", 20,2);
        Professores professor6 = new Professores("Marcos", "06999999447", 105, "SEDUC", 2700, "mestrado", "educação Física", 25,7);
        Professores professor7 = new Professores("Felipe" +
                "", "06999999448", 106, "SEDUC", 2800, "doutorado", "Artes", 15,3);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(100);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(101);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(102);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(103);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(104);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(105);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());
        coordenador1.adicionaProfessor(106);
        System.out.println(coordenador1.getProfessoresSupervisionados().size());









    }


}
