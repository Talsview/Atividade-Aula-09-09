public class Main {
    public static void main(String[] args) {
        
        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoCredito();
        pagamentos[1] = new PagamentoDebito();
        pagamentos[2] = new PagamentoPix();

        double[] valores = {150.0, 80.5, 250.0};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].realizarPagamento(valores[i]);
        }
    }
}