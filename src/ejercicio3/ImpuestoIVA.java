package ejercicio3;

public abstract class ImpuestoIVA extends CalculadoraImpuestos{

	public double CalcularIva(double ingresos) {

		double impuesto;

		if (ingresos < 10000) {
			impuesto = ingresos * 0.10;
		} else if (ingresos >= 10000 && ingresos < 50000) {
			impuesto = ingresos * 0.15;
		} else {
			impuesto = ingresos * 0.20;
		}

		return impuesto;
	}
}



