package model;

import java.time.Instant;
import java.util.Date;

import org.eclipse.swt.widgets.DateTime;
import org.uqbar.commons.utils.Observable;

@Observable
public class Venta {

	private int unidades;
	private Prenda prenda;
	private Date fecha;

	public Venta(int unidades, Prenda prenda) {
		this.unidades = unidades;
		this.prenda = prenda;
		this.fecha = Date.from(Instant.now());
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public void setPrenda(Prenda prenda) {
		this.prenda = prenda;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	

}
