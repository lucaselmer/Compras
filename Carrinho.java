import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Carrinho {

    
    Date datacompra;
    
    List<Carrinho> carrinhos = new ArrayList<>();

    Carrinho(Cliente cliente){
        Calendar calendario = Calendar.getInstance();
        this.datacompra = calendario.getTime();
        this.cliente = cliente;
        cliente.carrinhos.add(this);
    }
    
    float valortotal(){
        float valortotal = 0;

        for(Produto produto:produtos){
            valortotal += produto.valorloc;
        }
        return(valortotal);    
    }
    
}