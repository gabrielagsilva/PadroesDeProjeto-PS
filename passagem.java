import Servico;

public class Passagem extends Servico {
    private String cadeira;

    public String getcadeira() {
        return this.cadeira;
    }
    
    public void alterarServico(String[] alteracoes) {
        this.cadeira = alteracoes[0];
    }
}