package model;

import java.util.Random;

public class Controller {

    private Equipo[] equipos;
    private Arbitro[] arbitros;

    private final int CANTIDAD_EQUIPOS = 4;
    private final int CANTIDAD_ARBITROS = 4;

    private int contadorEquipos = 0;

    /**
     * Constructor de la clase Controller para inicializar variables globales.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller con un arreglo de personas vacío.
     */
    public Controller() {
        equipos = new Equipo[CANTIDAD_EQUIPOS];
        arbitros = new Arbitro[CANTIDAD_ARBITROS];
    }

    public String fixture() {
        String fixture = "";
        Random random = new Random();
        int equipo1 = random.nextInt(4);
        int equipo2;
        do {
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 1: Equipo " + equipo1 + " vs Equipo " + equipo2;
        fixture += "\n";

        do {
            equipo1 = random.nextInt(4);
            equipo2 = random.nextInt(4);
        } while (equipo2 == equipo1);

        fixture += "Partido 2: Equipo " + equipo1 + " vs Equipo " + equipo2;
        return fixture;
    }
    public void PrecargarInformacion(){
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();
        
        ArbitroPrincipal arbritop1 = new ArbitroPrincipal("Jesus", 45);
        ArbitroPrincipal arbritop2 = new ArbitroPrincipal("Jeremias", 32);
        JuezDeLinea juez1 = new JuezDeLinea("Monica", 38);
        JuezDeLinea juez2 = new JuezDeLinea("Conan", 57);

        equipo1.agregarJugador(new JugadorHockey("Sebastian", 19, Posicion.PORTERO), 0);
        equipo1.agregarJugador(new JugadorHockey("thomas", 20, Posicion.DEFENSA), 1);
        equipo1.agregarJugador(new JugadorHockey("Deivid", 21, Posicion.ALA), 2);
        equipo1.agregarJugador(new JugadorHockey("Laura", 18, Posicion.ALA), 3);
        equipo1.agregarJugador(new JugadorHockey("Pablo", 22, Posicion.CENTRO), 4);
        equipo1.agregarJugador(new JugadorHockey("william", 10, Posicion.DEFENSA), 5);

        equipo2.agregarJugador(new JugadorHockey("David", 19, Posicion.PORTERO), 0);
        equipo2.agregarJugador(new JugadorHockey("Pedro", 19, Posicion.PORTERO), 0);
        equipo2.agregarJugador(new JugadorHockey("martin", 20, Posicion.DEFENSA), 1);
        equipo2.agregarJugador(new JugadorHockey("Jose", 21, Posicion.ALA), 2);
        equipo2.agregarJugador(new JugadorHockey("Marcos", 18, Posicion.ALA), 3);
        equipo2.agregarJugador(new JugadorHockey("Jham", 22, Posicion.CENTRO), 4);
        equipo2.agregarJugador(new JugadorHockey("Jorge", 10, Posicion.DEFENSA), 5);


        
    }
    public void PaseJugadores(){
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int numJug1 = random.nextInt(5);
            int numJug2 = random.nextInt(5);
            System.out.println("El jugador" + numJug1 + equipos[random.nextInt(5)].getJugadores()[numJug1] + "se la da al jugador " + numJug1 + equipos[random.nextInt(5)].getJugadores()[numJug1]);
            
        }
        
    }
   

    public void DesplazamentoArbitros(){

    }
    
    public String GenerarPartido(){

        return "ADs";
    }

    
}