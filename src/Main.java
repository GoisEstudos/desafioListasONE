import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartao: ");
        int limite = sc.nextInt();
        List<String> produtos = new ArrayList<>();
        int op;
        do {
            sc.nextLine();
            System.out.println("Digite a descricao da compra: ");
            String descricao = sc.nextLine();
            System.out.println("Digite o valor da compra: ");
            int valor = sc.nextInt();
            if (valor > limite) {
                System.out.println("Limite ultrapassado!");
                break;
            } else {
                limite -= valor;
            }
            System.out.println("Compra realizada!");

            produtos.add(descricao + " - " + valor);

            System.out.println("Digite 0 para sair ou 1 para continuar: ");
            op = sc.nextInt();

        } while (op != 0);

        System.out.println("--------------------------------------------");
        System.out.println("COMPRAS REALIZADAS: ");

        for (String info : produtos) {
            System.out.println(info);
        }

        System.out.println("--------------------------------------------");
        System.out.println("Saldo restante: " + limite);
    }
}