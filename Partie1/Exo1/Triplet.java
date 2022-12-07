package Partie1.Exo1;

public class Triplet<T>  {
  private T un, deux, trois;

  public Triplet(T un, T deux, T trois) {
    this.un = un;
    this.deux= deux;
    this.trois = trois;
  }

  public T getPremier(){
    return un;
  }

  public T getSecond(){
    return deux;
  }

  public T getTroisieme(){
    return trois;
  }

  public void afficher(){
    System.out.println("<Triplet (" + un + ", " + deux + ", " + trois + ")>");
  }
}