public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Luis Ricardo" + "Barnabe Joenck";

        System.out.println(nomeCompleto);//Imprimi nome completo

        String concatenacao ="?"; 
        
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1"; 
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1; 
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1"; 
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1; 
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1); 
        
        System.out.println(concatenacao);

        int numero = 5;

        System.out.println(- numero);//Não altera a variavel numero para -5

        System.out.println(numero + " Variavel numero continua 5");//Pode ver que continua 5

        numero = - numero; //Altera a variavel numero para -5

        System.out.println(numero + " Variavel numero agora é -5");//Pode ver que agora é -5

        numero = numero * -1; //Altera a variavel numero para 5 novamente

        System.out.println(numero + " Variavel positiva novamente");//Pode ver que agora é 5
        
    }
}
