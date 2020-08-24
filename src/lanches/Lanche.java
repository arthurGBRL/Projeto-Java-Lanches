package lanches;
import java.util.Scanner;

public abstract class Lanche {
	private double preco;
	Scanner sc = new Scanner(System.in);

	public double getPreco() {
		return this.preco;
	}
	
	protected void setPreco(double valor) {
		this.preco = valor;
	}
	
	public Integer setTempoEntrega(int tempoPreparo) {
		System.out.println("Qual sua distância em quilômetros do restaurante?");
		return Integer.parseInt(sc.nextLine())*10 + tempoPreparo;
	}
	
	protected abstract void getLanche();
	
	
}
