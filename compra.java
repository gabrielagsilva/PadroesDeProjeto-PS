import TipoPagamento;
import StatusTransacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Compra {
    private int id;
    private Calendar dataHora;
    private TipoPagamento tipo;
    private ArrayList<Servico> servicos;
    private float valorTotal;
    private StatusTransacao status;
    

    public Compra(int id, ArrayList<Servico> servicos, TipoPagamento tipo, float valorTotal, StatusTransacao status) {
        this.id = id;
        this.dataHora = Calendar.getInstance();
        this.servicos = servicos;
        this.tipo = tipo;
        this.valorTotal = this.valorTotal;
        this.status = status;
    }

    public int getID() {
        return this.id;
    }

    public Calendar getDataHora() {
        return this.dataHora;
    }

    public TipoPagamento getTipo() {
        return this.tipo;
    }

    public ArrayList<Servico> getServicos() {
        return this.servicos;
    }

    public float getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Servico buscarServico(int id){
        for (Servico c: this.servicos) {
            if (id == c.id)
                return c;
        }
        return null;
    }

    public void setStatusTransacao(StatusTransacao status) {
        this.status = status; 
    }

    public StatusTransacao getStatusTransacao() {
        return this.status;
    }
    
    // public String cancelarCompra() {}
    // Deve ser implementado pelo histórico, pois ele que "mantém" as compras
    
    // public String finalizarCompra() {}
    // Deve ser implementado pelo carrinho e alterar o histórico

    // implementei na classe carrinho
    // public void enviarEmailConfirmacao() {
    //     return;
    // }
}