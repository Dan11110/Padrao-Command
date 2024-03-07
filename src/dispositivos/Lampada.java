package dispositivos;

public class Lampada{
  private String cor;

  public Lampada(String cor) {
    this.cor = cor;
  }

  public void Ligar(){
    System.out.println("Lâmpada Ligada");
  } 
  public void Desligar(){
    System.out.println("Lâmpada desligada");
  } 
  public void MudarCor(){
    System.out.println("Cor atual da Lâmpada: " + cor);
  } 
}