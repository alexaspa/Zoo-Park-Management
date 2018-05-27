//Alexandra Spanou


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Zoo_Park
{
    public static void main(String[] args) 
    {   
        boolean found=false,answer=true;
        
        String [] categories=new String[]{"bird","reptile","mammal"};
        String [] menu=new String[]{"Search","Add","Delete","Size of list","Separation"};
        //creation of different types of animals
        Mammals wolf=new Mammals("mammal","Greece","23/07/2003","Thessaloniki","White wolf",9,3);
        Mammals wolf1=new Mammals("mammal","Greece","15/10/1989","Thessaloniki","Black wolf",9,2);
        Bird eagle=new Bird("bird","Germany","12/07/1975","Munich","eagle");
        Bird seagull=new Bird("bird","Germany","17/12/1990","Munich","seagull");
        Reptiles snake=new Reptiles("reptile","Italy","4/2/1998","Milan","cobra","yes");
        Reptiles snake1=new Reptiles("reptile","Italy","25/12/2010","Milan","anaconda","no");
        int months1=wolf.get_months();
        //list of the animals
        ArrayList<Animals> list = new ArrayList<>();
        //add the animals to list
        list.add(wolf);list.add(wolf1);list.add(eagle);list.add(seagull);list.add(snake);list.add(snake1);
        
        //System.out.println(wolf.toString()+"\n\n"+eagle.toString()+"\n\n"+snake.toString()+"\n\n"); 
       while(answer==true)
       {
       Object A1= JOptionPane.showInputDialog(null, "Choose : ", "MENU", JOptionPane.PLAIN_MESSAGE,null, menu,"");
       String CHOICE=(String) A1;//metatroph se string
       //=================================================
       //=================================================
       if(CHOICE.equals("Search"))
       {
       Object A = JOptionPane.showInputDialog(null, "Choose an animal species", "INFORMATION SEARCH", JOptionPane.PLAIN_MESSAGE,null, categories,"");
       String CHOICE2=(String) A;
       
       if( CHOICE2.equals("bird"))
       {
           String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal?","INFORMATION SEARCH",2);
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).get_origin().equals(a2))
               {   if(list.get(i).get_species().equals("bird"))
               {
                   System.out.println(" --- FOUND IN THE "+(i+1)+" POSITION OF THE ANIMAL'S LIST --- ");
                   System.out.println(list.get(i).toString()+"\n");
                   found=true;
               }
               }
           }
           
           if (found==false)
           { JOptionPane.showMessageDialog(null," SORRY ");}
       }
       
       if( CHOICE2.equals("reptile"))
       {
           String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal?","INFORMATION SEARCH",2);
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).get_origin().equals(a2))
               {   if(list.get(i).get_species().equals("reptile"))
               {
                   System.out.println(" --- FOUND IN THE "+(i+1)+" POSITION OF THE ANIMAL'S LIST --- ");
                   System.out.println(list.get(i).toString()+"\n");
                   found=true;
               }
               }
           }
           
           if (found==false)
           { JOptionPane.showMessageDialog(null," SORRY ");}
       } 
        
         if(CHOICE2.equals("mammal"))
       {
      
       String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","INFORMATION SEARCH",2);
       String a3=JOptionPane.showInputDialog(null,"Give the months of pregnancy for the animal.","INFORMATION SEARCH",2);
       int newa3=Integer.parseInt(a3);
       for(int i=0;i<list.size();i++)
        {
         if(list.get(i).get_origin().equals(a2)&& (months1==newa3) )
         {   if(list.get(i).get_species().equals("mammal"))
         {
             System.out.println(" --- FOUND IN THE "+(i+1)+" POSITION OF THE ANIMAL'S LIST --- ");
             System.out.println(list.get(i).toString()+"\n");
             found=true;
         }
         }
        
        }
        if (found==false)
         { JOptionPane.showMessageDialog(null," SORRY ");}
        
       }
        
       }// closing of 'if' for searching
       
       //=================================================
       //=================================================
       if(CHOICE.equals("Add"))
       {
           
       Object A = JOptionPane.showInputDialog(null, "Choose an animal species.", "STOIXEIA EISAGWGHS", JOptionPane.PLAIN_MESSAGE,null, categories,"");
       String CHOICE2=(String) A;
       
       if(CHOICE2.equals("bird"))
       {
       String a21=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","INPUT DATA",2);
       String a22=JOptionPane.showInputDialog(null,"Give the date of acquisition of the animal.","INPUT DATA",2);
       String a23=JOptionPane.showInputDialog(null,"Give the place of residence of the animal.","INPUT DATA",2);
       String a24=JOptionPane.showInputDialog(null,"Give the description of the animal.","INPUT DATA",2);
       
       Bird p1=new Bird(CHOICE2,a21,a22,a23,a24);
       list.add(p1);
       System.out.println("\n --- THE ANIMAL ADDED TO THE LIST --- ");
       System.out.println(p1.toString()+"\n");
       }
       
       
        if(CHOICE2.equals("reptile"))
       {
       String a21=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","INPUT DATA",2);
       String a22=JOptionPane.showInputDialog(null,"Give the date of acquisition of the animal.","INPUT DATA",2);
       String a23=JOptionPane.showInputDialog(null,"Give the place of residence of the animal.","INPUT DATA",2);
       String a24=JOptionPane.showInputDialog(null,"Give the description of the animal.","INPUT DATA",2);
       String a25=JOptionPane.showInputDialog(null,"Is it poisonous?","INPUT DATA",2);
       
       Reptiles p1=new Reptiles(CHOICE2,a21,a22,a23,a24,a25);
       list.add(p1);
       System.out.println("\n --- THE ANIMAL ADDED TO THE LIST --- ");
       System.out.println(p1.toString()+"\n");
       }
        
        if(CHOICE2.equals("mammal"))
       {
       String a21=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","INPUT DATA",2);
       String a22=JOptionPane.showInputDialog(null,"Give the date of acquisition of the animal.","INPUT DATA",2);
       String a23=JOptionPane.showInputDialog(null,"Give the place of residence of the animal.","INPUT DATA",2);
       String a24=JOptionPane.showInputDialog(null,"Give the description of the animal.","INPUT DATA",2);
       String a25=JOptionPane.showInputDialog(null,"Give the months of pregnancy for the animal.",9);
       String a26=JOptionPane.showInputDialog(null,"Give the number of the animal's embryos.","INPUT DATA",2);
       int newa25=Integer.parseInt(a25);
       int newa26=Integer.parseInt(a26);
       
       Mammals p1=new Mammals(CHOICE2,a21,a22,a23,a24,newa25,newa26);
       list.add(p1);
       System.out.println("\n --- THE ANIMAL ADDED TO THE LIST --- ");
       System.out.println(p1.toString()+"\n");
       }
        
       }// closing of 'if' for adding
       
       //=================================================
       //=================================================
       if(CHOICE.equals("Delete"))
       {
           
       Object A = JOptionPane.showInputDialog(null, "Choose an animal species.", "DELETE DATA", JOptionPane.PLAIN_MESSAGE,null, categories,"");
       String CHOICE2=(String) A;
       
       if( CHOICE2.equals("pthno"))
       {
           String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","DELETE DATA",2);
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).get_origin().equals(a2))
               {   if(list.get(i).get_species().equals("bird"))
               {
                   System.out.println("\n --- THE ANIMAL DELETED FROM THE LIST --- ");
                   System.out.println(list.get(i).toString()+"\n");
                   list.remove(list.get(i));
                   found=true;
               }
               }
           }
           
           if (found==false)
           { JOptionPane.showMessageDialog(null," There is not an animal!! ");}
       }
       
       if( CHOICE2.equals("reptile"))
       {
           String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","DELETE DATA",2);
           for(int i=0;i<list.size();i++)
           {
               if(list.get(i).get_origin().equals(a2))
               {   if(list.get(i).get_species().equals("reptile"))
               {
                   System.out.println("\n --- THE ANIMAL DELETED FROM THE LIST --- ");
                   System.out.println(list.get(i).toString()+"\n");
                   list.remove(list.get(i));
                   found=true;
               }
               }
           }
           
           if (found==false)
           { JOptionPane.showMessageDialog(null," There is not an animal!! ");}
       } 
        
         if(CHOICE2.equals("mammal"))
       {
      
       String a2=JOptionPane.showInputDialog(null,"Give the country of origin of the animal.","DELETE DATA",2);
       String a3=JOptionPane.showInputDialog(null,"Give the months of pregnancy for the animal.","DELETE DATA",2);
       int newa3=Integer.parseInt(a3);
       for(int i=0;i<list.size();i++)
        {
         if(list.get(i).get_origin().equals(a2)&& (months1==newa3) )
         {   if(list.get(i).get_species().equals("mammal"))
         {
             System.out.println("\n --- THE ANIMAL DELETED FROM THE LIST --- ");
             System.out.println(list.get(i).toString()+"\n");
             list.remove(list.get(i));
             found=true;
         }
         }
        
        }
        if (found==false)
         { JOptionPane.showMessageDialog(null," There is not an animal!! ");}
        
       }
        
       }// closing of 'if' for deleting
       
       //=================================================
       //=================================================
       if(CHOICE.equals("Size of list"))
       {
       
       System.out.println("The size of the list is : "+list.size()+"\n");
       
       }//closing of 'if' for the size of the list
       
       //=================================================
       //=================================================
       
       if(CHOICE.equals("Separation"))
       {
        ArrayList<Bird> list1 = new ArrayList<>();
         ArrayList<Reptiles> list2 = new ArrayList<>();
          ArrayList<Mammals> list3 = new ArrayList<>();
       
          for(int i=0;i<list.size();i++)
          {
          if(list.get(i)instanceof Bird){list1.add((Bird) list.get(i));}
          if(list.get(i)instanceof Reptiles){list2.add((Reptiles) list.get(i));}
          if(list.get(i)instanceof Mammals){list3.add((Mammals) list.get(i));}
          
         
          }
          System.out.println("\n --- SEPARATION TO 3 LISTS --- ");
          System.out.println("  BIRDS  ");
          for(int i=0;i<list1.size();i++)
          System.out.println(list1.get(i).toString());
          System.out.println("  REPTILES  ");
          for(int i=0;i<list2.size();i++)
          System.out.println(list2.get(i).toString());
          System.out.println("  MAMMALS  ");
          for(int i=0;i<list3.size();i++)
          System.out.println(list3.get(i).toString());
          
       } //closing of 'if' for separation
       
       
       
       
       
       
}//while closing
    }
    
}
