import java.util.ArrayList;
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
        for(int i = 0; i < this.compras.size(); i++) {
            if (this.compras.get(i).getID() == id) {
                this.compras.remove(i);
                break;
            }
        }
    }

    public void alterarCompra(int id) {
        for (Compra c: this.compras) {
            if (id == c.id)
                //DO STUFF
        }
    }
    // Talvez deva ser implementado pelo histórico, pois ele que "mantém" as compras

    // deve ficar na classe onde o cancelamento está sendo efetivado
    // public void enviarEmailCancelamento() {
    //     return;
    // }
}