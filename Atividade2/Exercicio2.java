package Atividade2;

public class Exercicio2 {

    private double celsius, fahrenheit;


    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return this.celsius;
    }

    public double celciusToFahrenheit() {
        this.fahrenheit = (getCelsius()*1.8)+32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        Exercicio2 conversao = new Exercicio2();
        conversao.setCelsius(25);
        System.out.println(conversao.celciusToFahrenheit());
        conversao.setCelsius(-10);
        System.out.println(conversao.celciusToFahrenheit());

    }
}