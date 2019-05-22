package TestesAutor;

import DAO.AutorDAO;

public class TestarDeletar {
    public static void main(String[] args) {
        AutorDAO aut = new AutorDAO();
        aut.deletar(14);
    }


}
