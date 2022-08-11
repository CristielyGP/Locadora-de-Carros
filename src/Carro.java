public class Carro {   

    String tipoCarro;
    double valor;

    public Carro(String tipo) {
        this.tipoCarro = tipo;        
    }

    public double precoCarro (){      
        if(this.tipoCarro=="pequeno"){
            valor=100;
        }else if(this.tipoCarro=="médio"){
            valor=150;
        }else if(this.tipoCarro=="SUV"){
            valor=200;
        }else{System.out.println("Insira um tipo de carro válido");}

        return valor;

    }
}
