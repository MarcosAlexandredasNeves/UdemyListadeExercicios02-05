import java.util.Scanner;

public class EX05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total;

        while (true) {
            System.out.println("Digite o código do cardápio: \n 1 - Cachorro Quente R$4,00 \n 2 - X-Salada R$4,50" +
                    "\n 3 - X-Bacon R$5,00 \n 4 - Torrada Simples R$2,00 \n 5 - Refrigerante R$1,50 \n 6 - Sair do programa");
            String op = scanner.nextLine();

            if (op.equals("1")) {
                System.out.println("Quantos cachorros quentes irá querer? ");
                int dog = scanner.nextInt();
                total = dog * 4.00;
                System.out.printf("O valor ficou em R$ %.2f%n", total);
                scanner.nextLine();
                System.out.println("Voltando ao menu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (op.equals("2")) {
                System.out.println("Quantos X-Salda irá querer? ");
                int dog = scanner.nextInt();
                total = dog * 4.50;
                System.out.printf("O valor ficou em R$ %.2f%n", total);
                scanner.nextLine();
                System.out.println("Voltando ao menu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (op.equals("3")) {
                System.out.println("Quantos X-Bacon irá querer? ");
                int dog = scanner.nextInt();
                total = dog * 5.00;
                System.out.printf("O valor ficou em R$ %.2f%n", total);
                scanner.nextLine();
                System.out.println("Voltando ao menu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (op.equals("4")) {
                System.out.println("Quantos Torrada simples irá querer? ");
                int dog = scanner.nextInt();
                total = dog * 2.0;
                System.out.printf("O valor ficou em R$ %.2f%n", total);
                scanner.nextLine();
                System.out.println("Voltando ao menu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (op.equals("5")) {
                System.out.println("Quantos refrigerantes irá querer? ");
                int dog = scanner.nextInt();
                total = dog * 1.50;
                System.out.printf("O valor ficou em R$ %.2f%n", total);
                scanner.nextLine();
                System.out.println("Voltando ao menu...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            } else if (op.equals("6")) {
                System.out.println("Programa encerrado!");
                System.exit(0);

            }
        }
    }

}
