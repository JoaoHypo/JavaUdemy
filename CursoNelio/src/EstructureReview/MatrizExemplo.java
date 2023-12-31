package EstructureReview;

public class MatrizExemplo {
    public static void main(String[] args) {
        // Tamanho da matriz (altere conforme necessário)
        int linhas = 3;
        int colunas = 3;

        // Criando e preenchendo a matriz
        int[][] matriz = new int[linhas][colunas];
        preencherMatriz(matriz);

        // Imprimindo a matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Exemplo de soma de duas matrizes
        int[][] matriz2 = new int[linhas][colunas];
        preencherMatriz(matriz2);

        System.out.println("\nSegunda matriz:");
        imprimirMatriz(matriz2);

        int[][] somaMatrizes = somarMatrizes(matriz, matriz2);
        System.out.println("\nResultado da soma:");
        imprimirMatriz(somaMatrizes);

        // Exemplo de multiplicação de matriz por um escalar
        int escalar = 2;
        int[][] matrizEscalar = multiplicarPorEscalar(matriz, escalar);
        System.out.println("\nResultado da multiplicação por " + escalar + ":");
        imprimirMatriz(matrizEscalar);
    }
    // Função para preencher a matriz com valores
    public static void preencherMatriz(int[][] matriz) {
        int valor = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }
    }
    // Função para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
    // Função para somar duas matrizes
    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhas = matriz1.length;
        int colunas = matriz1[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }
    // Função para multiplicar uma matriz por um escalar
    public static int[][] multiplicarPorEscalar(int[][] matriz, int escalar) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultado;
    }
}
