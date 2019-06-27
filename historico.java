import java.util.ArrayList;
import java.util.Calendar;
import Compra;
import Java.util.NoSuchElementException;


public class Historico {
    private ArrayList<Compra> compras;

    public Historico(){
        this.compras = new ArrayList<Compra>();
    }

    public Compra buscarCompras(int id) {

        for (Compra c: this.compras) {
            if (id == c.id)
                return c;
        }
        throw new NoSuchElementException();
        
    }

    public void adicionarCompra(Compra c) {
        this.compras.add(c);
    }

    public void alterarCompra(int idCompra, int idServico, String[] alteracoes) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            Servico s = c.buscarServico(idServico);
            s.alterarServico(alteracoes);
        }
    }

    public void enviarEmailCancelamento() {
        System.out.prinln("Compra cancelada.");
    }

    public void cancelarCompra(int id) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            float valor = c.getValorTotal();
            Calendar umaSemanaDepois = c.getDataHora().clone();
            umaSemanaDepois.add(Calendar.DATE, 7);
            if (Calendar.getInstance().after(umaSemanaDepois)) {
                // Cobrar taxa de 30%. Criar classe pra pagamento com cartão?
            } else {
                // Reembolso total
            }
            // devolucao de servicos
            c.cancelarCompra();
            this.enviarEmailCancelamento();
        }
    }
}