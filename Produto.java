import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Produto {

    String Nomeproduto;
    double Valor;
    int Quantidade;

    Produto(String Nomeproduto, double Valor){
        this.Nomeproduto = Nomeproduto;
        this.Valor = Valor;

    }

    
    
    void addProduto (Produto produto){
        this.produto.add(produto);

    }

    int quantidadedecompras(){
        return this.produto.size();
    }



}