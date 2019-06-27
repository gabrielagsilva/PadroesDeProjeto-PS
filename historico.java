import java.util.ArrayList;
import java.util.Calendar;
import Compra;
import TipoServico;
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

    public void alterarCompra(int idCompra, int idServico) {
        Compra c = this.buscarCompras(id);
        if (c != null) {
            Servico s = c.getServico();
            TipoServico tipoS = s.getTipoServico();
            switch (tipoS){
                case PASSAGEM:
                    //chamar o alterar servico da classe passagem
                    break;
                case PASSEIO:
                    //chamar o alterar servico da classe passeio
                    break;
                case ESTADIA:
                    //chamar o alterar servico da classe estadia
                    break;
                default:
                    throw new Exception();
            }
            // Encontrar o serviço a ser modificado. Serviço precisa de ID???
            // Modificar o serviço (remover o serviço ou alterar dados)
            // Cobrar taxa de 15%
        }
    }
}