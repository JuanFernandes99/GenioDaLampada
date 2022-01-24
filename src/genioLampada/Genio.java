package genioLampada;

public abstract class Genio {
	protected int desejosConcedidos;

	private int max;

	// CONSTRUTOR
	protected Genio(int aMax) {
		max = aMax;
	}

	public abstract void concedeDesejo();

	public void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	// SETTERS E GETTERS
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public void setDesejosConcedidos(int desejosConcedidos) {
		this.desejosConcedidos = desejosConcedidos;
	}

}
