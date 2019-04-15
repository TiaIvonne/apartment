
public class Client
{
    private String nationalId;
    private String clientName;
    private int deposit;
    private Apartment apartmentData;
    
    public Client (String r, String nombreC, int montoR, Apartment apartmentD)
    {
        nationalId = r;
        clientName= nombreC;
        deposit = montoR;
        apartmentData = apartmentD;
    }
    
    public Client (String ru, String nombreCl, int montoRe, String dire, int numeroP, double precioUf)
    {
        nationalId = ru;
        clientName = nombreCl;
        deposit = montoRe;
        apartmentData = new Apartment (dire, numeroP, precioUf);

    }
    
    //Accesadores
    
    public String getNationalId()
    {
        return nationalId;
    }
    public String getClientName()
    {
        return clientName;
    }
    public int getDeposit()
    {
        return deposit;
    }
    public Apartment getApartmentData()
    {
        return apartmentData;
    }
    
    //Mutadores
    public void setNationalId (String newNationalId)
    {
        nationalId = newNationalId;
    }
    public void setClientName (String newName)
    {
        clientName = newName;
    }
     public void setDeposit (int newDeposit)
    {
        deposit = newDeposit;
    }
    public void setApartmentData (Apartment newData)
    {
        apartmentData = newData;
    }
    
    //Customer
    
    public int finalPrice(int uf) //x valor de la UF
    {
        if( apartmentData.getFloorNumber() <= 3)
            return (int)Math.round(apartmentData.getPrice()*uf);
            else
            if (apartmentData.getFloorNumber()>= 4)
            return (int)Math.round((apartmentData.getPrice()+1)*uf);
            else
            return -1;
    }
    
    public int balance(int uf)
    {
        return finalPrice(uf)-deposit;
        
    }

    public String code()
    {
       
        String a = apartmentData.getAddress().substring(0,3);
        String b = nationalId.substring(3,5);
        String c = clientName.substring(clientName.length()-2);
        String d = a.concat(b);
        return d.concat(c);
    }
    
    
  
}
