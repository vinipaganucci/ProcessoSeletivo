public class Teste {

	public static void main(String[] args) {
		
		Candidato[] candidatos =  new Candidato[5];
		String[] selecionados = new String[5];
		
		
		candidatos[0] = new Candidato("Vinicius Vidotto",Math.round(Math.random() * 3000));
		candidatos[1] = new Candidato("José Antônio",Math.round(Math.random() * 3000));
		candidatos[2] = new Candidato("Carlos Augusto",Math.round(Math.random() * 3000));
		candidatos[3] = new Candidato("Paulo Souza",Math.round(Math.random() * 3000));
		candidatos[4] = new Candidato("Vitor Pereira",Math.round(Math.random() * 3000));
		
		
		for (int i = 0; i < candidatos.length; i++) {
			
			if (candidatos[i].getSalarioProposto() < 2000) {
				selecionados[i] = candidatos[i].getNome();
			}
			
		}
		
		System.out.println("Selecionados:");
		for (int i = 0; i < selecionados.length; i++) {
			
			if (selecionados[i] == null) {
				continue;
			}
			System.out.println("==> " + selecionados[i]);
		}
		

	}

}