

public class MiniLivro extends Livro {
    public MiniLivro(String nome, String descricao, double valor, String isbn, Autor autor) {
        super(nome, descricao, valor, isbn, autor);
    }


    @Override
    public boolean aplicaDescontode(double porcentagem) {
        System.out.println("MiniLivro não pode receber descontos!");
        return false;
    }

}
