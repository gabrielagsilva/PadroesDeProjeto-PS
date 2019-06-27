import Servico;

public class Voo extends Servico {
    private String assento;

    public String getAssento() {
        return this.assento;
    }
    
    public void alterarServico(String[] alteracoes) {
        this.assento = alteracoes;
    }
}