import java.util.ArrayList;
import java.util.Calendar;
import Compra;

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
        return null;
    }

    public void adicionarCompra(Compra c) {
        this.compras.add(c);
    }

    public void cancelarCompra(int id) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            float valor = c.getValorTotal();
            umaSemanaDepois = c.getDataHora().clone();
            umaSemanaDepois.add(Calendar.DATE, 7);
            if (Calendar.getInstance().after(umaSemanaDepois)) {
                // Cobrar taxa de 30%. Criar classe pra pagamento com cartão?
            } else {
                // Reembolso total
            }
            this.compras.remove(this.compras.indexOf(c));
        }
    }

    public void alterarCompra(int idCompra, Servico s) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            // Encontrar o serviço a ser modificado. Serviço precisa de ID???
            // Modificar o serviço (remover o serviço e adicionar outro?)
            // Cobrar taxa de 15%
        }
    }
    // Talvez deva ser implementado pelo histórico, pois ele que "mantém" as compras

    // deve ficar na classe onde o cancelamento está sendo efetivado
    // public void enviarEmailCancelamento() {
    //     return;
    // }

    //REFERENCIA PARA O USO DO CALENDAR:
    //https://stackoverflow.com/questions/30207693/how-to-check-if-date-exceeds-more-than-seven-days
    //https://www.geeksforgeeks.org/calendar-class-in-java-with-examples/
}