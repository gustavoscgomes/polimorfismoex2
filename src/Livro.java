public class Livro extends Produto implements Promocao{

    public Livro(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double promocao() {
        double preco = getPreco() - (getPreco() * 0.1) ;
        return preco;
    }

}
