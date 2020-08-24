package lanches;

public class Pedido extends Lanche{
	
	public void pedirLanche() {
		System.out.println("Qual tipo de lanche quer?");
		System.out.println("1 - Sanduíche");
		System.out.println("2 - Massa");
		System.out.println("3 - Bolo");
		int escolha = Integer.parseInt(sc.nextLine());
		switch (escolha){
	        case 1:
	        	Lanche sanduiche = new Sanduiche();
	            break;
	        case 2:
	        	Lanche massa = new Massa();
	            break;
			case 3:
				Lanche bolo = new Bolo();
	        	break;
	        default:
	        	System.out.println("Escolha inválida! Tente novamente!");
				pedirLanche();
			}
	}

	@Override
	protected void getLanche() {
		
	}

}
