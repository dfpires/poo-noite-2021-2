package lista3.redesocial;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(){

    }
    public Usuario(String login, String senha){
        this.setLogin(login);
        this.setSenha(senha);
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getLogin(){
        return this.login;
    }
    public String getSenha(){
        return this.senha;
    }
    public String toString(){
        return "\n Login: " + this.login + " Senha: " + this.senha;
    }
}
