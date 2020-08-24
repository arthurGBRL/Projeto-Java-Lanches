package lanches;

public class Bolo extends Pedido{
	private String massa;
	private String recheio;
	private String cobertura;
	private Integer tempoEntrega;

	
	public Bolo() {
		super();
		getLanche();
	}
	
	private void setMassa() {
		System.out.println("Que tipo de massa você deseja?");
		massa = sc.nextLine();
	}
	private void setRecheio() {
		System.out.println("Que tipo de recheio você deseja?");
		recheio = sc.nextLine();
	}
	private void setCobertura() {
		System.out.println("Que tipo de cobertura você deseja?");
		cobertura = sc.nextLine();
	}
	
	private void precificar() {
		setPreco(20);
	}
	
	@Override
	protected void getLanche() {
		setMassa();
		setRecheio();
		setCobertura();
		super.setTempoEntrega(10);
		precificar();
		System.out.println("Lanche escolhido: Bolo com massa de "+this.massa+", recheio de "+this.recheio+" e cobertura de "+this.cobertura);
		System.out.println("Preço: "+this.getPreco());
		System.out.println("Tempo de Entrega: "+ this.tempoEntrega + "minutos");
	}

}
