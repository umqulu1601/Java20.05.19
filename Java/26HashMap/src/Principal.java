import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		
		//Criar um HashMap
		HashMap<String, String> paises=new HashMap <String, String> ();
		
		//Adicionar elementos ao HashMap
		paises.put("Jap�p", "T�quio");
		paises.put("Brasil", "Bras�lia");
		paises.put("Argentina", "Buenos Aires");
		
		//Obter dados atrav�s da chave
		System.out.println(paises.get("Brasil"));
		
		//Remover Item
		paises.remove("Jap�p");
		
		//Remover todos
		paises.clear();
		
		//Selecionar todos os pa�ses
		System.out.println(paises);
	}

}