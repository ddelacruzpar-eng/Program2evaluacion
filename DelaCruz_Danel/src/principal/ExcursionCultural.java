package principal;

public class ExcursionCultural extends Excursion {
	private boolean estudiantes;

	public ExcursionCultural(String codigo, Destino estado, int num_part, int distancia, int duracionexcur,
			boolean estudiantes) {
		super(codigo, estado, num_part, distancia, duracionexcur);
		this.estudiantes = estudiantes;
	}
}
