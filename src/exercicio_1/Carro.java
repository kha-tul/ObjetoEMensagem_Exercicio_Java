package exercicio_1;

public class Carro {

    //atributos

    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor simples
    Carro () {

    }
// ** fim construtor

    // construtor com parâmetros - sobrecarga
    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor; // atributos que pertecem a objetos (remover abiguidade)
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    // ** fim construtor com parametros

    // Valores dos atributos

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //metodo para calcular o total do tanque

    double totalValorTaque(double valorCombustivel) {
        return capacidadeTanque = (int) valorCombustivel;

    }

}
