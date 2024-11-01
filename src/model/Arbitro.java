package model;

public abstract class Arbitro extends Persona implements IDesplazarseEnPistaSinPalo  {

    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public String desplazarse() {
        return nombre + " se desplaza en la pista como árbitro.";
    }

}




/* 
public class Arbitro extends DesplazarseEnPistaSinPalo implements Persona  {
    public Arbitro(String nombre, int edad) {
        super(nombre, edad);
    }

    public String desplazarse() {
        return nombre + " se desplaza en la pista como árbitro.";
    }
}
*/