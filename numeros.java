import javax.swing.JOptionPane;
public class numeros {
 
    public static void main(String[] args) {
 
    	int numero=0; 	
        do{
            String a=JOptionPane.showInputDialog("Introduce Número de 3 Cifras a");
            String b=JOptionPane.showInputDialog("Introduce Número de 3 Cifras b");
            String c=JOptionPane.showInputDialog("Introduce Número de 3 Cifras c");
            numero=Integer.parseInt(a);
            numero=Integer.parseInt(b);
            numero=Integer.parseInt(c);
        }while(numero<0);
 
        int contador=0;
        for (int i=numero;i>0;i/=10){          
            contador++; //Incremento el contador
        }
        //Controlamos en el caso de que haya una cifra o mas
        if (contador==1){
            System.out.println(
             "El numero"  +numero+ " tiene "+contador+" cifra");
            
            System.out.println(
                    "El numero"  +numero+ " tiene "+contador+" cifra");
            
            System.out.println(
                    "El numero"  +numero+ " tiene "+contador+" cifra");
            
        }else{
            System.out.println("El numero"  +numero+ " tiene "+contador+" cifras");
        }
 
    }
}
