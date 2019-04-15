
import java.util.Scanner;

public class Main{
   public static void main(String []args)
   {
    Client client = null;
    String     address;
    int        floor;
    double     price;
    String     nationalID;
    String     clientName;
    int        deposit;
    
    int menuOptions;
    menuOptions = 0;
    Scanner keyboard = new Scanner(System.in);
   
       do{
          System.out.println("MAIN MENU");
          System.out.println("1. Create client");
          System.out.println("2. Show data");
          System.out.println("3. Price, amount, code");
          System.out.println("4. Exit");
          menuOptions = keyboard.nextInt();

           switch(menuOptions){
                case 1: //create client
                do{
                  System.out.println("type address");
                  address = Leer.dato();
                }while (address.length()<5);
                
                do{
                  System.out.println("type address number");
                  floor = Leer.datoInt();
                }while(floor<1);
                
                do{
                  System.out.println("type price in uf");
                  price = Leer.datoDouble();
                }while (price<=1250);
                
                do{
                  System.out.println("type national ID");
                  nationalID = Leer.dato();
                }while(nationalID.length()<10);
              
                do{
                  System.out.println("type client name");
                  clientName = Leer.dato();
                }while(clientName.length()<=4);
                
                do{
                  System.out.println("type deposit in uf");
                  deposit = Leer.datoInt();
                }while(deposit<0);
                
                client = new Client (nationalID, clientName, deposit, new Apartment (address, floor, price));
  
               break;

               case 2: //show data
               if ( client == null)
      
                  System.out.println("You didn't create a client");
                  else
                  System.out.println("client national ID:" + client.getNationalId());
                  System.out.println("client name:" + client.getClientName());
                  System.out.println("client deposit:" + client.getDeposit());
                  System.out.println("client address:" + client.getApartmentData().getAddress());
                  System.out.println("client floor:" + client.getApartmentData().getFloorNumber());
                  System.out.println("apartment price:" + client.getApartmentData().getPrice());

               break;

               case 3: //price. amount, code
                 if ( client == null)
                    System.out.println("You didn't create a client");
                  else{
                    int uf; //
                  do{
                    System.out.println ("type uf value in chilean peso");
                    uf = Leer.datoInt();
                  }while (uf < 1);
                
                 System.out.println("apartment total price:" + client.finalPrice(uf));
                 System.out.println("balance pending:" + client.balance(uf));
                 System.out.println("ID:" + client.code());
            }
            break;
            }
        }while (menuOptions <=4);
    }
}
