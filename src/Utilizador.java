package src;

public class Utilizador {
    private String nome_utilizador;
    private String password;
    private char tipoDeUser;

    public Utilizador(){
        this.nome_utilizador = "";
        this.password = "";
        this.tipoDeUser = ' ';
    }

    public Utilizador(String nu, String pass, char tipo){
        this.nome_utilizador = nu;
        this.password = pass;
        this.tipoDeUser = tipo;
    }

    public Utilizador(Utilizador u){
        this.nome_utilizador = u.getNome_utilizador();
        this.password = u.getPassword();
        this.tipoDeUser = u.getTipoDeUser();
    }

    public String getNome_utilizador() {
        return this.nome_utilizador;
    }

    public void setNome_utilizador(String nome_utilizador) {
        this.nome_utilizador = nome_utilizador;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getTipoDeUser() {
        return this.tipoDeUser;
    }

    public void setTipoDeUser(char tipoDeUser) {
        this.tipoDeUser = tipoDeUser;
    }
}
//premium, normal e admin vao ser extends?
