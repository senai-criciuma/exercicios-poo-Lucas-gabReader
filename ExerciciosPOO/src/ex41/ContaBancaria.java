package ex41;

public class ContaBancaria {
    private String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado. Novo saldo: R$%.2f%n", valor, saldo);
        } else {
            System.out.println("Saque inválido.");
        }
    }

    public double obterSaldo() {
        return saldo;
    }
}

