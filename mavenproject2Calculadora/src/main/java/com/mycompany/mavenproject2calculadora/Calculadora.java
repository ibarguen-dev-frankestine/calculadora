package com.mycompany.mavenproject2calculadora;

public class Calculadora {
    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    private double numeroUno, numeroDos, porcentaje;

    Calculadora(){
        this.numeroDos = 0;
        this.numeroUno = 0;
        this.porcentaje = 0;
    }

    public double sumar(){
        double  resultado = this.numeroUno + numeroDos;
        return resultado;
    }

    public double resta(){
        double  resultado = this.numeroUno + numeroDos;
        return resultado;
    }

    public double multiplicacion(){
        double  resultado = this.numeroUno + numeroDos;
        return resultado;
    }

    public double dividiv(){
        double  resultado = this.numeroUno + numeroDos;
        return resultado;
    }

    public double porcentaje (){
        double  resultado = this.numeroUno + numeroDos;
        return resultado;
    }
}
