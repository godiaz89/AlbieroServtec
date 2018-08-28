package testClasses;

import java.util.List;

public class Ots {
    private String reCom;
    private String nombre;
    private String motivo;
    private String desc;


    public Ots(String reCom, String nombre, String  motivo, String desc) {
        this.reCom = reCom;
        this.nombre = nombre;
        this.motivo=motivo;
        this.desc=desc;
    }


    public String getreCom() {
        return reCom;
    }

    public String getnombre() {
        return nombre;
    }


    public void setreCom(String reCom) {
        this.reCom = reCom;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}