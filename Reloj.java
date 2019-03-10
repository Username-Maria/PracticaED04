/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaut3;

/**
 *
 * @author usuario
 */
public class Reloj {

    //Atributos de la clase Reloj
    int hora, minuto, segundo;

    //Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    //Métodos para asignar valores a los atributos hora, minuto y segundo
    
    public void asignarHora(int hora) {
        this.hora = hora;
    }

    public void asignarMinuto(int minuto) {
        this.minuto = minuto;
    }

    
    public void asignarSegundo(int segundo) {    
        this.segundo = segundo;
    }
 //Métodos para devolver valores de los atributos hora, minuto y segundo

    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }
    
    //Método que incrementa 1 segundo la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (segundo + 1 > 59) ? true : false;
        cambio_h = ((cambio_m) && (minuto + 1 > 59)) ? true : false;
        minuto = (cambio_m) ? minuto + 1 : minuto;
        minuto = (minuto > 59) ? 0 : minuto;
        hora = (cambio_h) ? hora + 1 : hora;
        hora = (hora > 23) ? 0 : hora;
        segundo = (segundo + 1 > 59) ? 0 : segundo + 1;
    }
    //Método que decrementa un segundo la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (segundo - 1 < 0) ? true : false;
        cambio_h = ((cambio_m) && (minuto - 1 < 0)) ? true : false;

        minuto = (cambio_m) ? minuto - 1 : minuto;
        minuto = (minuto < 0) ? 59 : minuto;
        hora = (cambio_h) ? hora - 1 : hora;
        hora = (hora < 0) ? 23 : hora;

        segundo = (segundo - 1 < 0) ? 59 : segundo - 1;

    }
    //Método que da la hora en formato 12H
    public String hora12() {
        
        String mediodia, cadena;
        int hora12;
        mediodia = (hora >= 12) ? "PM" : "AM";
        hora12 = (hora > 12) ? hora - 12 : hora;

    //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (minuto < 10) ? "0" : "";
        cadena += minuto + ":";
        cadena += (segundo < 10) ? "0" : "";
        cadena += segundo;
        cadena += " " + mediodia;
        return cadena;

    }
    //Método que da la hora en formato 24H
    public String hora24() {
        
        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora + ":";
        cadena += (minuto < 10) ? "0" : "";
        cadena += minuto + ":";
        cadena += (segundo < 10) ? "0" : "";
        cadena += segundo;
        return cadena;

    }
}
