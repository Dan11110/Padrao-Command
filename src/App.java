import comandos.comandosLampada;
import comandos.comandosSistemaSom;
import comandos.comandosTelevisao;
import dispositivos.Lampada;
import dispositivos.SistemaSom;
import dispositivos.Televisao;
public class App {
    public static void main(String[] args){
        //Teste para a Lâmpada
        Lampada Teste = new Lampada("Azul"); // Quando criado uma nova lâmpada precisa definir uma cor para ela 
        comandosLampada ComandoLampada = new comandosLampada(Teste);
        Invoker alexa = new Invoker();
        alexa.setComando(ComandoLampada);
        alexa.botaoExecutar(); //Ligar Lâmpada
        alexa.botaoDesfazer(); //Desligar Lâmpada
        alexa.botaoMudar();    //\Mudar cor da lâmpada 
        //Daniel
        System.out.println("\n");
        //Teste para o Sitema de Som
        SistemaSom TesteSom = new SistemaSom(58);
        comandosSistemaSom ComandoSistema = new comandosSistemaSom(TesteSom);
        alexa.setComando(ComandoSistema);
        alexa.botaoExecutar(); //Ligar Sistema de Som
        alexa.botaoDesfazer(); //Desligar Sistema de Som
        alexa.botaoMudar();    //Mudar o nível do Som 
        System.out.println("\n");
        //Teste para a Televisão
        Televisao TesteTV = new Televisao("ESPN");
        comandosTelevisao ComandoTelevisao = new comandosTelevisao(TesteTV);
        alexa.setComando(ComandoTelevisao);
        alexa.botaoExecutar(); //Ligar Televisão
        alexa.botaoDesfazer(); //Desligar Televisão
        alexa.botaoMudar();    //Mudar canal televisão
    }
}
