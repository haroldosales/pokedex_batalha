package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bs = 0;
		int level = 0;
		int iv = 0;
		int ev = 0;
		int bs02 = 0;
		int level02 = 0;
		int hp201 = 0;
		int iv02 = 0;
		int ev02 = 0;
		int hp01 = 0;
		List<Integer> poke1 = new ArrayList<>();
		List<Integer> poke2 = new ArrayList<>();

		System.out.println("Digite seu pokemon");
		String poke01 = sc.next();
		level = sc.nextInt();
		while (!(level >= 1 && level <= 99)) {
			System.out.println("Digite Novamente o level");
			level = sc.nextInt();
			break;

		}
		for (int i = 1; i < 5; i++) {
			bs = sc.nextInt();
			while (!(bs >= 1 && bs <= 255)) {
				System.out.println("Digite Novamente o BS");
				bs = sc.nextInt();
				break;

			}

			iv = sc.nextInt();
			while (!(iv >= 1 && iv <= 15)) {
				System.out.println("Digite Novamente o IV");
				iv = sc.nextInt();
				break;

			}
			ev = sc.nextInt();
			while (!(ev >= 1 && ev <= 262140)) {
				System.out.println("Digite Novamente o ev");
				ev = sc.nextInt();
				break;

			}
			hp01 = (int) (iv + bs + Math.sqrt(ev) / 8 + 50) * level + 10 / 50;

			poke1.add(hp01);

		}
		System.out.println("Digite seu pokemon");

		String poke02 = sc.next();

		level02 = sc.nextInt();
		while (!(level02 >= 1 && level02 <= 99)) {
			System.out.println("Digite Novamente o level");
			level02 = sc.nextInt();
			break;

		}
		for (int i = 1; i < 5; i++) {
			bs02 = sc.nextInt();
			while (!(bs02 >= 1 && bs02 <= 255)) {
				System.out.println("Digite Novamente o BS");
				bs02 = sc.nextInt();
				break;

			}
			iv02 = sc.nextInt();
			while (!(iv02 >= 1 && iv02 <= 15)) {
				System.out.println("Digite Novamente o IV");
				iv02 = sc.nextInt();
				break;

			}
			ev02 = sc.nextInt();
			while (!(ev02 >= 1 && ev02 <= 262140)) {
				System.out.println("Digite Novamente o ev");
				ev02 = sc.nextInt();
				break;

			}
			hp201 = (int) (iv02 + bs02 + Math.sqrt(ev02) / 8 + 50) * level02 + 10 / 50;
			poke2.add(hp201);
		}

		int s0 = (int) (iv + poke1.get(0) + Math.sqrt(ev) / 8 + 50) * level + 5 / 50;
		int s1 = (int) (iv + poke1.get(1) + Math.sqrt(ev) / 8 + 50) * level + 5 / 50;
		int s2 = (int) (iv + poke1.get(2) + Math.sqrt(ev) / 8 + 50) * level + 5 / 50;
		int s3 = (int) (iv + poke1.get(3) + Math.sqrt(ev) / 8 + 50) * level + 5 / 50;

		int a0 = (int) (iv02 + poke2.get(0) + Math.sqrt(ev02) / 8 + 50) * level02 + 5 / 50;
		int a1 = (int) (iv02 + poke2.get(1) + Math.sqrt(ev02) / 8 + 50) * level02 + 5 / 50;
		int a2 = (int) (iv02 + poke2.get(2) + Math.sqrt(ev02) / 8 + 50) * level02 + 5 / 50;
		int a3 = (int) (iv02 + poke2.get(3) + Math.sqrt(ev02) / 8 + 50) * level02 + 5 / 50;

		int ponto1 = 0;
		int ponto2 = 0;
		int cont = 0;
		for (int i = 0; i < 3; i++) {

			if (poke1.get(i) > poke2.get(i)) {

				ponto1 = ponto1 + 1;

			}
			if (poke2.get(i) > poke1.get(i)) {

				ponto2 = ponto2 + 1;
				break;
			}

			if (s3 > a3) {
				ponto1 = ponto1 + 1;

			} else {
				ponto2 = ponto2 + 1;
			}
			cont = cont + i;
		}

		System.out.println("Pokemon: " + poke01 + "  nivel " + level);
		System.out.println("HP:  " + s0);
		System.out.println("AT:  " + s1);
		System.out.println("DF:  " + s2);
		System.out.println("SP: 	 " + s3);
		System.out.println("Pokemon: " + poke02 + "  nivel " + level02);
		System.out.println("HP: " + a0);
		System.out.println("AT: " + a1);
		System.out.println("DF: " + a2);
		System.out.println("SP: " + a3);

		if (ponto1 > ponto2) {
			System.out.println("Batalha acaba em " + cont + " Turnos, " + "Vencedor: " + poke01);

		} else {
			System.out.println("Batalha acaba em " + cont + " Turnos, " + "Vencedor: " + poke02);

		}
	}

}
