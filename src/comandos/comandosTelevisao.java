package comandos;
import dispositivos.Televisao;

public class comandosTelevisao implements Command{
  private Televisao TV;

  public comandosTelevisao(Televisao TV) {
        this.TV = TV;
    }

    public void executar(){
      TV.Ligar();
    }

    public void desfazer(){
      TV.Desligar();
    }
    public void mudar(){
      TV.MudarCanal();
    }
}
