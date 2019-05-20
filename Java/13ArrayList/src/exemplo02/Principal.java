package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Curso01
			Cursos c1= new Cursos();
		c1.setNomeCurso("Java");
		c1.setAreaCurso("Java");
		c1.setValorCursos(2300);
		
		//Curso02
			Cursos c2= new Cursos();
		c2.setNomeCurso("C#");
		c2.setAreaCurso("Desenvolvimento");
		c2.setValorCursos(1900);
		
		//Curso03
			Cursos c3= new Cursos();
		c3.setNomeCurso("Photoshop");
		c3.setAreaCurso("Gráfica");
		c3.setValorCursos(600);
		
		//ArrayList
			ArrayList<Cursos> cursos= new ArrayList<Cursos>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
			
		//Listar
			for(int i = 0; i<cursos.size(); i++) {
		System.out.println(cursos.get(i).getNomeCurso());
		}
	}
}
