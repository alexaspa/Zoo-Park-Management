//Alexandra Spanou


public abstract class Animals 
{
    private String species,origin,date,residence,description;
    
    String get_species(){return species;}
    
    String get_origin(){return origin;}
    
    public Animals(String a1,String a2,String a3,String a4,String a5) //super constructor
    {
     this.species=a1;
     this.origin=a2;
     this.date=a3;
     this.residence=a4;
     this.description=a5;
    }
    
    
   public String toString()
    {
    return "Species of animal : "+this.species+", Country of origin : "+this.origin+", Date of acquisition : "+this.date+"\n"+
            "Residence : "+this.residence+", Brief Description : "+this.description;
    
    }
    
    
}
