import TipoPagamento;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int id;
    private String dataHora;
    private TipoPagamento tipo;
    private List<Servico> servicos;
    private float valorTotal; // talvez não tenha esse atributo, somente a função getValorTotal
    

    public Compra(int id, List<Servico> servicos, TipoPagamento tipo) {
        this.id = id;
        this.date = new Date().toString();
        this.tipo = tipo;
        this.servicos = servicos;
        this.valorTotal = this.setValorTotal();
    }

    public int getID() {
        return this.id;
    }

    public String getDataHora() {
        return this.date;
    }

    public TipoPagamento getTipo() {
        return this.tipo;
    }

    public List<Servico> getServicos() {
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