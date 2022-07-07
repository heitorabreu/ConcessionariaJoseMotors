import Funcionario;
import Gerente;

public class Vendedor extends Funcionario{
    private int horasTreinoRestantes;
    private Gerente gerenteResponsavel;
    
    public Vendedor(int rg, String nome, Data nascimento, Data admissao, double salario, int horasTreinoRestantes,
            Gerente gerenteResponsavel) {
        super(rg, nome, nascimento, admissao, salario);
        this.horasTreinoRestantes = horasTreinoRestantes;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public int getHorasTreinoRestantes() {
        return horasTreinoRestantes;
    }
    public void setHorasTreinoRestantes(int horasTreinoRestantes) {
        this.horasTreinoRestantes = horasTreinoRestantes;
    }
    public Gerente getGerenteResponsavel() {
        return gerenteResponsavel;
    }
    public void setGerenteResponsavel(Gerente gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }

    
}