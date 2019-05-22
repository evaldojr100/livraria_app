package model;

public class Municipio {
    private int id;
    private String nome;
    private Estado estado_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Estado estado_id) {
        this.estado_id = estado_id;
    }
}
