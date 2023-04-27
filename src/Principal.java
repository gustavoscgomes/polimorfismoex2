public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro("como programar", 300);
        Eletronico eletronico = new Eletronico("iphone", 3000);
        Roupa r = new Roupa("camisa", 100);

        System.out.println(livro.promocao());
        System.out.println(eletronico.promocao());
    }
}
