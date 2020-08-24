package lanches;
import java.util.ArrayList;
import java.util.Scanner;

public class Sanduiche extends Pedido{
	private ArrayList<String> igredientes = new ArrayList<String>();
	private Integer tempoEntrega;
	
	Scanner sc = new Scanner(System.in);
	
	public Sanduiche() {
		super();
		getLanche();
	}
	
	private void precificar() {
		setPreco(igredientes.size()*5);
	}
	
	
	
	private void adicionarIgredientes() {
		String igrediente;
		int escolha;
		for(int i = 0; i<10; i++) {
			System.out.println("Quer adicionar algum igrediente?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			escolha = Integer.parseInt(sc.nextLine());
			if(escolha == 1) {
				System.out.println("Selecione o "+(i+1)+"º igrediente:");				
				igrediente = sc.nextLine();
				igredientes.add(igrediente);
			}
			else {
				break;
			}
			
		}
	}

	@Override
	protected void getLanche() {
		adicionarIgredientes();
		super.setTempoEntrega(15);
		precificar();
		System.out.println("Lanche escolhido: ");
		System.out.println("Sanduíche");
		for(int i =0 ; i<igredientes.size();i++) {
			System.out.println("com "+igredientes.get(i));
		}
		System.out.println("Preço: "+this.getPreco());
		System.out.println("Tempo de Entrega: "+ this.tempoEntrega + "minutos");
	}
	
}
