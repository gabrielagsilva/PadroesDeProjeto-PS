import java.util.ArrayList;
import Servico;
import Compra;
import TipoPagamento;
import StatusTransacao;


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
            throw new Exception();
        }else{
            this.servicos.remove(index);
            this.valorTotal -= s.getValor();
        }
    }

    public void esvaziar() {
        this.servicos.clear();
        this.valorTotal = 0;
    }

    public boolean enviarPagamento() {
        // selecionar método
        TipoPagamento tipo = TipoPagamento.CARTAO;
        // enviar valor -> retorno da operadora de pagamento
        boolean efetivado = true;
        if (efetivado) {
            this.tipoPagamento = tipo;
        }
        return efetivado; 
    }

    public void enviarEmailConfirmacao() {
        System.out.println("Compra realizada com sucesso!");
    }

    public Compra finalizarCarrinho() {
        boolean efetivado = this.enviarPagamento();
        Compra c = new Compra(0, this.servicos, this.tipoPagamento, this.valorTotal, StatusTransacao.AGUARDANDO_PAGAMENTO);
        if (efetivado) {
            c.setStatusTransacao(StatusTransacao.APROVADA);
            this.enviarEmailConfirmacao();
        }
        else {
            c.setStatusTransacao(StatusTransacao.NAO_APROVADA);
        }
        return c; // para adicionar no historico
    }
}