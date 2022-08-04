import java.util.Scanner;

public class Vendedor extends Funcionario {
    private int horasTreinoRestantes;
    private Gerente gerenteResponsavel;

    public Vendedor(int rg, String nome, Data nascimento, Data admissao, double salario, int horasTreinoRestantes,
            Gerente gerenteResponsavel) {
        super(rg, nome, nascimento, admissao, salario);
        this.horasTreinoRestantes = horasTreinoRestantes;
        this.gerenteResponsavel = gerenteResponsavel;
    }

    public Vendedor(int rg, String nome, Data nascimento, Data admissao, double salario, int horasTreinoRestantes) {
        super(rg, nome, nascimento, admissao, salario);
        this.horasTreinoRestantes = horasTreinoRestantes;
    }

    public Vendedor() {
        super();
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

    public void cadastraVendedor() {
        // Função para criar um objeto da classe Vendedor com todos os atributos
        // preenchidos
        System.out.println("\n\tCadastro de vendedor.");
        Scanner input = new Scanner(System.in);
        int rg, horas;
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
        input.nextLine();
        this.setSalario(salario);

        System.out.println("\nDigite o tempo de treino restante em horas: ");
        horas = input.nextInt();
        input.nextLine();
        this.setHorasTreinoRestantes(horas);

    }

    public void alteraVendedor() {
        // Método que recebe um objeto da classe Vendedor como parâmetro
        // e retorna um objeto Vendedor modificado
        // --------------------------------------------------------------
        // Para não fugir da realidade, esse método modificará apenas o
        // salário e tempo de treino restante
        System.out.println("\n\tAlteração de cadastro de vendedor");

        Scanner input = new Scanner(System.in);
        double salario;
        int horas;

        System.out.println("\nSalário atual: " + this.getSalario() + "\tHoras de treino restantes: "
                + this.getHorasTreinoRestantes());

        System.out.println("\nDigite o novo salário: ");
        salario = input.nextDouble();
        input.nextLine();
        this.setSalario(salario);

        System.out.println("\nDigite quantas horas de treino restam: ");
        horas = input.nextInt();
        input.nextLine();
        this.setHorasTreinoRestantes(horas);

    }

}