package testeInteiros.app;

import testeInteiros.entities.Aluno;

public class Main {
	/*Main é o método auto-executável do Java*/
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Rafael");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Media Aluno = "+String.format("%.2f",aluno1.getMedia()));
		
		
		
	
	}

}
