package fr.ufrsciencestech.panier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private VueGSwing vgs;
    private VueGAWT vga;
    
    public VueGSwing getVueGS()
    {
        return vgs;
    }
    public VueGAWT getVueGA()
    {
        return vga;
    }
    
    public void setVueGS(VueGSwing vgs)
    {
        this.vgs=vgs;
    }
    
    public void setVueGA(VueGAWT vga)
    {
        this.vga=vga;
    }
    
    
    public static void main( String[] args )
    {
       /*ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       App app = (App)context.getBean("App");*/
       //
       //VueGAWT vue2 = new VueGAWT();
       //vue.setVisible(true);
       Panier p = new Panier(20);
       /*VueConsole vc = new VueConsole();
       p.addObserver(vc);*/
       
       
       //vue graphique
       /*VueGSwing vg = new VueGSwing();
       
       Controleur c = new Controleur();
       c.setPanier(p);
       c.setVueGS(vg);
       p.addObserver(vg);
       vg.addControleur(c);*/
       
       /*VueGAWT vga = new VueGAWT();
       Controleur c2 = new Controleur();
       c2.setPanier(p);
       c2.setVueGA(vga);
       p.addObserver(vga);
       vga.addControleur(c2);*/
       
       //VueGSwing vue = new VueGSwing();
       
       p.ajouter(new Orange ("France",0.80));
       p.ajouter(new Orange ("France",0.80));       
       p.ajouter(new Orange ("Espagne",0.80));
       p.ajouter(new Orange ("Floride",0.90));
       p.ajouter(new Orange ("France",0.80));
       System.out.println(p.toString());
       
       System.out.println(p.getPrix());

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
