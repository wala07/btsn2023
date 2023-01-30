public class essai {

    private static int count;
   private int ID ;
   private String marque ;
   private int vitesse ;
   private int puissance ;

    public essai (String marque, int vitesse, int puissance) {



        this.ID=++count ;
        this.marque= marque ;
        this.puissance= puissance ;
        this.vitesse= vitesse ;

    }

    public String getMarque() {
        return marque;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getPuissance() {
        return puissance;
    }
    public void  afficher () {

        System.out.println("la voiture va se constituer des "+ID+ "\n"  +ID +"\n"+marque+"\n"+puissance  );
    }





}
