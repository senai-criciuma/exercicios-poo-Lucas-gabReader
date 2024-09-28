package ex41;

public class ContaCorrente extends ContaBancaria {
    private double limiteSaqueDiario;
    private double saldoSaqueDiario;

    public ContaCorrente(String titular, double saldoInicial, double limiteSaqueDiario) {
        super(titular, saldoInicial);
        this.limiteSaqueDiario = limiteSaqueDiario;
        this.saldoSaqueDiario = 0;
    }

    @Override
    public void sacar(double valor) {

    }
    public void reiniciarSaqueDiario(){

    }

}

