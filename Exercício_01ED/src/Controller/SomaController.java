package Controller;

public class SomaController {
	public static SomaController somaController;

	public static int somaController(int x, int y) {
		if (y == 0)
			return x; //ponto de parada;
		
		return x +somaController(x,y-1); 

	}
}

		  