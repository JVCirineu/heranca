package heranca;

public class Sorvete extends Produto{
	private double tempAdeq;

	public Sorvete(long id, String nome, double preco, double tempAdeq) {
		super(id, nome, preco);
		this.tempAdeq = tempAdeq;
	}

	public double getTempAdeq() {
		return tempAdeq;
	}

	public void setTempAdeq(double tempAdeq) {
		this.tempAdeq = tempAdeq;
	}
	
	
}
