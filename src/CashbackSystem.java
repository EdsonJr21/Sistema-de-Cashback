import java.util.HashMap;

public class CashbackSystem {
    private HashMap<String, Clientes> clientesMap;

    public CashbackSystem() {
        clientesMap = new HashMap<>();
    }

    public void adicionarCliente(String nome, double saldoInicial) {
        if (!clientesMap.containsKey(nome)) {
            Clientes cliente = new Clientes(nome, saldoInicial);
            clientesMap.put(nome, cliente);
        } else {
            System.out.println("Cliente já existe.");
        }
    }

    public void adicionarCashback(String nome, double valor) {
        if (clientesMap.containsKey(nome)) {
            Clientes cliente = clientesMap.get(nome);
            double novoSaldo = cliente.getSaldoCashBack() + valor;
            cliente.setSaldoCashBack(novoSaldo);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public double consultarCashBack(String nome) {
        if (clientesMap.containsKey(nome)) {
            return clientesMap.get(nome).getSaldoCashBack();
        } else {
            System.out.println("Cliente não encontrado.");
            return -1;
        }
    }

    public void removerCliente(String nome) {
        if (clientesMap.containsKey(nome)) {
            clientesMap.remove(nome);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}