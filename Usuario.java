import java.util.Vector;

public class Usuario {
	private String _nombre;
	private String _identificacion;
	public Vector<Prestamo> _unnamed_Prestamo_ = new Vector<Prestamo>();
	public Multa _unnamed_Multa_;

	public void getNombre() {
		throw new UnsupportedOperationException();
	}

	public void setNombre(Object aNombre) {
		throw new UnsupportedOperationException();
	}

	public void getIdentificacion() {
		throw new UnsupportedOperationException();
	}

	public void setIdentificacion(long aIdentificacion) {
		throw new UnsupportedOperationException();
	}

	public Prestamo realizarPrestamo(Libro aLibro, Biblioteca aBiblioteca) {
		throw new UnsupportedOperationException();
	}

	public void registrarDevolucion() {
		throw new UnsupportedOperationException();
	}

	public void solicitarPagoMulta(Multa aMulta) {
		throw new UnsupportedOperationException();
	}
}