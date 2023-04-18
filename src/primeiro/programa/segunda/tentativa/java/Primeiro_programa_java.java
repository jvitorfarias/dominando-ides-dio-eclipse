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

     /*Example to show how to import a class within the same file (Ctrl + Shift + O);
    * When running the program, the Strings are shown as source code, as they were not instantiated*/

class Livros {
	private String nome;
	private String npag;
}