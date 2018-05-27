//Alexandra Spanou


public class Reptiles extends Animals
{
    private String poisonous;
    
    public Reptiles(String a1,String a2,String a3,String a4,String a5,String a6)
    {
    super(a1,a2,a3,a4,a5);//call of super constructor
    this.poisonous=a6;
    }
    
     public String toString()
    {
    return super.toString()+", Poisonous : "+this.poisonous;
    }
}
