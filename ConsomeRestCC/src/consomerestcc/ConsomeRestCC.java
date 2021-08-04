/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consomerestcc;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;

/**
 *
 * @author rodri
 */
public class ConsomeRestCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao;
        WebResource wr;
        String response;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite qual operação deseja fazer: \n 1-soma \n 2-divisao \n 3-subtracao \n 4-multiplicacao");
        
        opcao = entrada.nextInt();
                System.out.println("Agora digite os valores");
                Scanner soma = new Scanner(System.in);
                System.out.println("Numero 1: ");
                int num1 = soma.nextInt();

                System.out.println("Numero 2: ");
                int num2 = soma.nextInt();

                Client c = Client.create();
        switch(opcao){
            case 1:
                 wr = c.resource("http://localhost:44861/WebCCRest2/webresources/calculadora/soma/"+num1 +"," +num2);
                response = wr.get(String.class);
                System.out.println("A soma dos valores são: "+response);
                break;
                
            case 2:
                wr = c.resource("http://localhost:44861/WebCCRest2/webresources/calculadora/divisao/"+num1 +"," +num2);      
                response = wr.get(String.class);
                System.out.println("A divisao dos valores são: "+response);
                break;
 
            case 3:
                wr = c.resource("http://localhost:44861/WebCCRest2/webresources/calculadora/subtracao/"+num1 +"," +num2);      
                response = wr.get(String.class);
                System.out.println("A subtracao dos valores são: "+response);
                break;
 
            case 4:
                wr = c.resource("http://localhost:44861/WebCCRest2/webresources/calculadora/multiplicacao/"+num1 +"," +num2);      
                response = wr.get(String.class);
                System.out.println("A multiplicacao dos valores são: "+response);
                break;
 
                
            default:
                System.out.println("Digite SOMENTE opções entre 1 e 4");
                break;
        }
        

    }
    
}
