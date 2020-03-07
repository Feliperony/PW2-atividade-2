import java.util.Date;

public class testValidar {
	
	public static void main(String[] args) {
		
	Cliente clie = new Cliente();
	clie.Nome = "Rony";
	clie.CPF = "47617807627";
	clie.Nascimento = new Date();
	

	if (Cliente.ehCPFValido(clie.CPF) == true)
        System.out.printf("%s ,CPF Valido !!\n", Cliente.imprimeCPF(clie.CPF));
     else System.out.printf("Erro, CPF invalido !!!\n");
	
	
	
	}



}

