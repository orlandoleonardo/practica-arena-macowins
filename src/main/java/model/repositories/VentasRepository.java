package model.repositories;

import java.util.ArrayList;
import java.util.List;

import model.Venta;

public class VentasRepository {

	private List<Venta> ventas = new ArrayList<>();
	static VentasRepository repo = null;
	public static VentasRepository getInstance() {
		if (repo != null)
			return repo;
		repo = new VentasRepository();
		return repo;
	}
	public List<Venta> all() {
		return this.ventas;
	}
	public void add(Venta v) {
		ventas.add(v);
	}
}
