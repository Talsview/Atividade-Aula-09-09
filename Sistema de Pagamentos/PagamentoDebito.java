class PagamentoDebito extends Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via CARTÃO DE DÉBITO.");
    }
}