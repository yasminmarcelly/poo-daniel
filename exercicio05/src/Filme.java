public class Filme {
    private String titulo;
    private String genero;
    private int anoLancamento;

    public Filme(String titulo, String genero, int anoLancamento){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }

    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = 0;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }

    public String toString(){
        return "\nTitle: " + titulo + "\nGenre: " + genero + "\nRelease Date: " + anoLancamento;
    }
}
