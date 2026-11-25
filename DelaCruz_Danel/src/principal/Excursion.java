package principal;

public class Excursion {

	private String codigo;
	private Destino estado;
	private int num_part;
	private int distancia;
	private int duracionexcur;
	
	
	public Excursion(String codigo, Destino estado, int num_part, int distancia, int duracionexcur) {
		super();
		this.codigo = codigo;
		this.estado = estado;
		this.num_part = num_part;
		this.distancia = distancia;
		this.duracionexcur = duracionexcur;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Destino getEstado() {
		return estado;
	}


	public void setEstado(Destino estado) {
		this.estado = estado;
	}


	public int getNum_part() {
		return num_part;
	}


	public void setNum_part(int num_part) {
		this.num_part = num_part;
	}


	public int getDistancia() {
		return distancia;
	}


	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}


	public int getDuracionexcur() {
		return duracionexcur;
	}


	public void setDuracionexcur(int duracionexcur) {
		this.duracionexcur = duracionexcur;
	}


	@Override
	public String toString() {
		return "excursion [codigo=" + codigo + ", estado=" + estado + ", num_part=" + num_part + ", distancia="
				+ distancia + ", duracionexcur=" + duracionexcur + "]";
	}
	
	public boolean grupoCompleto() {
		return false;
	}
	
	public int obtenerVelocidadMedia() {
		return distancia / duracionexcur;
		
	}
	
	public int CalcularPrecio () {
		return 50 * num_part;
	}
	
	
}
