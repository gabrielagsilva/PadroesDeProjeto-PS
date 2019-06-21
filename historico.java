import java.util.ArrayList;
import java.util.List;
import Compra;

public class Historico {
    private List<Compra> compras = new ArrayList<Compra>();

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
}