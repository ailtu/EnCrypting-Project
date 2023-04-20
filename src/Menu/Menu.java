package Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public void mainMenu() {

        boolean executionSwitch = false;

        while (!executionSwitch) {
            Scanner in = new Scanner(System.in);

            System.out.println("| Bem-vindo ao EnCrypting Project |");
            System.out.println("| Choose a option:                |");
            System.out.println("| 1 - Decodificar                 |");
            System.out.println("| 2 - Codificar                   |");
            System.out.println("| 3 - Finalizar                   |");

            try {
                switch (in.nextInt()) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        System.out.println("| Finalizando... até breve!");
                        Runtime.getRuntime().exit(0);

                    default:
                        System.out.println("| Opção inválida, tente novamente: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("| Erro: Tipo de valor inválido, tente novamente: " + e);
            }
        }
    }

    public void typeDecoderMenu() {

        boolean executionSwitch = false;

     /* while (!executionSwitch) {
            Scanner in = new Scanner(System.in);

            System.out.println("| Choose a option:                |");
            System.out.println("| 1 - tipo de cifra                |");
            System.out.println("| 3 - Voltar                      |");

            try {
                switch (in.nextInt()) {
                    case 1:
                        break;

                    case 2:
                        break;

                    case 3:
                        System.out.println("| Finalizando... até breve!");
                        Runtime.getRuntime().exit(0);

                    default:
                        System.out.println("| Opção inválida, tente novamente: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("| Erro: Tipo de valor inválido, tente novamente: " + e);
            }
        } */   
    }

    public void typeEncoderMenu() {

        boolean executionSwitch = false;

    }
}
