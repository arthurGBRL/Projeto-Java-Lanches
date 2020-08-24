package lanches;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Massa extends Pedido{
	private final List<String> tiposLista =  Arrays.asList("Macarrão", "Pizza", "Lasanha");
	private String tipo;
	private String molho;
	private Integer tempoEntrega;
	Scanner teclado = new Scanner(System.in);
	
	public Massa() {
		super();
		getLanche();
	}
	
	public void precificar() {
		switch(this.tiposLista.indexOf(this.tipo)+1) {
			case 1:
				this.setPreco(30.0);
				break;
			case 2:
				this.setPreco(25.0);
				break;
			case 3:
				this.setPreco(20.0);
				break;
			default:
				break;
		}
	}
	
	
	public void setTipo() {
		System.out.println("Que tipo de massa você quer?");
		System.out.println("1 - Macarrão R$ 30.00");
		System.out.println("2 - Pizza R$ 25.00");
		System.out.println("3 - Lasanha R$ 20.00");
		int escolha = Integer.parseInt(teclado.nextLine());
		if(escolha > 0 && escolha < 4) {
			this.tipo = tiposLista.get(escolha-1);
		}
		else {
			System.out.println("Escolha inválida! Tente novamente!");
			setTipo();
		}
	}
	
	public void setMolho() {
		System.out.println("Que tipo de molho você deseja?");
		molho = teclado.nextLine();
	}
	
	@Override
	public void getLanche() {
		setTipo();
		setMolho();
		super.setTempoEntrega(30);
		precificar();
		System.out.println("Lanche escolhido: "+ this.tipo +" ao molho "+ this.molho);
		System.out.println("Preço: "+this.getPreco());
		System.out.println("Tempo de Entrega: "+ this.tempoEntrega + "minutos");
	}

	

}
