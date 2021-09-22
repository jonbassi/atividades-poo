package fatec;



public class GerenciarJogo {

    public GerenciarJogo() {
    }

    public static void main(String[] args) {
	// write your code here
        Baralho baralho = new Baralho();
        baralho.montar();
        baralho.embaralhar();
        baralho.exibir();


    }
}
