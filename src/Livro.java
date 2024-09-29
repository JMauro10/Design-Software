public class Livro {
    
        private static int contadorId = 1;  
        private int id;
        private String titulo;
        private String autor;
        private String edicao;
    
        
        public Livro(String titulo, String autor, String edicao) {
            this.id = contadorId++;
            this.titulo = titulo;
            this.autor = autor;
            this.edicao = edicao;
        }
    
        
        public int getId() {
            return id;
        }
    
        public String getTitulo() {
            return titulo;
        }
    
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        public String getAutor() {
            return autor;
        }
    
        public void setAutor(String autor) {
            this.autor = autor;
        }
    
        public String getEdicao() {
            return edicao;
        }
    
        public void setEdicao(String edicao) {
            this.edicao = edicao;
        }
    
        @Override
        public String toString() {
            return "Livro{" +
                    "\nID=" + id +
                    ", \nTítulo='" + titulo + '\'' +
                    ", \nAutor='" + autor + '\'' +
                    ", \nEdição='" + edicao + '\'' +
                    '}';
        }
    }
    



