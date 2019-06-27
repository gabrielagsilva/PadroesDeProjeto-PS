import TipoPagamento;
import Estado;
import EstadoInicial;
import EstadoAprovado;
import EstadoAguardando;
import EstadoCancelado;
import EstadoNaoAutorizado;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.NoSuchElementException;

public class Compra {
    private int id;
    private Calendar dataHora;
    private TipoPagamento tipo;
    private ArrayList<Servico> servicos;
    private float valorTotal;

    // Possíveis estados:
    //      EstadoInicial
    //      EstadoAprovado
    //      EstadoAguardando
    //      EstadoCancelado
    //      EstadoNaoAutorizado
    private Status estado;
    

    public Compra(int id, ArrayList<Servico> servicos, TipoPagamento tipo, float valorTotal) {
        this.id = id;
        this.dataHora = Calendar.getInstance();
        this.servicos = servicos;
        this.tipo = tipo;
        this.valorTotal = this.valorTotal;
        this.estado = new EstadoInicial();
    }

    public void realizarCompra() {
        this.estado = this.estado.comprar(this.tipo, this.valorTotal);
        //O enviaEmailConfirmação fica para as subclasses de Estado
    }

    public void cancelarCompra() {
        this.estado = estado.cancelar(this.tipo, this.valorTotal);
    }

    public void setEstado(Estado e) {
        this.estado = e;
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
        this.valorTotal = estado.setValorTotal(valorTotal);
    }

    public Servico buscarServico(int id){
        for (Servico s: this.servicos) {
            if (id == s.id)
                return s;
        }
        throw new NoSuchElementException();
    }
}