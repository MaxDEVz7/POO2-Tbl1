import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        System.out.println("Iniciando teste da aplicação...");

        // Criando cliente
        Cliente cliente = new Cliente("João Silva", 1);
        System.out.println("Cliente criado: " + cliente);

        // Criando produtos
        Item produto1 = new Item(100, "Notebook", 10.0, 3500.00);
        Item produto2 = new Item(200, "Mouse Gamer", 50.0, 150.00);

        List<Item> itens = new ArrayList<>();
        itens.add(produto1);
        itens.add(produto2);

        System.out.println("Produto criado: " + produto1);
        System.out.println("Produto criado: " + produto2);

        // Criando pedido
        Pedido pedido = new Pedido(5000, itens, cliente);

        System.out.println("Pedido finalizado.");

        // Exibindo resumo do pedido
        System.out.println("Resumo do Pedido: ");
        System.out.println(pedido.toString());
    }

    // 1)
// Como trabalhamos no projeto:
//    1º Definição do projeto
//    2º Levantamos os Requisitos
//    3º Implementamos
//    4º Testamos
//    5º Apresentamos


    // 2)
// Cada fase foi testada pela equipe de desenvolvimento.

   // 3)

//    Reavalição se a alteração está dentro do escopo e dar a manutenção.
}