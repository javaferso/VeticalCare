package Objetos;

public class Usuarios {

    private String [] name ={"Javier","Alonso","Ale"};
    private String [] pass = {"123","456","789"};

    public Usuarios(){

    }

    public Usuarios(String[] name, String[] pass) {
        this.name = name;
        this.pass = pass;
    }

    public String[] getName() {
        return name;
    }

    public Usuarios setName(String[] name) {
        this.name = name;
        return this;
    }

    public String[] getPass() {
        return pass;
    }

    public Usuarios setPass(String[] pass) {
        this.pass = pass;
        return this;
    }
}
