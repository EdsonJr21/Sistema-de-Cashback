import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static CashbackSystem cashbackSystem = new CashbackSystem();

    public static void main(String[] args) {
        Titulo titulo = new Titulo("Sapato", 35, 10);
        Titulo titulo2 = new Titulo("Camisa", 70, 5);
        Titulo titulo3 = new Titulo("Calça", 49, 7);

        LinkedList<Titulo> listaDosTitulos = new LinkedList<>();
        listaDosTitulos.add(titulo);
        listaDosTitulos.add(titulo2);
        listaDosTitulos.add(titulo3);

        Scanner info = new Scanner(System.in);

        cashbackSystem.adicionarCliente("Marcos", 12.20);
        cashbackSystem.adicionarCliente("Maria", 24.14);

        System.out.println("Produtos disponíveis:");
        for (Titulo item : listaDosTitulos) {
            System.out.println("Produto: " + item.getNome() + ", Preço: " + item.getValor() + ", Quantidade: " + item.getQuantidade());
        }

        System.out.println("Digite seu nome:");
        String nomeCliente = info.nextLine();

        System.out.println("Digite o nome do produto que deseja comprar:");
        String nomeDoProduto = info.nextLine();

        System.out.println("Digite o valor do produto:");
        double valorDoProduto = info.nextDouble();

        boolean compraEfetuada = false;
        for (Titulo item : listaDosTitulos) {
            if (item.getNome().equalsIgnoreCase(nomeDoProduto) && item.getValor() == valorDoProduto) {
                System.out.println("Compra do produto: " + item.getNome() + " efetuada com sucesso");
                cashbackSystem.adicionarCashback(nomeCliente, valorDoProduto * 0.1); // 10% de cashback
                System.out.println("Cashback adicionado: " + (valorDoProduto * 0.1));
                compraEfetuada = true;
                break;
            }
        }
        if (!compraEfetuada) {
            System.out.println("Nome do produto ou valor incorreto.");
        }

        System.out.println("Saldo de cashback de " + nomeCliente + ": " + cashbackSystem.consultarCashBack(nomeCliente));
        info.close();
    }
}