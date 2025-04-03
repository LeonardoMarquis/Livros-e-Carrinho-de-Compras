
public abstract class Livro {       /*definiu a classe livro como abstrata, ela sera so um parametro do que livro tem que ter, mas o livro so pode ser dos tipos filhos, fisico ou ebook */
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(String nome, String descricao, double valor, String isbn, Autor autor) {
        this.nome = nome;
        this.descricao = descricao;
        this.isbn = isbn;
        this.valor = valor;
        this.autor = autor;
    }

    public boolean aplicaDescontode(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        System.out.println("Desconto de " + porcentagem + "  ||||  Valor novo= " +  getvalor());
        return true;
    }

    public String getnome() {
        return nome;
    }

    public String getdescricao() {
        return descricao;
    }

    public double getvalor() {
        return valor;
    }

    public String getisbn() {
        return isbn;
    }

    public Autor getautor() {
        return autor;
    }


    public void setvalor(double valor) {
        this.valor = valor;
    }
    /*tem que ter tanto get porque os atributos sao privados, entao nao da para acessar com obj.tal, mas sim obj.gettal */


    public void mostra() {
        System.out.println("nome: " + this.nome);
        System.out.println("descrição: " + this.descricao);
        System.out.println("valor: " + this.valor);
        System.out.println("isbn: " + this.isbn);
        System.out.println("autor: " + this.autor);
    }


    /*Quando você tenta imprimir um objeto, o Java chama o método toString() de forma automática. Se você não fornecer uma implementação customizada desse método, a implementação padrão da classe Object será usada, o que normalmente resulta em uma saída como a que você está vendo, que inclui o nome da classe e a referência de memória do objeto.*/


    @Override
    public String toString() {
    return "Livro{" +
           "titulo='" + getnome() + '\'' +
           ", descricao='" + getdescricao() + '\'' +
           ", preco=" + getvalor() +
           ", isbn='" + getisbn() + '\'' +
           ", autor=" + getautor().getNome() +
           '}';
    }



}