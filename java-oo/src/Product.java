public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public double mostrarValorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return produto.nome + ", " + produto.preco + ", " + produto.quantidade;
    }
}