import java.util.Vector;

public class Multa {
	private float _monto;
	private date _fechaGeneracio;
	private EstadoMulta _estado;
	public Prestamo _unnamed_Prestamo_2;
	public Vector<Usuario> _unnamed_Usuario_ = new Vector<Usuario>();

	public float getMonto() {
		return this._monto;
	}

	public void setMonto(float aMonto) {
		this._monto = aMonto;
	}

	public date getFechaGeneracion() {
		throw new UnsupportedOperationException();
	}

	public void setFechaGeneracion(date aFechaGeneracion) {
		throw new UnsupportedOperationException();
	}

	public EstadoMulta getEstado() {
		return this._estado;
	}

	public void setEstado(EstadoMulta aEstado) {
		this._estado = aEstado;
	}

	public void pagar() {
		throw new UnsupportedOperationException();
	}

	public void eliminar() {
		throw new UnsupportedOperationException();
	}
}