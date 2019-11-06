import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Compra {

    public static void main(String[] args) {
                

        Cliente cliente = new Cliente(1, "Luciano Amaral ", 21, 8, 1994, 10);
        Cliente cliente2 = new Cliente(2, "João Felipe ", 10, 4, 1987, 10);
        Cliente cliente3 = new Cliente(3, "Brandon Krult ", 5, 4, 1990, 10);
        Cliente cliente4 = new Cliente(4, "Katia da Silva ", 8, 7, 1987, 10);
        Cliente cliente5 = new Cliente(5, "Jamal Black ", 22, 8, 1996, 10);

        Produto produto = new Produto("Chocolate branco ", 5);
        Produto produto2 = new Produto("Chocolate ao Leite ", 6);
        Produto produto3 = new Produto("Chocolete meio amargo ", 4);
        Produto produto4 = new Produto("Chocolate preto ", 4);
        Produto produto5 = new Produto("Chocolate com amendoin ", 4);
        Produto produto6 = new Produto("Caixa de bis preto ", 6);
        Produto produto7 = new Produto("Caixa de bis branco ", 6);
        Produto produto8 = new Produto("Caixa de bis Oreo ", 9);
        Produto produto9 = new Produto("Barra de chocolate preto ", 7);
        Produto produto10 = new Produto("Barra de chocolate branco ", 7);

        Carrinho carrinho = new Carrinho(cliente);



        System.out.println("Nome : " +cliente.Nome+ ", Data de Nascimento: " +cliente.Dtnasc+ ", Desconto de "+cliente.Desconto+"%");
        System.out.println("Nome : " +cliente2.Nome+ ", Data de Nascimento: " +cliente2.Dtnasc+ ", Desconto de "+cliente2.Desconto+"%");
        System.out.println("Nome : " +cliente3.Nome+ ", Data de Nascimento: " +cliente3.Dtnasc+ ", Desconto de "+cliente3.Desconto+"%");
        System.out.println("Nome : " +cliente4.Nome+ ", Data de Nascimento: " +cliente4.Dtnasc+ ", Desconto de "+cliente4.Desconto+"%");
        System.out.println("Nome : " +cliente5.Nome+ ", Data de Nascimento: " +cliente5.Dtnasc+ ", Desconto de "+cliente5.Desconto+"%");











    }



}