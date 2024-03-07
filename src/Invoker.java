import comandos.Command;

public class Invoker { 

	Command slot;

	public Invoker() {
	}

	public void setComando(Command commando) { //Preferi criar um setComando porque ai só vou precisar criar um Invoker e chamar o mesmo várias vezes.
		slot = commando;												//Acho que se eu colocasse como construtor ia ter que criar um invoker a cada comando novo 			
	}

	public void botaoExecutar() {  // Função para executar o comando
		slot.executar();
	}
	public void botaoDesfazer() {  // Função para desfazer o comando
		slot.desfazer();
	}
	public void botaoMudar() {     // Função para "alterar" a configuração do dispositivo
		slot.mudar();
	}
}