package ex46;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado na conta %s.%n", valor, numeroConta);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado da conta %s.%n", valor, numeroConta);
            return true;
        } else {
            System.out.println("Saque inválido.");
            return false;
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.printf("Transferência de R$%.2f da conta %s para a conta %s realizada com sucesso.%n", valor, numeroConta, contaDestino.getNumeroConta());
        }
    }
}

