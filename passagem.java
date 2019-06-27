import Servico;

public class Passagem extends Servico {
    private int id;
    private String cadeira;

    public void setId(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public String getCadeira() {
        return this.cadeira;
    }
    
    public void alterarServico(String[] alteracoes) {
        this.cadeira = alteracoes[0];
    }
}