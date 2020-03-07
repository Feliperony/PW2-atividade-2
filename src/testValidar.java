
public class testValidar {
	
	public static void main(String[] args) {
					
	String CPF = "47617807627";
	
	if (Cliente.ehCPFValido(CPF) == true)
        System.out.printf("%s ,CPF Valido !!\n", Cliente.imprimeCPF(CPF));
     else System.out.printf("Erro, CPF invalido !!!\n");
	
	
	
	}



}

