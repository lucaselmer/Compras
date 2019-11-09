

public class Veiculo {
    int velocidade=0;
    int velocidadeMax=150;
    int roda=4;
    String marca = "";
    String modelo = "";



    Veiculo(String marca, String modelo){
        this(marca,modelo,150,4);
    }


    Veiculo(String marca, String modelo, int velocidadeMax, int roda){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax= velocidadeMax;
        this.roda= roda;
    }

    void acelerar(int velocidade){
        if (this.velocidade + velocidade >= this.velocidadeMax ){
            this.velocidade=this.velocidadeMax;
        }
        else{
            this.velocidade += velocidade;
        }
    }

    void freiar(int velocidade){
        if (this.velocidade - velocidade <= 0 ){
            this.velocidade=0;
        }
        else{
            this.velocidade -= velocidade;
        }
    }
    
}