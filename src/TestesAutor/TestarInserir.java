package TestesAutor;

import DAO.AutorDAO;
import model.Autor;

public class TestarInserir {
    public static void main(String[] args) {
        Autor a = new Autor();
        a.setNome("Evaldo");
        a.setEmail("evaldo@ifro.edu.br");
        new AutorDAO().inserir(a);
    }


}
