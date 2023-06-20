package retaurantesmalaga;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import restaurantemalaga.model.Restaurante;

public class MainRestaurante {

private static final String RUTA_FICHERO = "restaurante.txt";
	
	public static List<Restaurante> cargarRestaurantes (List<String> lineas)
	{
		List<Restaurante> lRestaurantes = null;
		int numlinea = 0;
		Restaurante restauranteAux = null; //el restaurante en curso
		
		lRestaurantes = new ArrayList<>();
		
			restauranteAux = new Restaurante();//creo el restaurante vacío
			for (String linea : lineas) {
				numlinea = numlinea + 1;
				switch (numlinea) {
				case 1: restauranteAux.setNombre(linea); break;
				case 2: restauranteAux.setDireccion(linea); break;
				case 3: restauranteAux.setWeb(linea); break;
				case 4: restauranteAux.setFichaGoogle(linea); break;
				case 5: restauranteAux.setLatitud(Float.parseFloat(linea)); break;
				case 6: restauranteAux.setLongitud(Float.parseFloat(linea)); break;
				case 7: restauranteAux.setBarrio(linea); break;
				case 8:
				String[] especialidades = linea.split(",");
				List<String> lespecialidades = Arrays.asList(especialidades);
				restauranteAux.setEspecialidades(Arrays.asList(especialidades));
				
				lRestaurantes.add(restauranteAux);
				
				numlinea=0;
				restauranteAux = new Restaurante();
				break;
				}
				
			}
		
		return lRestaurantes;
		
	}

	public static void main(String[] args) throws IOException {
		//TODO Cargar la lista de restaurantes del fichero
		File file = new File(RUTA_FICHERO);
		if (file.exists())
		{
			System.out.println("FICHERO EXISTE!, a parsearlo");
			Path path = file.toPath();//Convierto a PATH para usar el nuevo API
			List<String> lineas = Files.readAllLines(path);
			List<Restaurante> listRest = cargarRestaurantes(lineas);
			System.out.println("La lista tiene " + listRest.size() + " restaurante");
		} else {
			System.out.println("NO EXISTE el fichero en esa ruta :(");
		}
		
	}
}

