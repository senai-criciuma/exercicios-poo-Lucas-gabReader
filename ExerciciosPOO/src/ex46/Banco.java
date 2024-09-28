package ex46;
import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, ContaBancaria> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void criarConta(String titular, String numeroConta) {
        if (!contas.containsKey(numeroConta)) {
            ContaBancaria novaConta = new ContaBancaria(titular, numeroConta);
            contas.put(numeroConta, novaConta);
            System.out.printf("Conta criada: %s (%s)%n", titular, numeroConta);
        } else {
            System.out.println("Número da conta já existe.");
        }
    }

    public void consultarSaldo(String numeroConta) {
        ContaBancaria conta = contas.get(numeroConta);
        if (conta != null) {
            System.out.printf("Saldo da conta %s: R$%.2f%n", numeroConta, conta.getSaldo());
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public void realizarTransferencia(String numeroContaOrigem, String numeroContaDestino, double valor) {
        ContaBancaria contaOrigem = contas.get(numeroContaOrigem);
        ContaBancaria contaDestino = contas.get(numeroContaDestino);

        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }
}
