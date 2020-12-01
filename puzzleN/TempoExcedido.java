package puzzleN;

public class TempoExcedido extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TempoExcedido() {
		super("N alto demais! Muito processamento necessario para essas interacoes :(");
	}
	
	

}