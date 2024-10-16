import java.util.Vector;

public class Biblioteca {
	private String _nombre;
	private String _direccion;
	public Vector<Libro> _unnamed_Libro_ = new Vector<Libro>();
	public Vector<Empleado> _unnamed_Empleado_ = new Vector<Empleado>();

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public void getDireccion() {
		throw new UnsupportedOperationException();
	}

	public void setDireccion(Object aDireccion) {
		throw new UnsupportedOperationException();
	}

	public void agregarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void modificarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void realizarPrestamo(Usuario aUsuario, Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void registrarDevolucion(Prestamo aPrestamo) {
		throw new UnsupportedOperationException();
	}

	public void generarMulta(Prestamo aPrestamo) {
		throw new UnsupportedOperationException();
	}

	public void agregarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void elimnarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void crearCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void editarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void pagarMulta(Usuario aUsuario, Multa aMulta) {
		throw new UnsupportedOperationException();
	}

	public void eliminarMulta(Usuario aUsuario, Multa aMulta) {
		throw new UnsupportedOperationException();
	}
}