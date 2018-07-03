package ui.vm;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import model.Prenda;
import model.Venta;
import model.repositories.Repositorios;
import model.repositories.VentasRepository;

@Observable
public class VentaViewModel {

	private List<Prenda> prendas;
	private Prenda prendaSeleccionada;
	private int unidades;

	public VentaViewModel() {
		this.prendas = Repositorios.prendas.all();
	}

	public Prenda getPrendaSeleccionada() {
		return prendaSeleccionada;
	}

	public void setPrendaSeleccionada(Prenda prendaSeleccionada) {
		this.prendaSeleccionada = prendaSeleccionada;
	}

	public List<Prenda> getPrendas() {
		return prendas;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public void registrar() {
		VentasRepository.getInstance().add(new Venta(unidades, prendaSeleccionada));
		
	}
	
	

}
