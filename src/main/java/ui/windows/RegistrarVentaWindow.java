package ui.windows;

import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.NumericField;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import model.Prenda;
import model.Venta;
import ui.vm.VentaViewModel;

public class RegistrarVentaWindow extends Dialog<VentaViewModel> {

	public RegistrarVentaWindow(WindowOwner owner) {
		super(owner, new VentaViewModel());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		Panel form = new Panel(mainPanel);
		form.setLayout(new ColumnLayout(2));
		
		new Label(form).setText("Prendas");
		Selector<Prenda> selectorPrenda = new Selector<Prenda>(form).allowNull(true);
		//selectorPrenda.bindItemsToProperty("prendas");
		selectorPrenda.bindItems(new ObservableProperty("prendas")).setAdapter(new PropertyAdapter (Prenda.class,"nombre"));
		selectorPrenda.bindValueToProperty("prendaSeleccionada");
		
		new Label(form).setText("Prenda Seleccionada");
		new Label(form).setText("");
		
		new Label(form).setText("Unidades: ");
		NumericField x = new NumericField(form);
		x.bindValueToProperty("unidades");
		x.setWidth(100);
		
		new Label(form).setText("Nombre");
		new Label(form).bindValueToProperty("prendaSeleccionada.nombre");
	}

	@Override
	protected void addActions(Panel actions) {
		new Button(actions).setCaption("Aceptar").onClick(this::accept).setAsDefault();
		new Button(actions).setCaption("Cancelar").onClick(this::cancel);
	}

	@Override
	protected void executeTask() {
		this.getModelObject().registrar();
		super.executeTask();
	}

}
