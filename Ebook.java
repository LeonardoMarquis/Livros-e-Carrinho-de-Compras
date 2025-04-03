
public class Ebook extends Livro {
    private String watermark;
 
    public Ebook(String nome, String descricao, double valor, String isbn, Autor autor, String watermark) {
        super(nome, descricao, valor, isbn, autor);
        this.watermark = watermark;
    }
 
    @Override
    public boolean aplicaDescontode(double porcentagem) {
        if (porcentagem > 0.15) {
            System.out.println("O desconto não pode exceder 15%!");
            return false;
        }
        return super.aplicaDescontode(porcentagem);
    }
 
    @Override
    public String toString() {
        return "Ebook{" +
                "watermark='" + watermark + '\'' +
                ", detalhes=" + super.toString() +
                '}';
    }
 }
 