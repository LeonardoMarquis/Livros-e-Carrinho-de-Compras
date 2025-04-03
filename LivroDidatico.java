
public class LivroDidatico extends Livro {
    /*private double descontoEducacional;*/
    
    public LivroDidatico(String nome, String descricao, double valor, String isbn, Autor autor, double descontoEducacional){
        super(nome, descricao, valor, isbn, autor);
        /*this.descontoEducacional = descontoEducacional;*/
    }


    @Override
    public boolean aplicaDescontode(double porcentagem) {
        if (porcentagem > 0.15) {
            System.out.println("O desconto não pode exceder 15%!");
            return false;
        }
        return super.aplicaDescontode(porcentagem);
    }
    

    public void aplicaDescontoEducacional(double desconto){
        if (desconto > 100 || desconto < 0){
            System.out.println("O desconto é inválido!");
        }
        else{
            this.setvalor( this.getvalor() - this.getvalor() * desconto) ;
            System.out.println("O novo preço é: " + this.getvalor());

        }


    }

    @Override
    public String toString(){
        return "LivroDidatico{" +
        "descontoEducacional='" + '\'' +
        ", detalhes=" + super.toString() +
        '}';     
    }
}
