import java.util.ArrayList;
import Servico;
import Compra;
import TipoPagamento;
import java.util.NoSuchElementException;


public class Carrinho {
    private ArrayList<Servico> servicos;
    private float valorTotal;
    private TipoPagamento tipoPagamento;

    public Carrinho() {
        this.servicos = new ArrayList<Servico>();
        this.valorTotal = 0;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void adicionarItem(Servico s) {
        this.servicos.add(s);
        this.valorTotal += s.getValor();
    }

    public void removerItem(Servico s) {
        int index = this.servicos.indexOf(s);
        if(index < 0 || index > this.servicos.size() ){
            throw new NoSuchElementException();
        }else{
            this.servicos.remove(index);
            this.valorTotal -= s.getValor();
        }
    }

    public void esvaziar() {
        this.servicos.clear();
        this.valorTotal = 0;
    }

    public Compra finalizarCarrinho() {
        Compra c = new Compra(0, this.servicos, this.tipoPagamento, this.valorTotal);
        c.realizarCompra();
        return c;
    }

}