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

		System.out.println(numerovich);
	}
}
