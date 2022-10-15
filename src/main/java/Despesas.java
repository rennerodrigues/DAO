import java.util.Calendar;

public class Despesas extends Conta {

    private double gerais;
    private double cartao;
    private double energia;
    private double agua;
    private Calendar dataDespesa;

    public Despesas() {

    }

    public Despesas(double saldo, double receitas, double despesas, double gerais, double cartao, double energia, double agua, Calendar dataDespesa) {
        super(saldo, receitas, despesas);
        this.gerais = gerais;
        this.cartao = cartao;
        this.energia = energia;
        this.agua = agua;
        this.dataDespesa = dataDespesa;
    }

    public Despesas(String nome, String email, String telefone, int cpf, int rg, int senha, int conta, double saldo, double receitas, double despesas, double gerais, double cartao, double energia, double agua, Calendar dataDespesa) {
        super(nome, email, telefone, cpf, rg, senha, conta, saldo, receitas, despesas);
        this.gerais = gerais;
        this.cartao = cartao;
        this.energia = energia;
        this.agua = agua;
        this.dataDespesa = dataDespesa;
    }

    public double calcularTotal() {
        return saldo = saldo - gerais - cartao - energia - agua;

    }

    public double getGerais() {
        return gerais;
    }

    public void setGerais(double gerais) {
        this.gerais = gerais;
    }

    public double getCartao() {
        return cartao;
    }

    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public Calendar getDataDespesa() {
        return dataDespesa;
    }

    public void setDataDespesa(Calendar dataDespesa) {
        this.dataDespesa = dataDespesa;
    }
}


