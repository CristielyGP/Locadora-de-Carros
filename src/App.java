public class App {
    public static void main(String[] args) throws Exception {


        Carro carro=new Carro("SUV");
        Cliente cliente = new Cliente("jurídica");

        Aluguel aluguel=new Aluguel(cliente,carro,1);
        System.out.println(carro.precoCarro());
        System.out.println(aluguel.precoFinal());
       



    }
}
