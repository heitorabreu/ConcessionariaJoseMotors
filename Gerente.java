import java.util.*;

public class Gerente extends Funcionario {
    private int anosExp;

    public Gerente(int rg, String nome, Data nascimento, Data admissao, double salario, int anosExp) {
        super(rg, nome, nascimento, admissao, salario);
        this.anosExp = anosExp;
    }

    public Gerente() {
        super();
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public void /* Gerente */ cadastraGerente() {
        // Função para criar um objeto da classe Gerente com todos atributos preenchidos
        System.out.println("\n\tCadastro de gerente.");
        Scanner input = new Scanner(System.in);
        int rg, anos;
        String nome;
        Data nasc = new Data(), adss = new Data();
        double salario;
        System.out.println("\nDigite o RG: ");
        rg = input.nextInt();
        input.nextLine();
        this.setRg(rg);

        System.out.println("\nDigite o nome: ");
        nome = input.nextLine();
        this.setNome(nome);

        System.out.println("\nDigite a data de admissão: ");
        System.out.println("\nDigite o dia: ");
        adss.setDia();
        System.out.println("\nDigite o mês: ");
        adss.setMes();
        System.out.println("\nDigite o ano: ");
        adss.setAno();
        this.setAdmissao(adss);

        System.out.println("Digite a data de nascimento: ");
        System.out.println("\nDigite o dia: ");
        nasc.setDia();
        System.out.println("\nDigite o mês: ");
        nasc.setMes();
        System.out.println("\nDigite o ano: ");
        nasc.setAno();
        this.setNascimento(nasc);

        System.out.println("\nDigite o salário: ");
        salario = input.nextDouble();
        this.setSalario(salario);

        System.out.println("\nDigite o tempo de experiência em anos: ");
        anos = input.nextInt();
        input.nextLine();
        this.setAnosExp(anos);

        //
        // Gerente gerente = new Gerente(rg, nome, nasc, adss, salario, anos);

        // return gerente;
    }

    public void /* Gerente */ alteraGerente() {
        // Método que recebe um objeto da classe Gerente e retorna um
        // objeto da classe Gerente modificado
        // --------------------------------------------------------------
        // Para não fugir da realidade, esse método modificará apenas o
        // salário e tempo de experiência

        System.out.println("\n\tAlteração de cadastro de gerente");

        Scanner input = new Scanner(System.in);
        double salario;
        int anos;

        System.out.println("\nSalário atual: " + this.getSalario() + "\tAnos de experiência: " + this.getAnosExp());

        System.out.println("\nDigite o novo salário: ");
        salario = input.nextDouble();
        input.nextLine();
        this.setSalario(salario);

        System.out.println("\nDigite o novo tempo de expêriencia: ");
        anos = input.nextInt();
        input.nextLine();
        this.setAnosExp(anos);

        // return gerente;
    }
}