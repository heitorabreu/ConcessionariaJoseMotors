public class Endereco{
    private String rua;
    private String cidade;
    private int numero;
    private int cep;
    
    
    public Endereco(String rua, String cidade, int numero, int cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}