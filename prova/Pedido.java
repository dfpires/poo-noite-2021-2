package prova;
import java.util.Date;

// objeto-todo
public class Pedido {
    private int codigo;
    private Date data;
    // associações
    private Cliente cliente;
    private Unidade unidade;

    public Pedido() {
    }
    // agregação
    public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setCliente(cliente);
        this.setUnidade(unidade);
    }
    // composição
    public Pedido(int codigo, Date data, String rg, String nome, String cidade, String estado) {
        this.setCodigo(codigo);
        this.setData(data);
        this.cliente = new Cliente(rg, nome); // quem cria o cliente é o pedido
        this.unidade = new Unidade(cidade, estado); // quem cria a unidade é o pedido
    }

    public int getCodigo() {
        return codigo;
    }
    public Unidade getUnidade() {
        return unidade;
    }
    // agregação
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
     // composição
     public void setUnidade(String cidade, String estado) {
        this.unidade = new Unidade(cidade, estado);
    }
    public Cliente getCliente() {
        return cliente;
    }
    // agregação
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    // composição
    public void setCliente(String nome, String rg) {
        this.cliente = new Cliente(nome, rg);
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Código " + this.codigo + " Data: " + this.data + 
        " Cliente: " + this.cliente + " Unidade: " + this.unidade;
    }
}


// termos conceituais -> o cliente seria dependente do pedido, e somente estaria relacionado
// a um único pedido, e se um pedido for eleminado, o cliente é eliminado também
// termos conceituais -> a unidade seria dependente do pedido, e somente estaria relacionado
// a um único pedido, e se uma unidade for eleminada, o cliente é eliminado também

