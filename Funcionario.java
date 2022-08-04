public abstract class Funcionario{
    private int rg;
    private String nome;    
    private Data nascimento;    
    private Data admissao;
    private double salario;
    
    public Funcionario(int rg, String nome, Data nascimento, Data admissao, double salario) {
        this.rg = rg;
        this.nome = nome;
        this.nascimento = nascimento;
        this.admissao = admissao;
        this.salario = salario;
    }
    
    public Funcionario(int rg, String nome, Data admissao) {
        this.rg = rg;
        this.nome = nome;
        this.admissao = admissao;
    }

    public Funcionario(){
        
    }

    public int getRg(){
        return this.rg;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg(int rg){
        this.rg = rg;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Data getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    
    public Data getAdmissao() {
        return admissao;
    }
    
    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }
    
    
}