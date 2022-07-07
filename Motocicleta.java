import Veiculo;

public class Motocicleta extends Veiculo {
    private int cilindradas;
    private String tipo;
    
    public Motocicleta(int numChassi, String marca, String modelo, int ano, int km, String tipoCombustivel, double peso,
            boolean vendido, int cilindradas, String tipo) {
        super(numChassi, marca, modelo, ano, km, tipoCombustivel, peso, vendido);
        this.cilindradas = cilindradas;
        this.tipo = tipo;
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

    
}
