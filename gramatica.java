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
		System.out.println(comando);
		String[] comandoseparado=comando.split(" ");
        
		if (comandoseparado.length >= 3) {
			
			switch (comandoseparado[0]+" "+comandoseparado[1]+" "+comandoseparado[2]){
			
				case "separe as silabas":
				System.out.println("Separando "+comandoseparado[3]);
				break;
							
				
			}
		
		}
       
	}
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

}
