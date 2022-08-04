import java.util.Scanner;

public class Carro extends Veiculo {

    private int potencia;
    private int numCilindros;
    private int numOcupantes;
    private String tipo;
    private Dimensao dimensoes;

    public Carro(int numChassi, String marca, String modelo, int ano, int km, String tipoCombustivel, double peso,
            int potencia, int numCilindros, int numOcupantes, String tipo, Dimensao dimensoes) {
        super(numChassi, marca, modelo, ano, km, tipoCombustivel, peso);
        this.potencia = potencia;
        this.numCilindros = numCilindros;
        this.numOcupantes = numOcupantes;
        this.tipo = tipo;
        this.dimensoes = dimensoes;
    }

    public Carro() {
        super();
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumCilindros() {
        return numCilindros;
    }

    public void setNumCilindros(int numCilindros) {
        this.numCilindros = numCilindros;
    }

    public int getNumOcupantes() {
        return numOcupantes;
    }

    public void setNumOcupantes(int numOcupantes) {
        this.numOcupantes = numOcupantes;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dimensao getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensao dimensoes) {
        this.dimensoes = dimensoes;
    }

    public void cadastraCarro() {
        // Função para criar um objeto da classe Carro com todos os campos preenchidos
        System.out.println("\n\tCADASTRO DE CARROS");
        int numChassi, ano, km, potencia, nCilindros, numOcupantes;
        String marca, modelo, combustivel, tipo;
        double peso;
        int altura, largura, comprimento;
        Scanner input = new Scanner(System.in);

        System.out.println("\nDigite o número do chassi: ");
        numChassi = input.nextInt();
        input.nextLine();
        this.setNumChassi(numChassi);

        System.out.println("\nDigite a marca: ");
        marca = input.nextLine();
        this.setMarca(marca);

        System.out.println("\nDigite o modelo: ");
        modelo = input.nextLine();
        this.setModelo(modelo);

        System.out.println("\nDigite o ano do carro: ");
        ano = input.nextInt();
        input.nextLine();
        this.setAno(ano);

        System.out.println("\nDigite a quilometragem: ");
        km = input.nextInt();
        input.nextLine();
        this.setKm(km);

        System.out.println("\nDigite o tipo de combustível do carro(Gasolina, Etanol, Flex): ");
        combustivel = input.nextLine();
        this.setTipoCombustivel(combustivel);

        System.out.println("\nDigite o peso do carro: ");
        peso = input.nextDouble();
        input.nextLine();
        this.setPeso(peso);

        System.out.println("\nDigite a potência do carro: ");
        potencia = input.nextInt();
        input.nextLine();
        this.setPotencia(potencia);

        System.out.println("\nDigite o número de cilindros: ");
        nCilindros = input.nextInt();
        input.nextLine();
        this.setNumCilindros(nCilindros);

        System.out.println("\nDigite o número de assentos: ");
        numOcupantes = input.nextInt();
        input.nextLine();
        this.setNumOcupantes(numOcupantes);

        System.out.println("\nDigite o tipo do carro(Utilitário, Pickup, Sedan, Hatch, Esportivo): ");
        tipo = input.nextLine();
        this.setTipo(tipo);

        System.out.println("\nDigite as dimensões em centímetros: ");
        System.out.println("\nDigite a altura: ");
        altura = input.nextInt();
        input.nextLine();
        System.out.println("\nDigite a largura: ");
        largura = input.nextInt();
        input.nextLine();
        System.out.println("\nDigite o comprimento: ");
        comprimento = input.nextInt();
        input.nextLine();

        Dimensao dimensao = new Dimensao(altura, largura, comprimento);

        this.setDimensoes(dimensao);

    }

    public void alteraCarro() {
        Scanner input = new Scanner(System.in);
        int aux;

        System.out.println("\n\tALTERAÇÃO DE CARROS");
        System.out.println("Quilometragem: " + this.getKm() + "\tPotência: " + this.getPotencia());

        System.out.println("\nDigite a nova quilometragem: ");
        aux = input.nextInt();
        input.nextLine();
        this.setKm(aux);

        System.out.println("\nDigite a nova potência: ");
        aux = input.nextInt();
        input.nextLine();
        this.setPotencia(aux);

    }

}