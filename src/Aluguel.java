

public class Aluguel extends Cliente  {
    public int dias;    
    public Carro carro;
    public double valor;

    public Aluguel(Cliente cliente, Carro carro, int dias) {       
        super(cliente.tipoCliente);
        this.carro=carro;
        this.dias=dias;
       
    }
   
    public double precoFinal(){        
        if(this.tipoCliente=="física" & dias>=5){
          valor= carro.precoCarro()- carro.precoCarro()*0.05; 
        }else if (this.tipoCliente=="jurídica"& dias>=3){
             valor= carro.precoCarro()- carro.precoCarro()*0.10; 
        } else{return 0;}

        return valor;
        
     }
    
    
}
