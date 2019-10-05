package es.esy.contacontes.kontakontes.Microrelats;

/**
 * Created by Oriol.
 */

public class MrConte { //Creació de la classe
    private int foto;
    private String txt;
    private String mc;

    public MrConte(int foto, String txt, String mc) { //Construcció de l'objecte
        this.foto = foto;
        this.txt = txt;
        this.mc = mc;

    }

    public int getFoto() {
        return foto;
    } //Per consultar la variable

    public void setFoto(int foto) {
        this.foto = foto;
    } //Per ficar nosaltres l'id de a foto

    public String getTxt() {
        return txt;
    } //Per consultar la variable

    public void setTxt(String txt) {
        this.txt = txt;
    } //Per ficar nosaltres el text/String

    public String getMc() { //Per consultar la variable
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    } //Per ficar nosaltrse el text/String
}

