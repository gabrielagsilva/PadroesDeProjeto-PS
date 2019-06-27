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
    private float valorTotal; // talvez não tenha esse atributo, somente a função getValorTotal
    private StatusTransacao status;
    

    public Compra(int id, ArrayList<Servico> servicos, TipoPagamento tipo) {
        this.id = id;
        this.dataHora = Calendar.getInstance();;
        this.tipo = tipo;
        this.servicos = servicos;
        this.valorTotal = this.setValorTotal();
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

    private float setValorTotal() {
        float valorTotal = 0;
        for (Servico s: this.servicos) {
            valorTotal += s.getValor();
        }
        return valorTotal;
    }

    public Servico buscarServico(int id){
        for (Servico c: this.servicos) {
            if (id == c.id)
                return c;
        }
        return null;
    }

    // public String cancelarCompra() {}
    // Deve ser implementado pelo histórico, pois ele que "mantém" as compras

    // public String alterarCompra() {}
    // Talvez deva ser implementado pelo histórico, pois ele que "mantém" as compras

    // public String finalizarCompra() {}
    // Deve ser implementado pelo carrinho e alterar o histórico

    // implementei na classe carrinho
    // public void enviarEmailConfirmacao() {
    //     return;
    // }

    // deve ficar na classe onde o cancelamento está sendo efetivado
    // public void enviarEmailCancelamento() {
    //     return;
    // }
}