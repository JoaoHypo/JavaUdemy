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

}
