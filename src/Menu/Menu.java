package Menu;

import java.util.InputMismatchException;
import PlayfairCypher.PlayfairCypher;
import java.util.Scanner;

public class Menu {

    public void mainMenu() {

        boolean executionSwitch = false;

        while (!executionSwitch) {
            Scanner in = new Scanner(System.in);

            System.out.println("| Bem-vindo ao EnCrypting Project |");
            System.out.println("| Escolha uma opção:              |");
            System.out.println("| 1 - Decodificar                 |");
            System.out.println("| 2 - Codificar                   |");
            System.out.println("| 3 - Finalizar                   |");

            try {
                switch (in.nextInt()) {
                    case 1:
                        this.typeDecoderMenu();
                        break;

                    case 2:
                        this.typeEncoderMenu();
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

        while (!executionSwitch) {

            PlayfairCypher decoTrigger = new PlayfairCypher();
            Scanner in = new Scanner(System.in);

            System.out.println("| Deseja DECODIFICAR em:          |");
            System.out.println("| 1 - Cifra de Playfair           |");
            System.out.println("| 2 - ...                         |");
            System.out.println("| 3 - Voltar                      |");

            try {
                switch (in.nextInt()) {
                    case 1:
                        decoTrigger.decodificar();
                        mainMenu();
                        break;

                    case 2:
                        break;

                    case 3:
                        this.mainMenu();
                        break;

                    default:
                        System.out.println("| Opção inválida, tente novamente: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("| Erro: Tipo de valor inválido, tente novamente: " + e);
            }
        }
    }

    public void typeEncoderMenu() {

        boolean executionSwitch = false;

        while (!executionSwitch) {

            PlayfairCypher codeTrigger = new PlayfairCypher();
            Scanner in = new Scanner(System.in);

            System.out.println("| Deseja CODIFICAR em:            |");
            System.out.println("| 1 - Cifra de Playfair           |");
            System.out.println("| 2 - ...                         |");
            System.out.println("| 3 - Voltar                      |");

            try {
                switch (in.nextInt()) {
                    case 1:
                        codeTrigger.codificar();
                        mainMenu();
                        break;

                    case 2:
                        break;

                    case 3:
                        this.mainMenu();
                        break;

                    default:
                        System.out.println("| Opção inválida, tente novamente: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("| Erro: Tipo de valor inválido, tente novamente: " + e);
            }
        }
    }
}
