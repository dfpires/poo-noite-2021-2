package lista3.venda;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private int codigo;
    private float valorTotal;
    private Date data;
    // ArrayList
    private ArrayList<ItemVenda> itens;

    public Venda(){ // construtor
        this.setItens(new ArrayList<ItemVenda>());
    }
    public Venda(int codigo, float valorTotal, Date data){ // construtor
        this.setCodigo(codigo);
        this.setValorTotal(valorTotal);
        this.setData(data);
        this.setItens(new ArrayList<ItemVenda>());
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
   
    
}
