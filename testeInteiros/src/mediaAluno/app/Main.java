package mediaAluno.app;

import mediaAluno.entities.Aluno;

public class Main {
	/*Main é o método auto-executável do Java*/
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Rafael");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome: "+aluno1.getNome());
		
		System.out.println("Notas : "+aluno1.getNota1()+" | "+aluno1.getNota2()+" | "+aluno1.getNota3()+" | "+aluno1.getNota4());
		
		System.out.println("Media Aluno = "+String.format("%.2f",aluno1.getMedia()));
		
		System.out.println("Situação do Aluno:  "+(aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setNome("Flavia");
		aluno2.setNota1(55);
		aluno2.setNota2(47.5);
		aluno2.setNota3(33);
		aluno2.setNota4(80.7);
		
		System.out.println("Nome: "+aluno2.getNome());
		
		System.out.println("Notas: "+aluno2.getNota1()+" | "+aluno2.getNota2()+" | "+aluno2.getNota3()+" | "+aluno2.getNota4());
		
		System.out.println("Media Aluno = "+String.format("%.2f",aluno2.getMedia()));
		
		System.out.println("Situacao do Aluno: "+(aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		System.out.println("----------------------------------------------------------------------------");
		
		Aluno aluno3 = new Aluno();
		
		aluno3.setNome("Emilie");
		aluno3.setNota1(77);
		aluno3.setNota2(95);
		aluno3.setNota3(84);
		aluno3.setNota4(67);
		
		System.out.println("Nome: "+aluno3.getNome());
		
		System.out.println("Notas: "+aluno3.getNota1()+" | "+aluno3.getNota2()+" | "+aluno3.getNota3()+" | "+aluno3.getNota4());
		
		System.out.println("Media Aluno: "+String.format("%.2f", aluno3.getMedia()));
		
		System.out.println("Situacao do Aluno: "+(aluno3.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
	
	}

}
