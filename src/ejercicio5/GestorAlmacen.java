package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class GestorAlmacen {
    private List<String> productos = new ArrayList<>();
    
    public static final int add = 1000;
	public static final int remove = 2000;
	
    public void ManejarProducto(String producto, int operacion) throws Exception {
    	
    	if(productos.contains(producto)&&operacion==remove) {
    		productos.remove(producto);
    	}
    	else if(!productos.contains(producto)&&operacion==add) {
    		productos.add(producto);  		
    	}
    	else if(operacion==add) {
    		throw new Exception("Imposible añadir, el producto ya está");
    	}
    	else if(operacion==remove) {
    		throw new Exception("Imposible borrar, el producto no está");
    	}
    	else throw new Exception("Operacion no soportada");
    	
    }

}
