package genioLampada;

public abstract class Genio {
	protected int desejosConcedidos;

	protected static int max;

	// CONSTRUTOR
	public Genio() {

	}

	public abstract void concedeDesejo(int max);

	public void AcresDesejos() { // Acrescimos dos desejos.
		desejosConcedidos++;
	}

	// SETTERS E GETTERS
	public int getMax() {
		return max;
	}

	public void setMax(int aMax) {
		max = aMax;
	}

	public int getDesejosConcedidos() {
		return desejosConcedidos;
	}

	public void setDesejosConcedidos(int desejosConcedidos) {
		this.desejosConcedidos = desejosConcedidos;
	}

}
