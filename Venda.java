public class Venda {

    private int idVenda;
    private Vendedor vendedorVenda;
    private Cliente clienteVenda;
    private Veiculo veiculoVenda;
    private double valorVenda;
    private Data dataVenda;
    private Horario horarioVenda;

    public Venda(int idVenda, Vendedor vendedorVenda, Cliente clienteVenda, Veiculo veiculoVenda, double valorVenda,
            Data dataVenda, Horario horarioVenda) {
        this.idVenda = idVenda;
        this.vendedorVenda = vendedorVenda;
        this.clienteVenda = clienteVenda;
        this.veiculoVenda = veiculoVenda;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.horarioVenda = horarioVenda;
    }

    public Venda() {

    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Vendedor getVendedorVenda() {
        return vendedorVenda;
    }

    public void setVendedorVenda(Vendedor vendedorVenda) {
        this.vendedorVenda = vendedorVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public Veiculo getVeiculoVenda() {
        return veiculoVenda;
    }

    public void setVeiculoVenda(Veiculo veiculoVenda) {
        this.veiculoVenda = veiculoVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Horario getHorarioVenda() {
        return horarioVenda;
    }

    public void setHorarioVenda(Horario horarioVenda) {
        this.horarioVenda = horarioVenda;
    }

}