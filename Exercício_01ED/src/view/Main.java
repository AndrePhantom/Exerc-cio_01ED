package view;

import Controller.SomaController;
 

public class Main {

	public static void main(String[] args) {
		SomaController.somaController = new SomaController();

		
		int x = 7;
		int y = 10;

		int result = somaController(x, y);

		System.out.println(result);

	}

	private static int somaController(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}

