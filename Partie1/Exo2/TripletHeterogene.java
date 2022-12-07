package Partie1.Exo2;

public class TripletHeterogene<T, K, U> {
  private T un;
  private K deux;
  private U trois;

  public TripletHeterogene(T un, K deux, U trois){
    this.un = un;
    this.deux = deux;
    this.trois = trois;
  }

  public T getPremier(){
    return un;
  }

  public K getSecond(){
    return deux;
  }

  public U getTroisieme(){
    return trois;
  }

  public void afficher(){
    System.out.println("<TripletHeterogene (" + un + ", " + deux + ", " + trois + ")>");
  }
}
  