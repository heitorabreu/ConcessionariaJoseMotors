import java.util.Scanner;

public class Cliente {
    private int cpf;
    private String nome;
    private Data nascimento;
    private Endereco endereco;
    private double renda;
    private int dependentes;

    public Cliente(int cpf, String nome, Data nascimento, Endereco endereco, double renda, int dependentes) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
        this.renda = renda;
        this.dependentes = dependentes;
    }

    public Cliente() {
    }

    public void cadastraCliente() {
        Scanner input = new Scanner(System.in);
        int cpf, dependentes, numero, cep;
        String nome, rua, cidade;
        Data nascimento = new Data();
        Endereco endereco = new Endereco();
        double renda;

        System.out.println("\n\tCADASTRO DE CLIENTE");

        System.out.println("\nDigite o CPF: ");
        cpf = input.nextInt();
        input.nextLine();
        this.setCpf(cpf);

        System.out.println("\nDigite o nome: ");
        nome = input.nextLine();
        this.setNome(nome);

        System.out.println("\nDigite a data de nascimento: ");
        System.out.println("Digite o dia: ");
        nascimento.setDia();
        System.out.println("Digite o mes: ");
        nascimento.setMes();
        System.out.println("Digite o ano: ");
        nascimento.setAno();
        this.setNascimento(nascimento);

        System.out.println("\nDigite o endereço: ");
        System.out.println("Digite a rua: ");
        rua = input.nextLine();
        endereco.setRua(rua);
        System.out.println("Digite o numero: ");
        numero = input.nextInt();
        input.nextLine();
        endereco.setNumero(numero);
        System.out.println("Digite a cidade: ");
        cidade = input.nextLine();
        endereco.setCidade(cidade);
        System.out.println("Digite o cep: ");
        cep = input.nextInt();
        input.nextLine();
        endereco.setCep(cep);
        this.setEndereco(endereco);

        System.out.println("\nDigite a renda: ");
        renda = input.nextDouble();
        this.setRenda(renda);

        System.out.println("\nDigite o número de dependentes: ");
        dependentes = input.nextInt();
        this.setDependentes(dependentes);
        input.nextLine();

    }

    public void alteraCliente() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tALTERAÇÃO DE CADASTRO DE CLIENTE");
        System.out.printf("\nNome: %s - Endereço: %s, %d, %s - CEP: %d", this.getNome(), this.getEndereco().getRua(),
                this.getEndereco().getNumero(), this.getEndereco().getCidade(), this.getEndereco().getCep());

        System.out.println("\nDigite a rua: ");
        String rua = input.nextLine();
        this.endereco.setRua(rua);

        System.out.println("Digite o número: ");
        int numero = input.nextInt();
        input.nextLine();
        this.endereco.setNumero(numero);

        System.out.println("Digite a cidade: ");
        String cidade = input.nextLine();
        this.endereco.setCidade(cidade);

        System.out.println("Digite o CEP: ");
        int cep = input.nextInt();
        input.nextLine();
        this.endereco.setCep(cep);

    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

}