package Scripts.Ilha;

public class Ilha {
    private int qntPessoas;
    private int[] localizacao = new int[2];
    private double taxQualidLoot;
    private double taxQuantiLoot;
    private String raridade;

    public Ilha(int qntPessoas, int[] localizacao) {
        this.qntPessoas = qntPessoas;
        this.localizacao = localizacao;
    }

    // Quantidade de Pessoas
    public int getQntPessoas() {
        return qntPessoas;
    }
    public void setQntPessoas(int qntPessoas) {
        this.qntPessoas = qntPessoas;
    }

    // Localização
    public int[] getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(int[] localizacao) {
        this.localizacao = localizacao;
    }

    // Taxa de Qualidade do Loot
    public double getTaxQualidLoot() {
        return taxQualidLoot;
    }
    public void setTaxQualidLoot(double taxQualidLoot) {
        this.taxQualidLoot = taxQualidLoot;
    }

    // Taxa Quantidade do Loot
    public double getTaxQuantiLoot() {
        return taxQuantiLoot;
    }
    public void setTaxQuantiLoot(double taxQuantiLoot) {
        this.taxQuantiLoot = taxQuantiLoot;
    }

    // Raridade Ilha
    public String getRaridade() {
        return raridade;
    }
    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }
}