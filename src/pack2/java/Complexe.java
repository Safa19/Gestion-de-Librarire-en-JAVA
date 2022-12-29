package pack2.java;

public class Complexe {
private int re , imag;
private int indice;
static int count;
public Complexe(int re, int imag) 
{
	this.re = re;
	this.imag = imag;
}
public Complexe conjuge ()
{
	return (new Complexe (re,-imag));
}
@Override
public String toString()
{
	if (imag==0)
		return("z"+indice+"="+re);
	else if (imag>0)
		if (imag==1)
		return("z"+indice+"="+re+"i");
		else
			return("z"+indice+"="+re+"+"+imag+"i");	
	else
		if (imag==-1)
			return("z"+indice+"="+re+"-i");
		else
			return("z"+indice+"="+re+imag+"i");	
}
public int getRe() {
	return re;
}
public void setRe(int re) {
	this.re = re;
}
public int getImag() {
	return imag;
}
public void setImag(int imag) {
	this.imag = imag;
}
public int getIndice() {
	return indice;
}
public void setIndice(int indice) {
	this.indice = indice;
}
public static int getCount() {
	return count;
}

}
