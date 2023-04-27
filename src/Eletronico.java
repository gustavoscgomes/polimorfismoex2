public class Eletronico extends Produto implements Promocao{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
    @Override
    public double promocao() {
        double preco = getPreco() - (getPreco() * 0.05);
        return preco;
    }
}
