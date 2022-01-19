package genioLampada;

public class BemHumorado extends Genio {

	protected int desejoDisponivel;
	protected int auxiliarGenio;

	public BemHumorado(int max) {
		super(max);
	}

	public void conceDedesejo() {
		// return
	}

	public int desejoDisponivel() {
		return getMax() - getDesejosConcedidos();
	}

}
