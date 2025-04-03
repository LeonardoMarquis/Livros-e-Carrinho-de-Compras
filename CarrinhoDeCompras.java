
public class CarrinhoDeCompras {
    double total;




    public double gettotal() {
        return total;
    }

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontode(0.2);
        total += livro.getvalor();
    }


    public void mostra(CarrinhoDeCompras car){
        System.out.println("Total: " + car.gettotal());
    }




    
    /*public void adiciona(LivroFisico livro) {
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontode(0.05);
        total += livro.getvalor();
    }

    public void adiciona(Ebook livro) {
        System.out.println("Adicionando: " + livro);
        total += livro.getvalor();
    }*/
    


}
