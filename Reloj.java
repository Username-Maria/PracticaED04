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

    private int HH;

    int HH,
    private int MM;

    //Atributos de la clase Reloj
    int HH, MM, SS;
    private int dia;
    int  ;
    private int SS;
    int dia;
    int mes;
    private int mes;

    //Constructor con parámetros
    public Reloj(int HH, int MM, int SS, int dia, int mes) {
        this.HH = HH;
        this.MM = MM;
        this.SS = SS;
        this.dia = dia;
        this.mes = mes;
    }
    //Métodos para asignar valores a los atributos hora, minuto y segundo

    public void asignarHora(int HH) {
        this.HH = HH;
    }

    public void asignarMinuto(int MM) {
        this.MM = MM;
    }

    public void asignarSegundo(int SS) {
        this.SS = SS;
    }
    
    public void asignarDia(int dia) {
        this.dia= dia;
    }
    
    public void asignarMes(int mes) {
        this.mes = mes;
    }
    
    //Métodos para devolver valores de los atributos hora, minuto y segundo

    public int obtenerHora() {
        return HH;
    }

    public int obtenerMinuto() {
        return MM;
    }

    public int obtenerSegundo() {
        return SS;
    }
    
    public int obtenerDia() {
        return dia;
    }
    
    public int obtenerMes() {
        return mes;
    }

    //Método que incrementa 1 segundo la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (SS + 1 > 59) ? true : false;
        cambio_h = ((cambio_m) && (MM + 1 > 59)) ? true : false;
        MM = (cambio_m) ? MM + 1 : MM;
        MM = (MM > 59) ? 0 : MM;
        HH = (cambio_h) ? HH + 1 : HH;
        HH = (HH > 23) ? 0 : HH;
        SS = (SS + 1 > 59) ? 0 : SS + 1;
    }

    //Método que decrementa un segundo la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (SS - 1 < 0) ? true : false;
        cambio_h = ((cambio_m) && (MM - 1 < 0)) ? true : false;

        MM = (cambio_m) ? MM - 1 : MM;
        MM = (MM < 0) ? 59 : MM;
        HH = (cambio_h) ? HH - 1 : HH;
        HH = (HH < 0) ? 23 : HH;

        SS = (SS - 1 < 0) ? 59 : SS - 1;

    }

    //Método que da la hora en formato 12H
    public String hora12() {

        String mediodia, cadena;
        int hora12;
        mediodia = (HH >= 12) ? "PM" : "AM";
        hora12 = (HH > 12) ? HH - 12 : HH;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        cadena += " " + mediodia;
        return cadena;

    }

    //Método que da la hora en formato 24H
    public String hora24() {

        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = HH + ":";
        cadena += (MM < 10) ? "0" : "";
        cadena += MM + ":";
        cadena += (SS < 10) ? "0" : "";
        cadena += SS;
        return cadena;

    }

    //Metodos getter y setter
    
    public int getHH() {
        return HH;
    }

    public void setHH(int HH) {
        this.HH = HH;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getSS() {
        return SS;
    }

    public void setSS(int SS) {
        this.SS = SS;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }  
}
