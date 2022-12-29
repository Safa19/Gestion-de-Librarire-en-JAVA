package pack.java;

public class Livre {
private int id;
private String titre ;
private String auteur ;
private int nbp ;
private boolean best_seller;
private static int count ;
public Livre (int id , String titre , String auteur , int nbp)
{
	this.id=id;
	this.titre=titre;
	this.auteur=auteur;
	this.nbp=nbp;
	count++;
}
public double calculerprix ()
{
	double total ;
	if(best_seller)
	total=(nbp*0.3)+10;
	else
		total= nbp*0.3;
	return total;
}
public Livre ()
{
	this(0,"Titre inconnu","auteur inconnu",0);
}

public boolean isBest_seller() {
	return best_seller;
}
public void setBest_seller(boolean best_seller) {
	this.best_seller = best_seller;
}
@Override

public String toString ()
{
	return "Livre["+this.id+" : "+this.titre +" de " +this.auteur+" coute "+this.calculerprix()+"dinars]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public int getNbp() {
	return nbp;
}
public void setNbp(int nbp) {
	this.nbp = nbp;
}
public static int getCount() {
	return count;
}
}
