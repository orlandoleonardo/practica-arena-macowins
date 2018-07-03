package ui.vm;
import java.util.List;

import org.uqbar.commons.utils.Dependencies;
import org.uqbar.commons.utils.Observable;

import model.Venta;
import model.repositories.VentasRepository;

@Observable
public class AlgoViewModel {
	
	 private VentasRepository ventas;
	
	public AlgoViewModel() {
		super();
		ventas = VentasRepository.getInstance();
	}
	
	@Dependencies("ventas")
	public List<Venta> getVentas(){
		return ventas.all();
	}

}
