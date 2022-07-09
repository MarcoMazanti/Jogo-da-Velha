import java.util.Locale;
import java.util.Scanner;

import jogo.Mapa;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int y = 0,z = 1;
		Mapa x;
		x = new Mapa();
		
		do {
			System.out.println(x.mapa());
			
			System.out.println();
			System.out.println("--- Jogador 1 ---");
			System.out.println("Escolha qual número para colocar o seu símbolo!");
			do {
				y = 0;
				int loc = scan.nextInt();
				System.out.println();
				if (loc == 1) {
					if (x.a1 == '1') {
						x.a1 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 2) {
					if (x.a2 == '2') {
						x.a2 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 3) {
					if (x.a3 == '3') {
						x.a3 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 4) {
					if (x.b1 == '4') {
						x.b1 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 5) {
					if (x.b2 == '5') {
						x.b2 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 6) {
					if (x.b3 == '6') {
						x.b3 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 7) {
					if (x.c1 == '7') {
						x.c1 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 8) {
					if (x.c2 == '8') {
						x.c2 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 9) {
					if (x.c3 == '9') {
						x.c3 = 'X';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else {
					System.out.println("Você digitou um número acima da quantidade de slots para o seu símbolo.");
					System.out.println("Estes slots vão de 1 à 9, procure escolher algum destes números da próxima vez!");
					System.out.println("Digite novamente em que local deseja colocar o seu símbolo:");
					y = 1;
				}
			} while (y == 1);
			
			if (x.a1 == 'X' && x.a2 == 'X' && x.a3 == 'X') {
				x.vit = 1;
			} else if (x.b1 == 'X' && x.b2 == 'X' && x.b3 == 'X') {
				x.vit = 1;
			} else if (x.c1 == 'X' && x.c2 == 'X' && x.c3 == 'X') {
				x.vit = 1;
			} else if (x.a1 == 'X' && x.b1 == 'X' && x.c1 == 'X') {
				x.vit = 1;
			} else if (x.a2 == 'X' && x.b2 == 'X' && x.c2 == 'X') {
				x.vit = 1;
			} else if (x.a3 == 'X' && x.b3 == 'X' && x.c3 == 'X') {
				x.vit = 1;
			} else if (x.a1 == 'X' && x.b2 == 'X' && x.c3 == 'X') {
				x.vit = 1;
			} else if (x.a3 == 'X' && x.b2 == 'X' && x.c1 == 'X') {
				x.vit = 1;
			}
			if (x.a1 != '1' && x.a2 != '2' && x.a3 != '3' && x.b1 != '4' && x.b2 != '5' && x.b3 != '6' && x.c1 != '7' && x.c2 != '8' && x.c3 != '9') {
				x.vit = 3;
			}
			
			if (x.vit == 1) {
				System.out.println("Vitória de Jogador 1!!!"+ String.format("%n") + x.mapa());
				System.exit(0);
			} else if (x.vit == 3) {
				System.out.println("O jogo acabou!!!"+ String.format("%n")
				 +"O jogo de Empate!!!" + String.format("%n")
				  +x.mapa());
			}
			
			System.out.println(x.mapa());
			
			System.out.println();
			System.out.println("--- Jogador 2 ---");
			System.out.println("Escolha qual número para colocar o seu símbolo!");
			do {
				y = 0;
				int loc = scan.nextInt();
				System.out.println();
				if (loc == 1) {
					if (x.a1 == '1') {
						x.a1 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 2) {
					if (x.a2 == '2') {
						x.a2 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 3) {
					if (x.a3 == '3') {
						x.a3 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 4) {
					if (x.b1 == '4') {
						x.b1 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 5) {
					if (x.b2 == '5') {
						x.b2 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 6) {
					if (x.b3 == '6') {
						x.b3 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 7) {
					if (x.c1 == '7') {
						x.c1 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 8) {
					if (x.c2 == '8') {
						x.c2 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else if (loc == 9) {
					if (x.c3 == '9') {
						x.c3 = 'O';
					} else {
						System.out.println("Você digitou em um local já ocupado!!!");
						System.out.println("Escolha outro local para colocar!");
						y = 1;
					}
				} else {
					System.out.println("Você digitou um número acima da quantidade de slots para o seu símbolo.");
					System.out.println("Estes slots vão de 1 à 9, procure escolher algum destes números da próxima vez!");
					System.out.println("Digite novamente em que local deseja colocar o seu símbolo:");
					y = 1;
				}
			} while (y == 1);
			
			if (x.a1 == 'O' && x.a2 == 'O' && x.a3 == 'O') {
				x.vit = 2;
			} else if (x.b1 == 'O' && x.b2 == 'O' && x.b3 == 'O') {
				x.vit = 2;
			} else if (x.c1 == 'O' && x.c2 == 'O' && x.c3 == 'O') {
				x.vit = 2;
			} else if (x.a1 == 'O' && x.b1 == 'O' && x.c1 == 'O') {
				x.vit = 2;
			} else if (x.a2 == 'O' && x.b2 == 'O' && x.c2 == 'O') {
				x.vit = 2;
			} else if (x.a3 == 'O' && x.b3 == 'O' && x.c3 == 'O') {
				x.vit = 2;
			} else if (x.a1 == 'O' && x.b2 == 'O' && x.c3 == 'O') {
				x.vit = 2;
			} else if (x.a3 == 'O' && x.b2 == 'O' && x.c1 == 'O') {
				x.vit = 2;
			}
			if (x.a1 != '1' && x.a2 != '2' && x.a3 != '3' && x.b1 != '4' && x.b2 != '5' && x.b3 != '6' && x.c1 != '7' && x.c2 != '8' && x.c3 != '9') {
				x.vit = 3;
			}
			
			if (x.vit == 2) {
				System.out.println("Vitória de Jogador 2!!!"+ String.format("%n") + x.mapa());
				System.exit(0);
			} else if (x.vit == 3) {
				System.out.println("O jogo acabou!!!"+ String.format("%n")
				 +"O jogo de Empate!!!" + String.format("%n")
				  +x.mapa());
			}
		} while (z == 1);
		
		scan.close();
	}
}
