import java.util.Scanner;

public class Motocicleta extends Veiculo {
    private int cilindradas;
    private String tipo;

    public Motocicleta(int numChassi, String marca, String modelo, int ano, int km, String tipoCombustivel, double peso,
            int cilindradas, String tipo) {
        super(numChassi, marca, modelo, ano, km, tipoCombustivel, peso);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
    }

    public Motocicleta() {
        super();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void cadastraMotocicleta() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tCADASTRO DE MOTOCICLETAS");

        int numChassi, ano, km, cilindradas;
        String marca, modelo, combustivel, tipo;
        double peso;

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

        System.out.println("\nDigite o ano da motocicleta: ");
        ano = input.nextInt();
        input.nextLine();
        this.setAno(ano);

        System.out.println("\nDigite a quilometragem: ");
        km = input.nextInt();
        input.nextLine();
        this.setKm(km);

        System.out.println("\nDigite o tipo de combustível da motocicleta(Gasolina, Etanol, Flex): ");
        combustivel = input.nextLine();
        this.setTipoCombustivel(combustivel);

        System.out.println("\nDigite o peso da motocicleta: ");
        peso = input.nextDouble();
        input.nextLine();
        this.setPeso(peso);

        System.out.println("\nDigite as cilindradas: ");
        cilindradas = input.nextInt();
        input.nextLine();
        this.setCilindradas(cilindradas);

        System.out.println("\nDigite o tipo da motocicleta(Trail, Street, Esportiva, Custom): ");
        tipo = input.nextLine();
        this.setTipo(tipo);

    }

    public void alteraMotocicleta() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\tALTERAÇÃO DE CADASTRO DE MOTOCICLETA");
        int aux;
        System.out.println("\nQuilometragem: " + this.getKm() + "\tCilindradas: " + this.getCilindradas());

        System.out.println("\nDigite a nova quilometragem: ");
        aux = input.nextInt();
        input.nextLine();
        this.setKm(aux);

        System.out.println("\nDigite a nova cilindrada: ");
        aux = input.nextInt();
        input.nextLine();
        this.setCilindradas(aux);

    }

}
