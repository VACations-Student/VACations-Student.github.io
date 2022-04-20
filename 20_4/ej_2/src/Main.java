import java.util.ArrayList;
import java.util.HashSet;
import java.io.IOException;

import stind.STIND;

public class Main 
{
	public static void main(String[] args) {
		STIND input = new STIND(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();
		int cant_numeros = 0;
		System.out.print("Cantidad de numeros: ");
		try {
			cant_numeros = input.read_int();
		}
		catch (IOException err) {
			err.printStackTrace();
		}
		for (int i = 0; i < cant_numeros; i++) {
			System.out.printf("Num %d: ", i+1);
			try {
				numeros.add(input.read_int());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

		HashSet<Integer> numerovich = new HashSet<>(numeros);

		ArrayList<Integer> numerardos = new ArrayList<>();
		int cant_numerardos = 0;
		System.out.print("Cantidad de numeros (2): ");
		try {
			cant_numerardos = input.read_int();
		}
		catch (IOException err) {
			err.printStackTrace();
		}
		for (int i = 0; i < cant_numerardos; i++) {
			System.out.printf("Num %d: ", i+1);
			try {
				numerardos.add(input.read_int());
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}

		HashSet<Integer> numerardosovich = new HashSet<>(numerardos);
		boolean iguales = true;
		for (Integer index : numerovich) {
			if (!numerardosovich.contains(index)) {
				iguales = false;
				break;

			}
		}

		if (iguales) 	{ System.out.println("Los ArrayList son iguales"); }
		else		{ System.out.println("Los ArrayList NO son iguales"); }
	}
}
