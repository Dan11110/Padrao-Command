package comandos;

public interface Command{
  public void executar();
  public void desfazer();
  public void mudar();
}