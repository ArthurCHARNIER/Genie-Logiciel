package fr.ufrsciencestech.panier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //VueGSwing vue = new VueGSwing();
        VueGAWT vue2 = new VueGAWT();
       //vue.setVisible(true);
       Panier p = new Panier(20);
       
       p.ajouter(new Orange ("France",0.80));
       p.ajouter(new Orange ("France",0.80));       
       p.ajouter(new Orange ("Espagne",0.80));
       p.ajouter(new Orange ("Floride",0.90));
       p.ajouter(new Orange ("France",0.80));
              System.out.println(p.toString());

       //System.out.println(());
       //p.retire();
       //System.out.println(p.toString());

       
       /*Orange o1 = new Orange("Auxerre", 0.90);
       Orange o2 = new Orange("Auxerre", 0.90);
       Orange o3 = new Orange("Gemeaux", 0.80);

       
       
       p.boycottOrigine("France");
       
       System.out.println(p.toString());

       System.out.println("test : "+o1.equals(o2));*/
       

       
    }
}
