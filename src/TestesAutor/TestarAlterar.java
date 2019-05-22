package TestesAutor;

import DAO.AutorDAO;
import model.Autor;

public class TestarAlterar {
    public static void main(String[] args) {
        Autor autor = new Autor();
        AutorDAO aut = new AutorDAO();
        autor.setId(5);
        autor.setNome("Varela Helton");
        autor.setEmail("varela@autor.com");
        aut.alterar(autor);

    }
}
