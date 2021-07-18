package model;

public class Formador {
    private String name;
    private int code;


    public Formador(String name, int code) {
        super();
        this.code=code;
        this.name=name;
    }
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }

}
