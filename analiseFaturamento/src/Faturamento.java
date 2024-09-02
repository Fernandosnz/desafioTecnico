public class Faturamento {
    public void analisarFaturamento(double[] faturamento) {
        double menorValor = faturamento[0];
        double maiorValor = faturamento[0];
        double soma = 0;
        int diasComFaturamento = 0;

        
        for (double valor : faturamento) {
            if (valor > 0) {
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                soma += valor;
                diasComFaturamento++;
            }
        }

        double mediaMensal = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        
        for (double valor : faturamento) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorValor);
        System.out.println("Maior valor de faturamento: " + maiorValor);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}