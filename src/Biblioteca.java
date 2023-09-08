
public class Biblioteca {
    public static void main(String[] args) {
        // Criando alguns livros
        Livro livro1 = new Livro(1, "Java Programming", "John Smith");
        Livro livro2 = new Livro(2, "Introduction to Algorithms", "Thomas Cormen");
        Livro livro3 = new Livro(3, "Design Patterns", "Erich Gamma");

        // Criando alguns usuários
        Usuario usuario1 = new Usuario(1, "Alice");
        Usuario usuario2 = new Usuario(2, "Bob");
        Usuario usuario3 = new Usuario(3,"Leticia");


        // Empréstimo de livros
        usuario1.emprestarLivro(livro1);
        usuario1.emprestarLivro(livro2);
        usuario2.emprestarLivro(livro3);
        usuario3.emprestarLivro(livro3);

        // Devolução de livros
        usuario1.devolverLivro(livro1);
        usuario2.devolverLivro(livro1);

        // Exibindo informações relevantes
        System.out.println("\nInformações dos livros:");
        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);

        System.out.println("\nInformações dos usuários:");
        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
    }
}