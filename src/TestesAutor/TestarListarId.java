package TestesAutor;

import DAO.AutorDAO;
import model.Autor;

public class TestarListarId {
    public static void main(String[] args) {
        AutorDAO d = new AutorDAO();
        Autor autor = d.Busca_id(5);
        System.out.println("ID:"+autor.getId());
        System.out.println("Nome:"+autor.getNome());
        System.out.println("Email:"+autor.getEmail());

    }
}
