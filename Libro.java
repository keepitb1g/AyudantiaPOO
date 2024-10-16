import java.util.Vector;

public class Libro {
	private String _titulo;
	private String _autor;
	private long _iSBN;
	private date _fechaPublicacion;
	public Prestamo _unnamed_Prestamo_17;
	public Vector<Biblioteca> _unnamed_Biblioteca_ = new Vector<Biblioteca>();
	public Vector<Categoria> _unnamed_Categoria_ = new Vector<Categoria>();

	public String gettitulo() {
		throw new UnsupportedOperationException();
	}

	public void setTitulo(String aTitulo) {
		this._titulo = aTitulo;
	}

	public String getAutor() {
		return this._autor;
	}

	public void setAutor(String aAutor) {
		this._autor = aAutor;
	}

	public long getISBN() {
		return this._iSBN;
	}

	public date getFechaPublicacion() {
		return this._fechaPublicacion;
	}

	public void setFechaPublicacion(date aFechaPublicacion) {
		this._fechaPublicacion = aFechaPublicacion;
	}
}