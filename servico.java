import TipoServico;

public class Servico {
    private float valor;
    private String descricao;
    private int qtDisponivel;
    private TipoServico tipo;

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

    public float getQtDisponivel() {
        return this.qtDisponivel;
    }

    public void setQtDisponivel(int qtDisponivel) {
        this.qtDisponivel = qtDisponivel;
    }

    public void receberDesconto(float desconto) {
        this.valor = this.valor*(1-desconto);
    }

    public TipoServico getTipoServico(){
        return this.tipo;
    }

}