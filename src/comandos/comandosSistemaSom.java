package comandos;
import dispositivos.SistemaSom;

public class comandosSistemaSom implements Command{
  private SistemaSom Sistema;

  public comandosSistemaSom(SistemaSom Sistema) {
        this.Sistema = Sistema;
    }

    public void executar(){
      Sistema.Ligar();
    }

    public void desfazer(){
      Sistema.Desligar();
    }
    public void mudar(){
      Sistema.MudarNivel();
    }
}
