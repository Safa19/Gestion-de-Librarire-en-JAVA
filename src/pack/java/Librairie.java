package pack.java;
import java.util.*;
public class Librairie {
Vector <Livre> collection ;
String nom,adresse;
public Librairie(String a,String b)
{
	nom=a;
	adresse=b;
	collection= new Vector<Livre>();
	
	
}



public void info ()
{
	System.out.println("capacite : "+collection.capacity()+" - Taille: "+collection.size());
	for (int i=0; i<collection.size(); i++)
	{
		System.out.println(collection.get(i));
	}
}
public void addLivre(Livre L)
{
	
	if(collection.contains(L))
		System.out.println("le livre de"+L.getAuteur()+"existe deja");
	else
		collection.addElement(L);
}
public void deleteLivre(Livre L)
{

	if(!collection.contains(L))
		System.out.println("le livre de"+L.getAuteur()+"n'existe pas");
	else
		collection.removeElement(L);
}
public void deleteAll() {
	collection.removeAllElements();
	
}
}
