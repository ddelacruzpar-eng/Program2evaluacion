package principal;

public class ExcursionBuceo extends Excursion {
	private boolean certificado;
	private double profundidadmax;
	private boolean alquiler;
	
	public ExcursionBuceo(String codigo, Destino estado, int num_part, int distancia, int duracionexcur,
			boolean certificado, double profundidadmax, boolean alquiler) 
	{
		super(codigo, estado, num_part, distancia, duracionexcur);
		this.certificado = certificado;
		this.profundidadmax = profundidadmax;
		this.alquiler = alquiler;
		
		
	}

	public boolean isCertificado() {
		return certificado;
	}

	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}

	public double getProfundidadmax() {
		return profundidadmax;
	}

	public void setProfundidadmax(double profundidadmax) {
		this.profundidadmax = profundidadmax;
	}

	public boolean isAlquiler() {
		return alquiler;
	}

	public void setAlquiler(boolean alquiler) {
		this.alquiler = alquiler;
		
	}

	@Override
	public String toString() {
		return super.toString()+ "\nExcursionBuceo [certificado=" + certificado + ", profundidadmax=" + profundidadmax + ", alquiler="
				+ alquiler + "]";
	
	}
	
	public int alquiler () {
		return 100 * num_part;
	}
	
	public int CalcularPrecio
}
