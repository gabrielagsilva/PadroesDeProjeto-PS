import TipoServico;

public abstract class Servico {
    private float valor;
    private String descricao;

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void receberDesconto(float desconto) {
        this.valor = this.valor*(1-desconto);
    }

    public abstract void getBonificacao(String[] alteracoes);

}