import java.util.List;

public class Pedido {
    private Integer id;
    private List<Item> itens;
    private Cliente cliente;
    private Double valorTotal;

    public Pedido(Integer id, List<Item> itens, Cliente cliente) {
        this.id = id;
        this.itens = itens;
        this.cliente = cliente;
        this.valorTotal = calcularTotal();
    }

    public Double calcularTotal(){
        Double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id.toString() +
                ", itens=" + itens.toString() +
                ", cliente=" + cliente.toString() +
                ", valorTotal=" + valorTotal.toString() +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
