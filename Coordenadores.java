import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{

    private int maxProfSupervisionados;
    private List<Integer> professoresSupervisionados = new ArrayList<>();



    public Coordenadores(String nome, String cpf, int numeroDeRegistro, String orgaoDeLotacao, double salario, double professoresSupervisionados, int maxProfSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.maxProfSupervisionados = maxProfSupervisionados;

    }

    public void adicionaProfessor(int numeroDeRegistro){
        boolean loop = true;
        while (loop){
            if ((professoresSupervisionados.size() >= getMaxProfSupervisionados())) {
                System.out.println("Tamanho máximo alcançado");
                professoresSupervisionados = professoresSupervisionados;
            }else{
                professoresSupervisionados.add(numeroDeRegistro);
                loop = false;
            }
            break;
        }

       }


    public void aumentaSalario() {
        super.aumentaSalario(0.05) ;
    }

    public int getMaxProfSupervisionados() {
        return maxProfSupervisionados;
    }

    public List getProfessoresSupervisionados() {
        if (professoresSupervisionados.isEmpty()){
            System.out.println("Nenhum professor sendo supervisionado por esse coordenador");
        }else{
            System.out.println("Quantidade de professores supervisionados: ");
        }
        return professoresSupervisionados;
    }
}
