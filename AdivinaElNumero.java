package juegos;

import javax.swing.JOptionPane;

public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0, n = 0;

		int eleccion = Integer.parseInt(JOptionPane
				.showInputDialog("Elija un juego: 1. Adivine el número aleatorio  2. Ingrese el número a adivinar"));

		switch (eleccion) {
		case 1:
			n = (int) (Math.random() * 100);
			if (n == 0) {
				n++;
			}
			num = Integer.parseInt(JOptionPane.showInputDialog("Iniciemos el juego. Adivine un número del 1 al 100:"));
			break;
		case 2:
			n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a adivinar:"));

			System.out.println("El número a adivinar se ha registrado con éxito");

			num = Integer.parseInt(JOptionPane.showInputDialog(
					"Iniciemos el juego. Ahora diga a su compañero que adivine el número registrado por usted:"));

			break;
		default:
			JOptionPane.showMessageDialog(null, "Opcion no valida");
			System.out.println("Opcion no valida");
			break;
		}

		while (num != n) {
			String nota = "";
			if (num > n) {
				nota = "El número " + num + " es mayor al número guardado";
			} else {
				nota = "El número " + num + " es menor al número guardado";
			}
			num = Integer.parseInt(JOptionPane.showInputDialog(nota + "\nIntente otra vez. Ingrese un nuevo número:"));
		}
		JOptionPane.showMessageDialog(null, "¡Correcto! El número guardado es: " + n);
		System.out.println("¡Correcto! El número guardado es: " + n);
	}
}
