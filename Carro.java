import Veiculo;

public class Carro extends Veiculo{

    private int potencia;
    private int numCilindros;
    private int numOcupantes;
    private String tipo;
    private Dimensao dimensoes;
    
    public Carro(int numChassi, String marca, String modelo, int ano, int km, String tipoCombustivel, double peso,
            boolean vendido, int potencia, int numCilindros, int numOcupantes, String tipo, Dimensao dimensoes) {
        super(numChassi, marca, modelo, ano, km, tipoCombustivel, peso, vendido);
        this.potencia = potencia;
        this.numCilindros = numCilindros;
        this.numOcupantes = numOcupantes;
        this.tipo = tipo;
        this.dimensoes = dimensoes;
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

    
}