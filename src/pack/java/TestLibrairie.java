package pack.java;

public class TestLibrairie {

	public static void main(String[] args) {
		Livre [] lv= new Livre [100];
		lv[0]=new Livre (100,"Les miserables","Victor Hugo",100);
		lv[1]=new Livre (101,"Boukhala","al jahedh",300);
		lv[2]=new Livre (102,"Kalila w dimna","Ibn Mokafa",70);
		lv[3]=new Livre (103,"Cendrillon","Emile Jackobson",30);
		lv[0].setBest_seller(true);
		
		/*for(int i=0 ; i<Livre.getCount();i++)
		{
			System.out.println(lv[i]);
			}
		*/
		Librairie l= new Librairie("Four Star","Ariana");
		l.addLivre(lv[0]);
		l.addLivre(lv[1]);
		l.addLivre(lv[2]);
		l.addLivre(lv[3]);
		l.info();
		
	}
	

}
