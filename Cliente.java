import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {

    int Clienteid;
    String Nome;
    Date Dtnasc;
    double Desconto;
    
    List<Carrinho> carrinhos = new ArrayList<>();


    Cliente(int Clienteid, String Nome, int date, int month, int year, double Desconto ){
        Calendar calendario = Calendar.getInstance();
        this.Clienteid = Clienteid;
        this.Nome = Nome;
        calendario.set(year, month, date);
        this.Dtnasc = calendario.getTime();
        this.Desconto = Desconto;
    }


    


}