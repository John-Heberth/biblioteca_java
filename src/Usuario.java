import java.util.ArrayList;
import java.util.List;

class Usuario {

    private int id;
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            livrosEmprestados.add(livro);
        } else {
            System.out.println("O livro já foi emprestado para o usuario: (id= " + id + ", nome= " + nome +")" );
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            livro.devolver();
            livrosEmprestados.remove(livro);
        } else {
            System.out.println("Este livro não foi emprestado para o usuário: (id= " + id + ", nome= " + nome + ", livrosEmprestados= " + livrosEmprestados +")" );
        }
    }

    @Override
    public String toString() {
        return "Usuario (id=" + id + ", nome=" + nome + ", livrosEmprestados= " + livrosEmprestados + ")";
    }
}