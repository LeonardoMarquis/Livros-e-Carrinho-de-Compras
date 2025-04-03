
public class LivroFisico extends Livro {
    public LivroFisico(String nome, String descricao, double valor, String isbn, Autor autor) {
        super(nome, descricao, valor, isbn, autor);
    }


    public double getTaxaImpressao() {
        return this.getvalor() * 0.05;
    }


    @Override
    public String toString(){
        return "LivroFisico{" +
        super.toString() +
        '}';     
    }

    
}
