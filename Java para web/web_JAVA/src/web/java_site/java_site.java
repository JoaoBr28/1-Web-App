package web.java_site;

public class java_site {


    public static void main (String [] args) {

      String primeiroNome = "joao";
      String segundoNome ="Sousa";
      String nomeCompleto = nomeCompleto (primeiroNome , segundoNome);
         System.out.println(nomeCompleto);
        //insercao de dados com comportamento  final//

      int maiorDeIdade = 18;
      //int menorDeIdade = 17;
         if (maiorDeIdade <18)  
             System.out.println("Menor De Idade ");
         else if (maiorDeIdade == 17)
             System.out.println( "Menor de Idade ");
         else
             System.out.println("Maior De Idade");
           //Sistema de Idade            
    }
    //metodo principal main//

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Nome Completo do Cliente " + primeiroNome.concat(" ").concat(segundoNome);

    }
    // metodo de string comportamento de leitura//

    


        
        
    
    
}

