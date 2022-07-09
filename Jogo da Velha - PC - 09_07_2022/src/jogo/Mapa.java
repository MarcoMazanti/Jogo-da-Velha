package jogo;

public class Mapa {

	public char a1 = '1', a2 = '2', a3 = '3', b1 = '4', b2 = '5', b3 = '6', c1 = '7', c2 = '8', c3 = '9';
	public int vit;
	
	public String mapa() {
		return 
		 "     │     │     "+ String.format("%n")
		+"  "+a1+"  │  "+a2+"  │  "+a3+"  "+ String.format("%n")
		+"     │     │     "+ String.format("%n")
		+"-----+-----+-----"+ String.format("%n")
		+"     │     │     "+ String.format("%n")
		+"  "+b1+"  │  "+b2+"  │  "+b3+"  "+ String.format("%n")
		+"     │     │     "+ String.format("%n")
		+"-----+-----+-----"+ String.format("%n")
		+"     │     │     "+ String.format("%n")
		+"  "+c1+"  │  "+c2+"  │  "+c3+"  "+ String.format("%n")
		+"     │     │     "+ String.format("%n");
	}
}
