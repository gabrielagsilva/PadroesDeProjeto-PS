import java.util.ArrayList;
import java.util.Calendar;
import Compra;
import java.util.NoSuchElementException;

public class Historico {
    private ArrayList<Compra> compras;

    public Historico(){
        this.compras = new ArrayList<Compra>();
    }

    public Compra buscarCompras(int id) {
        try {
            for (Compra c: this.compras) {
                if (id == c.id)
                    return c;
            }
        } catch (NoSuchElementException e) {
            System.out.println(e, "Não foi achado a compra na sua lista."); 
            return null;
        }
    }

    public void adicionarCompra(Compra c) {
        this.compras.add(c);
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
            c.setStatusTransacao(StatusTransacao.CANCELADA);
            this.enviarEmailCancelamento();
        }
    }

    public void alterarCompra(int idCompra, Servico s) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            // Encontrar o serviço a ser modificado. Serviço precisa de ID???
            // Modificar o serviço (remover o serviço ou alterar dados)
            // Cobrar taxa de 15%
        }
    }
}