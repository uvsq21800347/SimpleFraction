public class Fraction {
	int Numerateur;
	int Denominateur;
	
	public Fraction(int Numerateur, int Denominateur)
	{
		this.Numerateur = Numerateur;
		this.Denominateur = Denominateur;
	}
	
	public void affiche()
	{
		System.out.print(this.Numerateur + "/" + this.Denominateur);
	}
}
