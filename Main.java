public class Main {
    public static void main(String[] args) {
        
        
        Autor au1 = new Autor("Alberto Marlos", 170);
        Autor au2 = new Autor("Pato Ronald", 170);

        Livro l1 = new LivroFisico(
                "Flores e Sapos",
                "A flor olhava para o sapo todos os dias, e o sapo olhava para a flor todos os dias.",
                300.00,
                "10",
                au1);

        Livro l2 = new LivroFisico(
                "Segredo Secreto",
                "Não pode contar o segredo",
                700.00,
                "11",
                au1);

        Ebook e1 = new Ebook(
                "Cola Colada",
                "As páginas estão coladas",
                900.00,
                "12",
                au1,
                "PDF");

        Ebook e2 = new Ebook(
                "Silêncio",
                "",
                5000.00,
                "13",
                au1,
                "EPUB");

        LivroDidatico ld1 = new LivroDidatico(
                "Cavaleiros do Zodiaco completo", 
                "completo!", 
                8000.0, "44", 
                au1, 
                100);

        MiniLivro ml1 = new MiniLivro("Faroeste BR", "No Oeste BR", 100, "343", au2);

        /*         
        l1.aplicaDescontode(0.10);
        l2.aplicaDescontode(0.10);
        e1.aplicaDescontode(0.10);
        e2.aplicaDescontode(0.10);

        ld1.aplicaDescontode(0.10);
        ld1.aplicaDescontoEducacional(0.50);

        
        */



        CarrinhoDeCompras car1 = new CarrinhoDeCompras();
        car1.adiciona(l2);
        car1.adiciona(l1);
        car1.adiciona(ml1);

        car1.mostra(car1);

        



    }
}
