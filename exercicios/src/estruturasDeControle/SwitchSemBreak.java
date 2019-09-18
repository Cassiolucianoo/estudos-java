package estruturasDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "verde";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o bassai-dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian yodan");
		case "laranja":
			System.out.println("Sei o Heian sandan");
		case "vermelho":
			System.out.println("Sei o Heian nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		
		}
	System.out.println("Fim");
	}

}
