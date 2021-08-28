package lista3.ecommerce;
import java.util.Date;

public class Carrinho {
    private int codigo;
    private float valorTotal;
    private String formaPgto;
    private Date data;
    private String formaEntrega;
    // associação
    private ItemCarrinho itemCarrinho;

    public Carrinho() {
    }
    
    public Carrinho(int codigo, float valorTotal, String formaPgto, Date data, String formaEntrega,
    int codigoIC, float valorIC, int qtdeIC) {
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setFormaPgto(formaPgto);
        this.setData(data);
        this.setFormaEntrega(formaEntrega);
        // está vindo parte dos itens do carrinhos, que serão juntados aqui
        this.itemCarrinho = new ItemCarrinho(codigoIC, valorIC, qtdeIC); // composição
    }
    public ItemCarrinho getItemCarrinho() {
        return itemCarrinho;
    }
    public void setItemCarrinho(int codigo, float valor, int qtde) {
        this.itemCarrinho = new ItemCarrinho(codigo, valor, qtde); // composição
    }
    public String getFormaEntrega() {
        return formaEntrega;
    }
    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public String getFormaPgto() {
        return formaPgto;
    }
    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    public String toString(){
        
        return " Código: " + this.codigo + " Valor total: " + this.valorTotal + " Pagto: " + this.formaPgto + " Data: " + this.data + " Entrega: " + this.formaEntrega + " \n Item Carrinho: " + this.itemCarrinho.toString();

    }
}
