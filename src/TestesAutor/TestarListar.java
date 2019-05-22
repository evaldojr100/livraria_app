package TestesAutor;

import DAO.AutorDAO;
import model.Autor;

import java.util.List;

public class TestarListar {
    public static void main(String[] args) {
        List<Autor> autores = new AutorDAO().listarTodos();

        for(Autor autor: autores){
            System.out.println("\n----------Autor "+autor.getId()+"----------");
            System.out.println("Nome:"+autor.getNome()+"\nEmail:"+ autor.getEmail());


        }
    }
}
