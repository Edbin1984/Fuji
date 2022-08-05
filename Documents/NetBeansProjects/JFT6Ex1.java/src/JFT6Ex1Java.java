
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class JFT6Ex1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean permit = false;
       int valor = 0;
        short respuesta;
        short respuesta2;
        while (valor <=5)
        {       
        Scanner entrada = new Scanner(System.in);
        System.out.println("If You have a valid permit to travel press (1) if No press (0) ");
        respuesta = entrada.nextShort();
        if(respuesta == 1)
        {
        System.out.println("Are you going to the trip? press (1) for Yes or (0) for No");
            respuesta2 = entrada.nextShort();
        if(respuesta2 == 1)
        {
        valor ++;
        System.out.println("Quantity of  People already in list\n"+valor);
        if(valor == 10)
        {System.out.println("The people is complet");
        break;
        }
        }
          else
                  
        {
          System.out.println("Thank you press to continue");
        }
            
        }
                
        else
        {System.out.println("You do not have permit to travel");}
        
    }}
    
}
