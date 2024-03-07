package dispositivos;

public class Televisao{
  private String canal;

  public Televisao(String canal) {
    this.canal = canal;
  }

  public void Ligar(){
    System.out.println("Televisão Ligada");
  } 
  public void Desligar(){
    System.out.println("Televisão desligada");
  } 
  public void MudarCanal(){
    System.out.println("Cor atual da Televisão: " + canal);
  } 
}