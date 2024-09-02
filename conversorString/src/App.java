import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Inversor inversor = new Inversor();
        Scanner ler = new Scanner(System.in);

        int menu = 0;

        do {
            System.out.print("Informe uma string para inverter: ");
            String original = ler.nextLine();

            String invertida = inversor.inverterString(original);
            System.out.println("String invertida: " + invertida);

            System.out.print("Deseja inverter outra string?: ");
            System.out.println("1. Sim");
            System.out.println("0. Sair");
            menu = ler.nextInt();
            ler.nextLine();
        } while (menu != 0);

        System.out.println("encerrando....");
    }
}
