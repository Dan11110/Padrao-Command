package dispositivos;

public class SistemaSom {
  private int Nivel;

  public SistemaSom(int Nivel) {
    this.Nivel = Nivel;
  }

  public void Ligar(){
    System.out.println("Sistema de som Ligado");
  } 
  public void Desligar(){
    System.out.println("Sistema de Som desligado");
  } 
  public void MudarNivel(){
    System.out.println("Nível da altura do sitema: " + Nivel);
  } 
}
