public class Revenda {

    public static void main(String[] args) {
        
        Carro c1 = new Carro("Honda", "Honda civic");
        Moto m1= new Moto("Yamaha", "XJ6");
    
        c1.acelerar(10);
        m1.acelerar(20);
        m1.acelerar(20);
        m1.acelerar(20);
    

        System.out.println(c1.velocidade);
        System.out.println(m1.velocidade);

    }

}