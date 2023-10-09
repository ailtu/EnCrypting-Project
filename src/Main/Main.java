package Main;

import Menu.Menu;

public class Main {
    public static void main(String[] args) {

        /* EXECUTE AQUI! */
        Menu triggerMenu = new Menu();
        triggerMenu.mainMenu();
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class Solucao {
    private boolean[][] grafo;

    public Solucao(boolean[][] grafo) {
        this.grafo = grafo;
    }

    public boolean[][] inverterArvore() {
        int tamanho = grafo.length;
        boolean[][] arvoreInvertida = new boolean[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            boolean[] visitado = new boolean[tamanho];
            Queue<Integer> fila = new LinkedList<>();
            fila.add(i);

            while (!fila.isEmpty()) {
                int no = fila.poll();
                visitado[no] = true;

                for (int j = 0; j < tamanho; j++) {
                    if (grafo[no][j] && !visitado[j]) {
                        arvoreInvertida[i][j] = true;
                        fila.add(j);
                    }
                }
            }
        }

        return arvoreInvertida;
    }

    public static void main(String[] args) {
        boolean[][] grafoOriginal = {
            {false, true, false, false},
            {false, false, true, true},
            {false, false, false, false},
            {false, false, false, false}
        };

        Solucao solucao = new Solucao(grafoOriginal);
        boolean[][] arvoreInvertida = solucao.inverterArvore();

        // Exemplo de como imprimir a árvore invertida
        for (int i = 0; i < arvoreInvertida.length; i++) {
            for (int j = 0; j < arvoreInvertida[i].length; j++) {
                System.out.print(arvoreInvertida[i][j] ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}