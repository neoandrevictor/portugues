import java.text.Normalizer;



public class gramatica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comando= javax.swing.JOptionPane.showInputDialog("Olá, digite o comando:");
		comando=comando.toLowerCase();
		comando=removerAcentos(comando);
		String[] comandoseparado=comando.split(" ");
        
		if (comandoseparado.length >= 3) {
			
			switch (comandoseparado[0]+" "+comandoseparado[1]+" "+comandoseparado[2]){
			
				case "separe as silabas":
				System.out.println("Separando "+comandoseparado[3]);
				String palavraseparada=separeassilabas(comandoseparado[3]);
				System.out.println(palavraseparada);
				break;
				
				default:
				System.out.println("Comando não reconhecido");
				
			}
		
		}else{
			System.out.println("Comando não reconhecido");
		}

	}
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	public static String separeassilabas(String palavraseparada) {
		
		
		String[] palavraseparadasplit=palavraseparada.split("");
		
		String vosoante=vogalouconsoante(palavraseparadasplit[0]);
		
		
		for (int i=1 ; i<palavraseparadasplit.length ;i++){
			
			
			
			if (i>1){
				
				String vosoanteatual=vogalouconsoante(palavraseparadasplit[i]);
				
				if (vosoante!=vosoanteatual) {
				
					palavraseparada=palavraseparada+palavraseparadasplit[i];
					
				}else{
				
					palavraseparada=palavraseparada+"-"+palavraseparadasplit[i];
					
				}
					
			}else{	
				
				 palavraseparada=palavraseparadasplit[i];
				
				
			}
			
			 
			
		}
			
	    return (palavraseparada);
	}
	
	
	public static String vogalouconsoante(String letra){
		
		
		letra=letra.toLowerCase();
		letra=removerAcentos(letra);

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
			letra="v";
		}else {
			letra="c";
		}

	return (letra);	
		
	}
}
