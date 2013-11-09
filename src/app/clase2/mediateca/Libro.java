/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.clase2.mediateca;

/**
 *
 * @author user
 */
public class Libro extends Soporte {

    private String autor;
    private int paginas;
    private String isbn;

    public Libro(String titulo, String autor, int paginas, String isbn) {
        this.setMaximoDiasPrestamos(15);
        this.setPrecioDiaPrestamo(5.0);
        this.setTitulo(titulo);
        this.autor = autor;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
