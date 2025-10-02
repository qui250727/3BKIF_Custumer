 public class Customer
 {
     private String name;
     private int geld;
     
     public String getName()
     {
         return name;
     }
    
     public int getGeld()
     {
         return geld;
     }
     
     public Customer (String name, int geld)
     {
         setName(name);
         setGeld(geld);
     }
     
     public Customer()
     {
         setName("Max Mustermann");
         setGeld(1000);
     }
     
     public void setName (String name)
     {
         this.name = name;
     }
    
     public void setGeld (int geld)
     {
         this.geld = geld;
     }
    
     /*name: geld EUR - hat genug Geld
       Fritzt Muller : 0 EUR - hat kein Geld
       Susi Hansen: 500 EUR - hat Geld
     */
     public void printCustomer()
     {
        if (geld == 0)
        {
        System.out.println(name +" "+ geld + " EUR - " + "hat kein Geld" );
        }
        else
        {
        System.out.println(name +" "+ geld + " EUR - " + "hat Geld" );
        }
     }
    
     public String getVorname()
     {
        int spacevorname;
        spacevorname = name.indexOf(" ");
        return name.substring(0, spacevorname);
     }
    
     public String getNachname()
     {
         int spacenachname;
         spacenachname = name.indexOf(" ");
         return name.substring(spacenachname);
     }
     
     public String getNachnamevorname()
     {
         return getNachname()+ " " + getVorname();
     }
 
}