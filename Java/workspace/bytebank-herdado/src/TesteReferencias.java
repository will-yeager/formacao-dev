
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("William Jonathan");
		g1.setSalario(5000.0);
		
		Designer d1 = new  Designer();
		d1.setSalario(2000.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		
		controle.registra(d1);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(2500.0);
		
		controle.registra(ev1);
		
		System.out.println(controle.getSoma());
	}
	
}
