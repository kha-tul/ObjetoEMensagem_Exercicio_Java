package exercicio_1;

public class rodasAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro(); // construtor simples da classe 'Carro' vai instanciar a criação desse objeto

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 1");
        carro1.setCapacidadeTanque(54);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTaque(6.34)); //metodo de operacao

        Carro carro2 = new Carro("Cinza", "Mercedez  Benz Classe C", 86);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTaque(6.46));

    }
}
