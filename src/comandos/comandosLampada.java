package comandos;
import dispositivos.Lampada;
public class comandosLampada implements Command{
  private Lampada Lampada;

    public comandosLampada(Lampada Lampada) {
        this.Lampada = Lampada;
    }

    public void executar(){
      Lampada.Ligar();
    }

    public void desfazer(){
      Lampada.Desligar();
    }
    public void mudar(){
      Lampada.MudarCor();
    }
}