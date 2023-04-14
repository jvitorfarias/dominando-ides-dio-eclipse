package primeiro.programa.segunda.tentativa.java;

	import primeiro.programa.segunda.tentativa.model.Gato;

public class Primeiro_programa_java {
	
		public static void main(String[] args) {
	
			Gato gato = new Gato();
			Livros livros = new Livros();
			
			System.out.println(gato);
			System.out.println(livros);
			
			/*int a = 2;
			int b = 3;
			System.out.println("Hello World! " + (a+b));*/
			
		}
}

     /*Exemplo para mostrar como importar uma class dentro do mesmo arquivo(Ctrl + Shift + O);
  * Ao rodar o programa, as Strings são mostradas como código fonte, pois não foram instanciadas*/

class Livros {
	private String nome;
	private String npag;
}