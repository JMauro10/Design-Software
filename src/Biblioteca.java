import java.util.ArrayList;



    public class Biblioteca {
        private ArrayList<Livro> livros;
    
        public Biblioteca() {
            livros = new ArrayList<>();
        }
    
        
        public void adicionarLivro(Livro livro) {
            livros.add(livro);
            System.out.println("Livro adicionado com sucesso. ID: " + livro.getId());
        }
    
        
        public void listarLivros() {
            if (livros.isEmpty()) {
                System.out.println("Nenhum livro cadastrado.");
            } else {
                for (Livro livro : livros) {
                    System.out.println(livro);
                }
            }
        }
    
        
        private Livro buscarLivroPorId(int id) {
            for (Livro livro : livros) {
                if (livro.getId() == id) {
                    return livro;
                }
            }
            return null;  
        }
    
        
        public void editarLivro(int id, String novoTitulo, String novoAutor, String novaEdicao) {
            Livro livro = buscarLivroPorId(id);
            if (livro != null) {
                livro.setTitulo(novoTitulo);
                livro.setAutor(novoAutor);
                livro.setEdicao(novaEdicao);
                System.out.println("Livro com ID " + id + " editado com sucesso.");
            } else {
                System.out.println("Livro com ID " + id + " não encontrado.");
            }
        }
    
        
        public void removerLivro(int id) {
            Livro livro = buscarLivroPorId(id);
            if (livro != null) {
                livros.remove(livro);
                System.out.println("Livro com ID " + id + " removido com sucesso.");
            } else {
                System.out.println("Livro com ID " + id + " não encontrado.");
            }
        }
    }
    

