import Funcionario;

public class Gerente extends Funcionario{
    private int anosExp;

    public Gerente(int rg, String nome, Data nascimento, Data admissao, double salario, int anosExp) {
        super(rg, nome, nascimento, admissao, salario);
        this.anosExp = anosExp;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    
}