/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import javax.swing.JOptionPane;

public class ado {
    private double lerComprimento;

    public double lerComprimento() {
        System.out.println("Digite o comprimento do círculo: ");
        Scanner input = new Scanner(System.in);
        this.lerComprimento = input.nextDouble();
        return this.lerComprimento;
    }

    public double getDiametro(double comprimento) {
        double diametro = comprimento / 3.14;
        return diametro;
    }

    public double getRaio(double diametro) {
        double raio = diametro / 2;
        return raio;
    }

    public double getArea(double raio) {
        double area = raio * raio * 3.14;
        return area;
    }

    public void plotar(double comprimento, double diametro, double raio, double area) {
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area);
    }

    public void controle() {
        double comprimento = lerComprimento();
        double diametro = getDiametro(comprimento);
        double raio = getRaio(diametro);
        double area = getArea(raio);
        plotar(comprimento, diametro, raio, area);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.controle();
    }

}
