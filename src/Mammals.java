//Alexandra Spanou


public class Mammals extends Animals
{
    private int months,embryos;
           
    public Mammals(String a1,String a2,String a3,String a4,String a5,int a6,int a7)
    {
    super(a1,a2,a3,a4,a5);//call of super constructor
    this.months=a6;
    this.embryos=a7;
    }
    
    int get_months(){return months;}
    
    public String toString()
    {
    return super.toString()+", Months of pregnacy : "+this.months+", Number of embryos : "+this.embryos;
    }
}
