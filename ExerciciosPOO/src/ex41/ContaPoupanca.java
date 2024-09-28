package ex41;

public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(String titular, double saldoInicial, double taxaJuros) {
        super(titular, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = saldo * taxaJuros;
        depositar(juros);
        System.out.printf("Juros de R$%.2f aplicados. Novo saldo: R$%.2f%n", juros, saldo);
    }
}




